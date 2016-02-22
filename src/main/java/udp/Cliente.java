package udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * Created by Sergi1 on 22/02/2016.
 */
public class Cliente {

    final static int PORT_DAYTIME = 12345;
    public static void main (String args[]) throws Exception {
        DatagramSocket dgSocket;
        DatagramPacket datagram;
        InetAddress destination;
        byte msg[] = new byte[1024];
        dgSocket = new DatagramSocket();
        destination = InetAddress.getByName (args[0]);
        datagram = new DatagramPacket (msg, msg.length, destination,PORT_DAYTIME);
        dgSocket.send(datagram);
        datagram = new DatagramPacket (msg, msg.length);
        dgSocket.receive(datagram);
        String received = new String (datagram.getData());
        System.out.println ("" + received );
        dgSocket.close();
    }
}