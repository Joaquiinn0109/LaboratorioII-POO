package MetodotoStringyequals;
import java.util.*;
public class Principal {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Peliculas p = new Peliculas("Accion","Mil noches para morir",60);
        System.out.println(p);
        Peliculas p1 = new Peliculas("Accion", "Mil noches para morir",60);
        System.out.println(p1);
        if(p.equals(p1)){
            System.out.println("Las peliculas son iguales.");
        }else System.out.println("Las peliculas son distintas.");
        reader.close();
    }
}
