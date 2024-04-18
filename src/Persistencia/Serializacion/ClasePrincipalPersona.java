package Persistencia.Serializacion;
import java.io.*;
public class ClasePrincipalPersona {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        ObjectOutputStream salida = null;
        Persona p;
        try{
            fos = new FileOutputStream("Personas.txt");
            salida = new ObjectOutputStream(fos);
            p = new Persona("41412722","Machuca, Joaquin",24,"Soltero");
            salida.writeObject(p);
            p = new Persona("42995669", "Lezcano, Jesica", 23,"Casada");
            salida.writeObject(p);
            p = new Persona("25718219","Ferreyra, Mariela",44,"Viuda");
            salida.writeObject(p);
            fos.close();
            salida.close();
        }catch(IOException e){}
        FileInputStream fis = null;
        ObjectInputStream lectura = null;
        System.out.println("El archivo Personas.txt queda de la siguiente manera:");
        try{
            fis = new FileInputStream("Personas.txt");
            lectura = new ObjectInputStream(fis);
            p = (Persona)lectura.readObject();
            System.out.println(p);
            p = (Persona)lectura.readObject();
            System.out.println(p);
            p = (Persona)lectura.readObject();
            System.out.println(p);
        }catch(IOException | ClassNotFoundException e){}
    }
}
