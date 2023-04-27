import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class StripChatReader {
    private static final String ACCEPT = "*/*";
    private static final String ENCODING = "gzip, deflate, br";
    private static final String LANGUAGE = "de-DE,de;q=0.9,en-US;q=0.8,en;q=0.7";
    private static final String CONNECTION = "keep-alive";
    private static final String HOST = "de.stripchat.com";
    private static final String USER_AGENT = "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.9; rv:31.0) Gecko/20100101 Firefox/31.0";
    public String getGoalAmount() {
        return goalAmount;
    }

    public void setGoalAmount(String goalAmount) {
        this.goalAmount = goalAmount;
    }

    private String goalAmount;
    public StripChatReader(String url) throws IOException {
        InputStream inputStream = new URL(url).openStream();
        try (inputStream) {
            JsonElement json = JsonParser.parseReader(new java.io.InputStreamReader(inputStream, StandardCharsets.UTF_8));
            JsonObject jsonObject = json.getAsJsonObject();
            String data = jsonObject.get("data").getAsString();
            System.out.println(data);
        }
        Document doc = null;
        try {

            doc = Jsoup.connect("https://de.stripchat.com/Cinamon_tits")
                    .get();

        } catch (Exception e) {
            setGoalAmount("Unbekannt");
            System.out.println(e.getMessage());
        }

        // Wählen Sie das Element mit der Klasse "profile-meta__heading__item ignoreTranslate" aus
        assert doc != null;
        setGoalAmount(getResult(doc, "span.goal-amount"));

    }
    private static String getResult(Document doc, String filter) {
        Elements elements;
        elements = doc.select(filter);
        String result = null;

        // Überprüfen Sie, ob das Element gefunden wurde, und extrahieren Sie den Namen
        if (elements.size() > 0) {
            Element element = elements.first();
            assert element != null;
            result = element.text();
        }
        return result;
    }

    private static String getStringBuilder(String url) throws IOException {
        // HTML-Datei herunterladen
        HttpURLConnection con = (HttpURLConnection) new URL(url).openConnection();
        con.setRequestMethod("GET");
        con.setConnectTimeout(10000);
        con.setReadTimeout(10000);
        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        StringBuilder content = new StringBuilder();
        String inputLine;
        while ((inputLine = in.readLine()) != null) {
            content.append(inputLine);
        }
        in.close();
        con.disconnect();
        return content.toString();
    }
}
