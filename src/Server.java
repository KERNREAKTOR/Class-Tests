import javafx.application.Application;
import javafx.stage.Stage;

import java.net.ServerSocket;
import java.net.Socket;

public class Server extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Erstelle einen Server-Socket auf Port 8000
        ServerSocket serverSocket = new ServerSocket(8000);
        System.out.println("Server läuft auf Port 8000");

        // Warte auf eingehende Verbindungen von Clients
        while (true) {
            Socket socket = serverSocket.accept();
            System.out.println("Neue Verbindung von " + socket.getInetAddress().getHostAddress());

            // Erstelle einen neuen Thread für die Verbindung mit dem Client
            Thread clientThread = new Thread(() -> {
                // Hier können Sie die Verbindung mit dem Client behandeln
                // z.B. Lesen und Schreiben von Daten über den Socket
                // oder andere Aktionen ausführen
            });
            clientThread.start();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
