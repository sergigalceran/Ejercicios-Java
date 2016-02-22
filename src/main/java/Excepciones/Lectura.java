package Excepciones;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Sergi1 on 22/02/2016.
 */
public class Lectura {

    public final static double media(String file) throws BigNumberException, FileParsingException {
        int i=0;
        double media=0d;
        int suma=0;
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        int[] numeros =new int[100];
        try {
            archivo = new File (file);
            fr = new FileReader (archivo);
            br = new BufferedReader(fr);
            String linea;
            while ((linea= br.readLine()) != null) {
                int numero=Integer.parseInt(linea);
                if (numero>1000) {
                    throw new BigNumberException("Hay un numero mayor que 1000 en la linea "+(i+1));
                }
                numeros[i]=numero;
                i++;
                suma=suma+numero;
            }
            media=suma/i;
            br.close();
        }
        catch (java.io.IOException e) {
            throw new FileParsingException(e.getMessage());
        }
        finally {
            try{
                fr.close();
            }
            catch (IOException e){
                e.printStackTrace();
            }

        }
        return media;	}}

