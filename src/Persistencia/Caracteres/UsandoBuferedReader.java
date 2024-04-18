package Persistencia.Caracteres;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class UsandoBuferedReader {
    public static void main(String[] args) {
        
        try{
            FileReader in = new FileReader("ejemplo.txt");
            try (BufferedReader mibuffer = new BufferedReader(in)) {
                String linea="";

                while(linea != null){
                    linea = mibuffer.readLine();
                    if(linea != null)
                    System.out.println(linea);
                }
            }
    } catch(IOException e){} 
    }
}
