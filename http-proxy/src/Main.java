import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Properties;

public class Main {

    public static void main(String[] args) throws Exception {
        System.out.println("--------- START -----------");

        System.out.println("**** HTTP START ***");
        http();
        System.out.println("**** HTTP END ***");

        System.out.println("**** HTTPS START ***");
        https();
        System.out.println("**** HTTPS END ***");

        System.out.println("-------- END ----------");
    }

    private static void https() throws IOException {
        String url = "https://www.google.com/";
        URL server = new URL(url);
        HttpURLConnection connection = (HttpURLConnection)server.openConnection();
        connection.connect();
        InputStream in = connection.getInputStream();

        connection.disconnect();
    }

    private static void http() throws IOException {
        String url = "http://www.google.com/";
        URL server = new URL(url);
//        Properties systemProperties = System.getProperties();
//        systemProperties.setProperty("http.proxyHost",proxy);
//        systemProperties.setProperty("http.proxyPort",port);
        HttpURLConnection connection = (HttpURLConnection)server.openConnection();
        connection.connect();
        InputStream in = connection.getInputStream();

        connection.disconnect();
    }
}
