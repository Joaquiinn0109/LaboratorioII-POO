package TercerParcial;
import java.io.*;
public class EjercicioClonar {
    public static void main(String[] args) throws IOException {
        BufferedReader entrada = null;
        BufferedWriter salida = null;
        try {
            File f = new File("Original.txt");
            entrada = new BufferedReader(new FileReader(f));
            salida = new BufferedWriter(new FileWriter("Clon.txt"));
            String aux;
            while((aux=entrada.readLine())!= null){
                System.out.println(aux);
                salida.write(aux);
                salida.newLine();
            }
            entrada.close();
            salida.close();
        }catch(Exception e){}
    }
}
    

