package tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * Created by Sergi1 on 22/02/2016.
 */
public class Cliente {
    public static void main(String[] args) throws IOException {

        Socket s = new Socket("Servidor",12345);
        BufferedReader b = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String hora = b.readLine();
        System.out.println(hora);
    }
}
