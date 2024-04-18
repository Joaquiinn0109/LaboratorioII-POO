package TercerParcial;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class EjerArray {
    public static void main(String[] args) {
        char [] entr = new char[75];
        int size=0;
        try{
            File carac = new File("Arreglo.txt");
            FileWriter escr = new FileWriter(carac);
            escr.write("Hola!! Esto es una muestra sobre caracteres en un arreglo unidemensional!!.");
            escr.flush();
            escr.close();
            FileReader leer = new FileReader(carac);
            size=leer.read(entr);
            System.out.println("El arreglo tiene "+size+" caracteres.");
            System.out.println("Mostrando solo los primeros 50 caracteres:");
            for(int i =0;i<50;i++){
                System.out.print(entr[i]);
            }
            leer.close();
        }catch(IOException e){}
    }
}

