import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class ZipExtractor {

    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException, TransformerException {
        Document doc = DocumentBuilderFactory.newInstance()
                .newDocumentBuilder().parse(new File("H:\\Programme\\Steam\\steamapps\\common\\MechWarrior Online\\Game\\Mech IDs\\Mechs.xml"));
        doc.getDocumentElement().normalize();
        String mechDes = "C:\\Temp\\mwo\\Objects\\mechs\\";

        XmlWriter xmlWriter = new XmlWriter();
        NodeList mechNodes = doc.getElementsByTagName("Mech");

        for (int i = 0; i < mechNodes.getLength(); i++) {
            Element xmlMechList = (Element) mechNodes.item(i);
            String mechId  = xmlMechList.getAttribute("id");
            String mechName = xmlMechList.getAttribute("name");
            String chassie = xmlMechList.getAttribute("chassis");
            String mechFaction = xmlMechList.getAttribute("faction");

            Document doc2 = DocumentBuilderFactory.newInstance()
                    .newDocumentBuilder().parse(new File(mechDes + "\\" + chassie + "\\" + mechName + ".mdf"));
            doc2.getDocumentElement().normalize();

            NodeList mechNodes2 = doc2.getElementsByTagName("Mech");
            for (int a = 0; a < mechNodes2.getLength(); a++) {
                Element xmlMechList2 = (Element) mechNodes2.item(a);

                String mechMaxTons = xmlMechList2.getAttribute("MaxTons");
                String mechBaseTons = xmlMechList2.getAttribute("BaseTons");
                String mechMaxJumpJets = xmlMechList2.getAttribute("MaxJumpJets");
                String mechMinEngineRating = xmlMechList2.getAttribute("MinEngineRating");
                String mechMaxEngineRating = xmlMechList2.getAttribute("MaxEngineRating");

                if (xmlMechList2.hasAttribute("VariantType")) {
                    String mechVariantType = xmlMechList2.getAttribute("VariantType");

                    XmlWriter.addElement(chassie,mechName,mechFaction,mechVariantType,mechId,mechMaxTons,mechBaseTons,mechMaxJumpJets,mechMinEngineRating,mechMaxEngineRating);
                } else {
                    XmlWriter.addElement(chassie,mechName,mechFaction,"Standard",mechId,mechMaxTons,mechBaseTons,mechMaxJumpJets,mechMinEngineRating,mechMaxEngineRating);
                }
            }
        }
        xmlWriter.save("C:\\Temp\\mwo\\allmechs.xml");
    }

    public static File extractFile(String zipFilePath, String filenameToExtract) {

        byte[] buffer = new byte[1024];
        String destDir = "C:\\Temp\\" ;
        File newFile = null;

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
                if (fileName.equals(filenameToExtract)) { // nur Dateien mit der Erweiterung ".mdf" extrahieren

                     newFile = new File(destDir + File.separator + fileName);

                    // Erstelle alle Ordner in der Datei, falls sie nicht existieren
                    new File(newFile.getParent()).mkdirs();

                    // Schreibe den Eintrag in die Datei
                    FileOutputStream outputStream = new FileOutputStream(newFile);
                    int len;
                    while ((len = zipInputStream.read(buffer)) > 0) {
                        outputStream.write(buffer, 0, len);
                    }
                    outputStream.close();
                   
                    break;
                }
                zipEntry = zipInputStream.getNextEntry();
            }

            // Schließe den ZipInputStream
            zipInputStream.closeEntry();
            zipInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return newFile;
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
                if (fileName.endsWith(".mdf")) { // nur Dateien mit der Erweiterung ".mdf" extrahieren

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
