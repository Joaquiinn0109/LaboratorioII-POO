package Persistencia.Caracteres;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class UsandoBufferedWriter {
    public static void main(String[] args) {
        try{
            File archi = new File("BufferEscr.txt");
            archi.createNewFile();
            BufferedWriter b = new BufferedWriter(new FileWriter(archi));
            b.write("----- Hola ------");
            b.newLine();
            b.write("Esto es una prueba de escritura con buffer.");
            b.newLine();
            b.write("-- Muchas gracias --");
            b.flush();
            b.close();
            FileReader salida = new FileReader(archi);
            System.out.println("Mostrando el fichero.");
            int c=0;
                while(c != -1){
                    c=salida.read();
                    char letra = (char)c;
                    if(c != -1)
                    System.out.print(letra);
                }
            salida.close();
        }catch(IOException e){}
    }
}
