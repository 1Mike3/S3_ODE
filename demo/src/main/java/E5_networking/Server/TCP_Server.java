package E5_networking.Server;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

import SantasLittleHelper.Helpers;

public class TCP_Server {

    public static void main(String[] args) {
        if(Helpers.DEBUG)
             System.out.println("Server started");

        try (ServerSocket serverSocket = new ServerSocket(4711)) {
            while (true) {
                Socket clientConnection = serverSocket.accept();

                if(Helpers.DEBUG)
                    System.out.println("IP-Address of client: " + clientConnection.getInetAddress());

                handleClient(clientConnection);
                clientConnection.close();
            }
        } catch (IOException e) {
            System.out.println("Fehler beim Erzeugen des ServerSockets: " + e.getMessage());
        }
    }

    private static void handleClient(Socket clientConnection) {
        if(Helpers.DEBUG)
            System.out.println("Method handleClient() called");
        try (OutputStream os = clientConnection.getOutputStream();
             InputStream is = clientConnection.getInputStream()) {

            UserInterfaceServer(os, is);

        } catch (IOException e) {
            System.out.println("Error while handling client: " + e.getMessage());
        }
    }

    private static void UserInterfaceServer(OutputStream clientOutputStream, InputStream clientInputStream) {
        Scanner scanner = new Scanner(System.in);
        byte[] b = new byte[1000];


        while (true) {
            if(Helpers.DEBUG)
                System.out.println("I am waiting for messages from the client: ");

            try {
                int bytesRead = clientInputStream.read(b);
               if (bytesRead == -1) {
                  //System.out.println("Client has closed the connection.");
                  break;
                  }
                System.out.println("Received from client: " + new String(b, 0, bytesRead) + "\n");

               String response = "I Have Received Your Message: " + new String(b, 0, bytesRead) + "\n";
               clientOutputStream.write(response.getBytes());

            } catch (IOException e) {
                System.out.println("Error while reading server message: " + e.getMessage());
                break;
            }
        }
    }
}
