package Persistencia.Caracteres;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class UsandoBufferReaderyWriter {
    public static void main(String[] args) throws IOException {
        BufferedReader in = null;
        BufferedWriter out = null;
        try {
            File f = new File("prueba.txt");
            out = new BufferedWriter(new FileWriter(f));
            in = new BufferedReader(new FileReader(f));
            out.write("linea 1");
            out.newLine();
            out.write("linea 2");
            out.close();
            out = new BufferedWriter(new FileWriter("otro.txt"));
            String aux;
            while((aux=in.readLine())!= null){
                System.out.println(aux);
                out.write(aux);
                out.newLine();
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            if(in !=null){
                in.close();
            }
            if(out != null){
                out.close();
            }
         }
    }
}
