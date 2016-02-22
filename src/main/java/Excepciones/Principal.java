package Excepciones;

import java.util.Scanner;

/**
 * Created by Sergi1 on 22/02/2016.
 */
public class Principal {

    public static void main(String[] args) {
        Scanner entradaEscaner = new Scanner (System.in); //Creación de un objeto Scanner
        String entradaTeclado = entradaEscaner.nextLine ();

        try {
            double media = Lectura.media(entradaTeclado);
            System.out.println("La media es = " + media);
        } catch (FileParsingException e) {
            e.printStackTrace();
        } catch (BigNumberException e) {
            e.printStackTrace();
        }
    }
}