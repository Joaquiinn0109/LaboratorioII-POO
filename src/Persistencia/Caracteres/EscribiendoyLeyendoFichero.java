package Persistencia.Caracteres;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class EscribiendoyLeyendoFichero {
    public static void main(String[] args) {
        String frase = "Esto es una prueba de escritura.";
        try{
            FileWriter escribir = new FileWriter("ArchivoLecyEsc.txt");
            for(int i=0;i<frase.length();i++){
                escribir.write(frase.charAt(i));
            }
            escribir.close();
            FileReader entrada = new FileReader("ArchivoLecyEsc.txt");
                int c=0;
                System.out.println("El fichero de texto quedo de la siguiente manera: ");
                while(c != -1){
                    c=entrada.read();
                    char letra = (char)c;
                    System.out.print(letra);
                }
            entrada.close();
        }catch(IOException e){
            
        }
    }
}
