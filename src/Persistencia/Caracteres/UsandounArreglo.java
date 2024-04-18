package Persistencia.Caracteres;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class UsandounArreglo {
    public static void main(String[] args) {
        char [] entr = new char[50];
        int size=0;
        try{
            File carac = new File("Arreglo.txt");
            FileWriter escr = new FileWriter(carac);
            escr.write("Hola!! \nEsto es una muestra");
            escr.flush();
            escr.close();
            FileReader leer = new FileReader(carac);
            size=leer.read(entr);
            System.out.println(size +"");
            for(char c : entr){
                System.out.print(c);
            }
            leer.close();
        }catch(IOException e){}
    }
}
