import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class XmlWriter {

    private static Document doc;

    private DocumentBuilderFactory docFactory;
    private DocumentBuilder docBuilder;
    private static Element rootElement;

    public XmlWriter() throws ParserConfigurationException {
        docFactory = DocumentBuilderFactory.newInstance();
        docBuilder = docFactory.newDocumentBuilder();
        doc = docBuilder.newDocument();


        rootElement = doc.createElement("MechList");
        doc.appendChild(rootElement);
    }

    public void save(String filePath) throws TransformerException {
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        transformerFactory.setAttribute("indent-number", 2); // Einrückung um 2 Stellen
        Transformer transformer = transformerFactory.newTransformer();
        transformer.setOutputProperty(OutputKeys.INDENT, "yes"); // Einrückung aktivieren
        DOMSource source = new DOMSource(doc);

        StreamResult result = new StreamResult(new File(filePath));
        transformer.transform(source, result);
    }

    public static void main(String[] args) {

        //addElement(doc, "hunchback", "hbk-4g", "", "", rootElement);

        // write the content into xml file


    }

    public void addDatabase(List<MechDatabase> mechDatabase) {


        for (MechDatabase obj : mechDatabase) {
            Element mech = doc.createElement("Mech");
            mech.setAttribute("id", obj.getMechId());
            mech.setAttribute("faction", obj.getMechFaction());
            mech.setAttribute("chassis", obj.getMechChassie());
            mech.setAttribute("name", obj.getMechName());
            mech.setAttribute("shortname", obj.getMechShortName());
            mech.setAttribute("longname", obj.getMechLongName());
            mech.setAttribute("VariantType", obj.getMechVariantType());
            mech.setAttribute("MaxTons", obj.getMechMaxTons());
            mech.setAttribute("BaseTons", obj.getMechBaseTons());
            mech.setAttribute("MaxJumpJets", obj.getMechMaxJumpJets());
            mech.setAttribute("MinEngineRating", obj.getMechMinEngineRating());
            mech.setAttribute("MaxEngineRating", obj.getMechMaxEngineRating());
            //mech.setAttribute("CanEquipECM", obj.getMechECM().toString());
            mech.setAttribute("HP", obj.getMechHP().toString());
            //mech.setAttribute("Slots", obj.getMechSlots().toString());

            rootElement.appendChild(mech);
        }
    }
    public void addMechChassis(HashMap<String, String> mechChassie) {
        for (Map.Entry<String, String> entry : mechChassie.entrySet()) {
            String chassie = entry.getKey();
            String inGameChassieName = entry.getValue();
            Element mech = doc.createElement("Mech");
            mech.setAttribute("chassis", chassie);
            mech.setAttribute("ingamechassis", inGameChassieName);
            rootElement.appendChild(mech);
        }
    }

    public static void addElement(String mechChassie, String MechName, String mechFaction, String mechVariantType,
                                  String mechId, String mechMaxTons, String mechBaseTons, String mechMaxJumpJets,
                                  String mechMinEngineRating, String mechMaxEngineRating) {
        // mech elements
        Element mech = doc.createElement("Mech");
        mech.setAttribute("id", mechId);
        mech.setAttribute("faction", mechFaction);
        mech.setAttribute("chassis", mechChassie);
        mech.setAttribute("name", MechName);
        mech.setAttribute("VariantType", mechVariantType);
        mech.setAttribute("MaxTons", mechMaxTons);
        mech.setAttribute("BaseTons", mechBaseTons);
        mech.setAttribute("MaxJumpJets", mechMaxJumpJets);
        mech.setAttribute("MinEngineRating", mechMinEngineRating);
        mech.setAttribute("MaxEngineRating", mechMaxEngineRating);
        rootElement.appendChild(mech);
    }
}
