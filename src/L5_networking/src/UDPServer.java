package L5_networking.src;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPServer {

    public static void main(String[] args) {
     try (DatagramSocket socket = new DatagramSocket((4777)))   {

         while (true){
             byte[] buffer = new byte[1000];
             DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
             socket.receive(packet);
             buffer = packet.getData();
             if( new String(buffer).trim().equals("exit"))
                 break;
             System.out.println("Received from client: " + new String(buffer, 0, packet.getLength()));


         }

     } catch (SocketException e) {
         throw new RuntimeException(e);
     } catch (IOException e) {
         throw new RuntimeException(e);
     }
    }
}
