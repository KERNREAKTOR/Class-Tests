import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Objects;

public class MechInmages {
    static boolean urlExists(java.lang.String URL) {
        java.net.URL url;

        try {
            url = new URL(URL);
        } catch (MalformedURLException e) {
            System.out.println(e.getMessage());
            return false;
        }
        try {
            url.openStream().close();
            return true;
        } catch (IOException e) {
            System.out.printf(e.getMessage());
            return false;
        }
    }

    public static void download(String url, String mechName, String chassie) {
        try {
            // Wähle den Speicherort für die Datei aus
//            FileChooser fileChooser = new FileChooser();
//            fileChooser.setTitle("Speichern Sie die Datei");
//            fileChooser.setInitialFileName("datei.pdf");
//            fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("PDF-Dateien", "*.pdf"));
//            java.io.File file = fileChooser.showSaveDialog(null);

            String folderPath = "C:\\Temp\\mwo\\" + chassie;

            // Erstelle den Ordnerpfad, wenn er nicht existiert
            File folder = new File(folderPath );
            if (!folder.exists()) {
                boolean success = folder.mkdirs();
                if (!success) {
                    System.out.println("Ordner konnte nicht erstellt werden.");
                }
            }

            // Erstelle eine Datei im Ordner
            String filePath = folderPath + "\\" + mechName + ".jpg";
            File file = new File(filePath);
            try {
                boolean success = file.createNewFile();
                if (success) {
                    System.out.println("Datei erfolgreich erstellt.");
                } else {
                    System.out.println("Datei konnte nicht erstellt werden.");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }


            // Öffne eine Verbindung zur URL
            URL urlObj = new URL(url);
            InputStream inputStream = urlObj.openStream();

            // Lese die Datei und speichere sie im ausgewählten Pfad
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = inputStream.read(buffer)) > 0) {
                fileOutputStream.write(buffer, 0, length);
            }

            // Schließe die Streams
            inputStream.close();
            fileOutputStream.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(Objects.requireNonNull(MechIdInfo.class.getResourceAsStream("MechList.xml")));
        doc.getDocumentElement().normalize();
        NodeList mechNodes = doc.getElementsByTagName("Mech");
        String myURl = "https://static.mwomercs.com/img/theme/mechbay/thumbnails/";

        for (int i = 0; i < mechNodes.getLength(); i++) {
            Element xmlMechList = (Element) mechNodes.item(i);
            if (urlExists(myURl + xmlMechList.getAttribute("name") + ".jpg")) {
                System.out.println("🟢 [" + i + "/" + mechNodes.getLength() + "]" + xmlMechList.getAttribute("name"));
                download(myURl + xmlMechList.getAttribute("name") + ".jpg", xmlMechList.getAttribute("name"), xmlMechList.getAttribute("chassis"));

            } else {
                System.out.println("🔴");
            }
        }
        //https://static.mwomercs.com/img/theme/mechbay/thumbnails/ach-primei.jpg

    }
}
