package Persistencia.Caracteres;

import java.io.FileReader;
import java.io.IOException;

public class Leyendofichero {
    public static void main(String[] args) {
        try{
             FileReader entrada = new FileReader("ejemplo.txt");
                int c=0;
                while(c != -1){
                    c=entrada.read();
                    char letra = (char)c;
                    System.out.print(letra);
                }
            entrada.close();
        }catch(IOException e){}
    }
}
