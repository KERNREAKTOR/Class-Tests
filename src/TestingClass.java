import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.*;
import java.util.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class TestingClass {

    public static void main(String[] args) throws IOException, ParserConfigurationException, SAXException, TransformerException {

        System.out.println("Entpacke die -> Libs/Items/Mechs/Mechs.xml");
        Document docMechsXML = DocumentBuilderFactory.newInstance()
                .newDocumentBuilder().parse(ZipExtractor.extractFile("H:\\Programme\\Steam\\steamapps\\common\\MechWarrior Online\\Game\\GameData.pak", "Libs/Items/Mechs/Mechs.xml"));
        docMechsXML.getDocumentElement().normalize();

        NodeList mechNodes = docMechsXML.getElementsByTagName("Mech");

        HashSet<String> listChassis = new HashSet<>();
        List<String> listMechNames = new ArrayList<>();
        List<String> listShortMechNames = new ArrayList<>();
        HashMap<String, String> mechChassie = new HashMap<>();
        List<MechDatabase> mechDatabases = new ArrayList<>();
        String curStr;
        System.out.println("Hole die Chassie und Mechsnamen");
        int curi = 1;

        for (int i = 0; i < mechNodes.getLength(); i++) {
            Element xmlMechList = (Element) mechNodes.item(i);

            listChassis.add(xmlMechList.getAttribute("chassis"));
            curStr = xmlMechList.getAttribute("name");
            listMechNames.add(curStr);
            listShortMechNames.add(curStr);
            mechDatabases.add(new MechDatabase(xmlMechList.getAttribute("id"), xmlMechList.getAttribute("faction"), xmlMechList.getAttribute("chassis"), xmlMechList.getAttribute("name")));

        }

        System.out.println("Entpacke die -> Localization/English/TheRealLoc.xml");

        Document docTheRealLocXML = DocumentBuilderFactory.newInstance()
                .newDocumentBuilder().parse(ZipExtractor.extractFile("H:\\Programme\\Steam\\steamapps\\common\\MechWarrior Online\\Game\\Localized\\English_xml.pak", "Localization/English/TheRealLoc.xml"));
        docTheRealLocXML.getDocumentElement().normalize();

        NodeList dataXML = docTheRealLocXML.getElementsByTagName("Data");

        System.out.println("Hole die Langen Mechnamen");

        for (int i = 0; i < dataXML.getLength(); i++) {

            Element xmlDataMechList = (Element) dataXML.item(i);
            curStr = xmlDataMechList.getTextContent().toLowerCase();
            //Langer Name des Mechs
            if (listMechNames.contains(curStr)) {
                xmlDataMechList = (Element) dataXML.item(i + 1);
                updateLongName(mechDatabases, curStr, xmlDataMechList.getTextContent());
            }

            //Kurzer Name des mechs)
            for (String name : listShortMechNames) {
                if (Objects.equals(name + "_short", curStr)) {
                    xmlDataMechList = (Element) dataXML.item(i + 1);
                    updateShortName(mechDatabases, name, xmlDataMechList.getTextContent());
                    listShortMechNames.remove(name);
                    break;
                }
            }

            //Chassienamen
            if (listChassis.contains(xmlDataMechList.getTextContent())) {
                curStr = xmlDataMechList.getTextContent();
                xmlDataMechList = (Element) dataXML.item(i + 1);
                mechChassie.put(curStr, xmlDataMechList.getTextContent());
            }
        }

        //*****************************************
        //Uncommit only when all chassis extraccted
        //unpackChassis(listChassis, curi);
        //*****************************************

        System.out.println("speichern der AllMechsChassis.xml...");
        XmlWriter xmlWriterChassis = new XmlWriter();
        xmlWriterChassis.addMechChassis(mechChassie);
        xmlWriterChassis.save("C:\\Temp\\mwo\\AllMechsChassis.xml");

        System.out.println("Lese als *:MDF-Dateien aus...");
        int i = 1;
        for (MechDatabase mechData : mechDatabases) {
            System.out.println("[" + i + "/" + mechDatabases.size() + "] Objects/mechs/" + mechData.getMechChassie() + "/" + mechData.getMechName() + ".mdf");
            Document doc2 = DocumentBuilderFactory.newInstance()
                    .newDocumentBuilder().parse(new File("C:\\Temp\\mwo\\Objects\\mechs\\" + mechData.getMechChassie() + "\\" + mechData.getMechName() + ".mdf"));
            //Objects\mechs\adder\adder.cdf
            doc2.getDocumentElement().normalize();

            NodeList mechNodes2 = doc2.getElementsByTagName("Mech");
            for (int a = 0; a < mechNodes2.getLength(); a++) {
                Element xmlMechList2 = (Element) mechNodes2.item(a);

                String mechMaxTons = xmlMechList2.getAttribute("MaxTons");
                String mechBaseTons = xmlMechList2.getAttribute("BaseTons");
                String mechMaxJumpJets = xmlMechList2.getAttribute("MaxJumpJets");
                String mechMinEngineRating = xmlMechList2.getAttribute("MinEngineRating");
                String mechMaxEngineRating = xmlMechList2.getAttribute("MaxEngineRating");
                String mechVariantType;

                if (xmlMechList2.hasAttribute("VariantType")) {
                    mechVariantType = xmlMechList2.getAttribute("VariantType");

                } else {
                    mechVariantType = "Standard";
                }
                updateMechinfo(mechDatabases, mechData.getMechName(), mechVariantType, mechMaxJumpJets, mechBaseTons, mechMaxTons, mechMinEngineRating, mechMaxEngineRating);
            }
            mechNodes2 = doc2.getElementsByTagName("Component");
            int mechECM = 0;
            int mechHP = 0;
            int mechSlots = 0;
            for (int a = 0; a < mechNodes2.getLength(); a++) {
                Element xmlMechList2 = (Element) mechNodes2.item(a);

                mechHP = mechHP + Integer.parseInt(xmlMechList2.getAttribute("HP"));
                mechSlots = mechSlots + Integer.parseInt(xmlMechList2.getAttribute("Slots"));
                if (xmlMechList2.hasAttribute("CanEquipECM")) {
                    mechECM = mechECM +Integer.parseInt( xmlMechList2.getAttribute("CanEquipECM"));
                }

            }
            updateComponents(mechDatabases, mechData.getMechName(),mechECM,mechHP,mechSlots);

            i = i + 1;
        }

        System.out.println("speichern in der XML-Datei");
        XmlWriter xmlWriter = new XmlWriter();
        xmlWriter.addDatabase(mechDatabases);
        xmlWriter.save("C:\\Temp\\mwo\\AllMechs.xml");
        System.out.println(listChassis);
        System.out.println(listMechNames);
        //System.out.println(listMechLongNames);
        // System.out.println(listMechShortNames);
        System.out.println(mechChassie);

        //ZipExtractor.extract("H:\\Programme\\Steam\\steamapps\\common\\MechWarrior Online\\Game\\mechs\\adder.pak","C:\\Temp\\mwo");
    }

    private static void unpackChassis(HashSet<String> listChassis, int curi) {
        System.out.println("entpacke Mechchassies...");
        for (String mechChassi : listChassis) {
            System.out.println("[" + curi + "/" + listChassis.size() + "] " + mechChassi + ".pak");
            ZipExtractor.extract("H:\\Programme\\Steam\\steamapps\\common\\MechWarrior Online\\Game\\mechs\\" + mechChassi + ".pak", "C:\\Temp\\mwo\\");
            curi = curi + 1;

        }
    }

    public static void updateShortName(List<MechDatabase> objects, String name, String newShortname) {
        for (MechDatabase obj : objects) {
            if (Objects.equals(obj.getMechName(), name)) { // Wenn das Objekt mit dem Namen gefunden wurde
                if (obj.getMechShortName() == null) {
                    obj.setMechShortName(newShortname);
                }
                break; // Schleife beenden, da das Objekt gefunden und geändert wurde
            }
        }
    }

    public static void updateLongName(List<MechDatabase> objects, String name, String newLongname) {
        for (MechDatabase obj : objects) {
            if (Objects.equals(obj.getMechName(), name)) { // Wenn das Objekt mit dem Namen gefunden wurde
                if (obj.getMechLongName() == null) {
                    obj.setMechLongName(newLongname);
                }
                break; // Schleife beenden, da das Objekt gefunden und geändert wurde
            }
        }
    }

    public static void updateMechinfo(List<MechDatabase> objects, String name, String mechVariantType, String mechMaxJumpJets,
                                      String mechBaseTons, String mechMaxTons, String mechMinEngineRating, String mechMaxEngineRating) {
        for (MechDatabase obj : objects) {
            if (Objects.equals(obj.getMechName(), name)) { // Wenn das Objekt mit dem Namen gefunden wurde
                if (obj.getMechBaseTons() == null) {
                    obj.setMechVariantType(mechVariantType);
                    obj.setMechMaxTons(mechMaxTons);
                    obj.setMechBaseTons(mechBaseTons);
                    obj.setMechMaxJumpJets(mechMaxJumpJets);
                    obj.setMechMinEngineRating(mechMinEngineRating);
                    obj.setMechMaxEngineRating(mechMaxEngineRating);
                }
                break; // Schleife beenden, da das Objekt gefunden und geändert wurde
            }
        }
    }

    public static void updateComponents(List<MechDatabase> objects, String name, Integer ECM, Integer HP, Integer slots) {
        for (MechDatabase obj : objects) {
            if (Objects.equals(obj.getMechName(), name)) { // Wenn das Objekt mit dem Namen gefunden wurde
                if (obj.getMechECM() == null) {
                    obj.setMechECM(ECM);
                    obj.setMechHP(HP);
                    obj.setMechSlots(slots);
                }
                break; // Schleife beenden, da das Objekt gefunden und geändert wurde
            }
        }
    }

    public static void extract(String zipFilePath, String destDir) {

        byte[] buffer = new byte[1024];

        try {
            // Erstelle das Zielverzeichnis, falls es nicht existiert
            File destDirectory = new File(destDir);
            if (!destDirectory.exists()) {
                destDirectory.mkdir();
            }

            // Erstelle eine ZipInputStream-Instanz, um die Zip-Datei zu lesen
            ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(zipFilePath));

            // Iteriere durch alle Einträge in der Zip-Datei
            ZipEntry zipEntry = zipInputStream.getNextEntry();
            while (zipEntry != null) {
                String fileName = zipEntry.getName();
                System.out.println(fileName);
                if (fileName.endsWith(".mdf")) { // nur Dateien mit der Erweiterung ".mdf" extrahieren
                    System.out.println(fileName);
                    File newFile = new File(destDir + File.separator + fileName);

                    // Erstelle alle Ordner in der Datei, falls sie nicht existieren
                    new File(newFile.getParent()).mkdirs();

                    // Schreibe den Eintrag in die Datei
                    FileOutputStream outputStream = new FileOutputStream(newFile);
                    int len;
                    while ((len = zipInputStream.read(buffer)) > 0) {
                        outputStream.write(buffer, 0, len);
                    }
                    outputStream.close();
                }
                zipEntry = zipInputStream.getNextEntry();
            }

            // Schließe den ZipInputStream
            zipInputStream.closeEntry();
            zipInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
