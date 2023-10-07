package E5_networking.Client;

import E5_networking.GUI.ClientController;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class TCP_Client {
    private static boolean stopClient = false;


    private static OutputStream clientOutputStream;
     private static boolean sendMessages = false;
     private static String sendMessage;


    public static void stopClient() {
        stopClient = true;
    }

    public static void clientRuntime(int PortNumber) throws Exception {
        System.out.println("Client started");
        try (Socket connectionToServer = new Socket("localhost", PortNumber)) {
            System.out.println("Client connected to server");
            clientOutputStream = connectionToServer.getOutputStream();



                    System.out.println("Entered send Messages Statement While Loop ");
                    clientOutputStream.write(sendMessage.getBytes());


                    InputStream is = connectionToServer.getInputStream();
                    byte[] b = new byte[1000];
                    int bytesRead = is.read(b);

                    ClientController.setTxt_messagesFromServer(new String(b, 0, bytesRead));



        } catch (IOException e) {
            System.out.println("Fehler beim Erzeugen des ServerSockets: " + e.getMessage());
        } finally {
            try {
                if (clientOutputStream != null) {
                    clientOutputStream.close();
                }
            } catch (IOException e) {
                System.out.println("Error while closing clientOutputStream: " + e.getMessage());
            }
        }
        System.out.println("Exited Method Client Runtime");
    }


    public static void sendToServer(String message) {
        sendMessage = message;
        sendMessages = true;
    }

}// Class end
