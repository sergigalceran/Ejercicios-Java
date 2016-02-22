package udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.text.SimpleDateFormat;

/**
 * Created by Sergi1 on 22/02/2016.
 */
public class Servidor {
    public static void main(String[] args) throws IOException {

        int PUERTO=12345;
        byte msg[]=new byte[1024];
        DatagramSocket s = new DatagramSocket(PUERTO);
        while (true) {
            DatagramPacket recibido = new DatagramPacket(new byte [1024],1024);
            s.receive(recibido);
            SimpleDateFormat hora = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            String mensaje =new String(""+hora);
            msg=mensaje.getBytes();
            DatagramPacket paquete=new DatagramPacket(msg,msg.length,recibido.getAddress(),
                    recibido.getPort());
            s.send(paquete);
        }
    }

}