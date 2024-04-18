package TercerParcial;
//Capa de negocio del problema planteado con nombre: PrincipalEmpleado.java
import java.io.*;

public class PrincipalEmpleado {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        ObjectOutputStream escritura = null;
        Empleado e;
        try {
            fos = new FileOutputStream("empleados.dat");
            escritura = new ObjectOutputStream(fos);
            e = new Empleado(41412722, "Machuca, Joaquin Marcelo", 25000);
            escritura.writeObject(e);
            e = new Empleado(11801865, "Perez, Juan", 30000);
            escritura.writeObject(e); 
            escritura.close();
            fos.close();
        }catch(IOException x){}
        
        FileInputStream fis = null;
        ObjectInputStream lectura = null;
        System.out.println("El archivo empleados.dat queda de la siguiente manera:");
        try{
            fis = new FileInputStream("empleados.dat");
            lectura = new ObjectInputStream(fis);
            e = (Empleado)lectura.readObject();
            System.out.println(e);
            e = (Empleado)lectura.readObject();
            System.out.println(e);
    }catch(IOException | ClassNotFoundException y){}
    }
}
