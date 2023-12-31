package L5_networking;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {

    public static void main(String[] args)  {
        try( ServerSocket serverSocket = new ServerSocket(4711)) {

           Socket clientConnection = serverSocket.accept();
           System.out.println("IP-Address of client"+clientConnection.getInetAddress());
                serverSocket.close();

            OutputStream os = clientConnection.getOutputStream();
            os.write("Hello Client, this is the server".getBytes());

            os.flush();
            os.close();

        } catch (IOException e) {
            System.out.println("Fehler beim Erzeugen des ServerSockets: " + e.getMessage());
        }



    }

}
