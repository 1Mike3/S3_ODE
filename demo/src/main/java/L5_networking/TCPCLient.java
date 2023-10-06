package L5_networking;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class TCPCLient {
    public static void main(String[] args) throws Exception {
      try (  Socket connectionToServer = new Socket("localhost", 4711)){
          System.out.println("Client connected to server");
          InputStream is = connectionToServer.getInputStream();
          byte b[] = new byte[1000];
          int bytes = is.read(b);
          System.out.println("Received from server: " + new String(b, 0, bytes));


      }catch (IOException e){
          System.out.println("Fehler beim Erzeugen des ServerSockets: " + e.getMessage());
      }
    }
}
