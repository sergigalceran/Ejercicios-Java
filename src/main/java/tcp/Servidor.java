package tcp;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;

/**
 * Created by Sergi1 on 22/02/2016.
 */
public class Servidor {
    public static void main(String argv[]) throws Exception
    {
        ServerSocket s = new ServerSocket(12345);
        Socket ser = s.accept();
        SimpleDateFormat hora = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        while(true)
        {
            PrintWriter p = new PrintWriter(ser.getOutputStream());
            p.println(""+ hora);

        }

    }}