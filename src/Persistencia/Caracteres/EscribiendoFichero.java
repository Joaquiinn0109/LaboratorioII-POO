package Persistencia.Caracteres;

import java.io.*;
import java.util.Scanner;

public class EscribiendoFichero {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String frase;
        System.out.println("Ingrese la frase que desea copiar al fichero.");
        frase=reader.nextLine();
        try{
            FileWriter escribir = new FileWriter("Ejercicio1.txt");
            for(int i=0;i<frase.length();i++){
                escribir.write(frase.charAt(i));
            }
            escribir.close();
            reader.close();
            FileReader entrada = new FileReader("Ejercicio1.txt");
                int c=0;
                System.out.println("El fichero de texto quedo de la siguiente manera: ");
                while(c != -1){
                    c=entrada.read();
                    char letra = (char)c;
                    if(c != -1)
                    System.out.print(letra);
                }
            entrada.close();
        }catch(IOException e){
            
        }
    }
}
