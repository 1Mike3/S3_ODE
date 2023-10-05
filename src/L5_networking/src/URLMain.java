package L5_networking.src;

import java.net.HttpURLConnection;
import java.net.URL;

public class URLMain {

    public static void main(String[] args) throws Exception {
        String address = "http://www.technikum-wien.at";
        URL url = new URL(address);
        System.out.println("Protocol: " + url.getProtocol());
        System.out.println("Host: " + url.getHost());

        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        url.openConnection();
        con.setDoOutput(true);
        con.setRequestMethod("GET");
        con.connect();

    }

}
