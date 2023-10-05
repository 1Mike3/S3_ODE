package L5_networking.src;

import java.net.InetAddress;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class HostnameMain {
    public static void main(String[] args) throws Exception{
       String hostname = "www.technikum-wien.at";
       InetAddress inetTechnikum = InetAddress.getByName(hostname);
       InetAddress inetTechnikumIP = InetAddress.getByName("www.technikum-wien.at");
      // inetTechnikum.getHostAddress();
        System.out.println("IP-Adressen Name " + ": " + inetTechnikumIP.getHostName());
       System.out.println("IP-Adresse  " +  ": " + inetTechnikum.getHostAddress());



        }
    }
