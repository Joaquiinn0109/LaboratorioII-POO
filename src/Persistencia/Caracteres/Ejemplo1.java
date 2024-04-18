package Persistencia.Caracteres;
import java.io.*;
public class Ejemplo1 {
    public static void main(String[] args) {
        try {                 

            //cuidado excepcion es posible
          boolean newFile = false;
          File file = new File("ArchivoTexto.txt");  // esto es solo un objeto
                    
           System.out.println(file.exists());  // se fija si el archivo existe
      
           newFile = file.createNewFile();     // crea el archivo
           System.out.println(newFile);        // esta listo ? si esta listo devuelve true
           System.out.println(file.exists());  // se fija devuelta si esta el archivo
 
     }catch(IOException e) { 

        }
 
    }
}
