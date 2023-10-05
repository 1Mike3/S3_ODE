package L5_networking.src;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPClien {
    public static void main (String[] args)  {

        try (DatagramSocket socket = new DatagramSocket(4790)){

            String message = "exit";;
            byte[] buffer = message.getBytes();
            InetAddress host = InetAddress.getLocalHost();
            DatagramPacket packet = new DatagramPacket(buffer, buffer.length, host, 4777);
            socket.send(packet);



        }catch (IOException e){
            System.out.println("Fehler beim Erzeugen des ServerSockets: " + e.getMessage());
        }


    }
}
