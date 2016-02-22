package Binario;

import java.io.IOException;

/**
 * Created by Sergi1 on 22/02/2016.
 */
public class Principal {
    public static void main(String[] args) throws IOException {

        Binario ejemplo= new Binario(3, 3.5, 'e');
        ejemplo.escribir_fichero("ejemplo");
        Binario ej2 = Binario.crear_clase("ejemplo");
        System.out.println(""+ej2.getDecimal());
        System.out.println(""+ej2.getNumero());
        System.out.println(""+ej2.getNombre());

    }
}
