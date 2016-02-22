package Binario;

import java.io.*;

/**
 * Created by Sergi1 on 22/02/2016.
 */
public class Binario {
    private int numero;
    private double decimal;
    private char nombre;

    public Binario(int numero, double decimal, char nombre)
    {
        this.numero= numero;
        this.decimal=decimal;
        this.nombre = nombre;
    }

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public double getDecimal() {
        return decimal;
    }
    public void setDecimal(double decimal) {
        this.decimal = decimal;
    }
    public char getNombre() {
        return nombre;
    }
    public void setNombre(char nombre) {
        this.nombre = nombre;
    }

    public void  escribir_fichero(String nombre) throws IOException
    {
        ObjectOutputStream datos = null;


        datos = new ObjectOutputStream(

                new FileOutputStream(nombre));

        datos.writeObject(numero);
        datos.writeObject(decimal);
        datos.writeObject(this.nombre);
        datos.close();

    }
    public final static Binario crear_clase (String ruta) throws IOException
    {

        DataInputStream dis=new DataInputStream(new FileInputStream(ruta));
        int num= dis.readInt();
        double dec= dis.readDouble();
        char nom= dis.readChar();
        return new Binario(num,dec,nom);

    }
}
