package TercerParcial;
import java.io.*;
import java.util.Scanner;
public class escribir {
    public static void main(String[] args) throws Exception{
        String frase;
        Scanner reader = new Scanner(System.in);
        Escribiendo escribir = new Escribiendo();
        Leerfichero acceder = new Leerfichero();
        System.out.println("ingrese la frase que desea copiar");
        frase = reader.nextLine();
        escribir.setFrase(frase);
        escribir.escribir();
        acceder.lee();
    }
}
class Escribiendo{

    private String frase;

    public String getFrase() {
        return frase;
    }
    public void setFrase(String frase) {
        this.frase = frase;
    }
    public void escribir(){
        
        try{
        FileWriter escritura = new FileWriter("C:/Users/ezeca/Desktop/Archivo5.txt"); // si ponemos true agrega texto al final

        for(int i=0;i<frase.length();i++){
            escritura.write(frase.charAt(i));
        }
        escritura.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }

    }
}
class Leerfichero{

    public void lee(){
        try{
        FileReader leer = new FileReader("C:/Users/ezeca/Desktop/Archivo5.txt");
        int c = leer.read();  // guardamos el codigo del caracter en una variable int // si igualamos a 0 leer el primer caracter
        char letra2= 'H';    
        while (c!= -1){
            c = leer.read();
            char letra = (char)c; // casting del codigo de caracter para que se pase a letra    
            if(letra != letra2)
            System.out.print(letra); 
        }
        leer.close();

        }catch(IOException e){
            System.out.println("No se a encontrado el archivo");
        }
    }

}