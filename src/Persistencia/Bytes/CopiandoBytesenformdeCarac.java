package Persistencia.Bytes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopiandoBytesenformdeCarac {
    public static void main(String[] args) {
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            File f = new File("PruebaEscr.txt");             
            in = new FileInputStream(f); //crea un flujo de byte desde un archivo
            out = new FileOutputStream("Copia.txt");//crea un flujo de byte hacia un archivo 											     // archivo outagain.txt
            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } catch(IOException e){}
        finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    
                    e.printStackTrace();
                }
            }
        }
    }
}
