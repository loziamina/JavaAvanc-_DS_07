package jsp.playerchessjavadst;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class Networking {
    public static String fetchGameState() {
        try {
            URL url = new URL("http://localhost:8080/game/state");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            Scanner scanner = new Scanner(conn.getInputStream());
            return scanner.hasNext() ? scanner.nextLine() : "No Response";
        } catch (Exception e) {
            return "Error connecting to server";
        }
    }
}
