package PracticaColecciones;
import java.util.*;
public class ordenandoarraylist {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<Integer>();
        int i=12;
        array.add(1);
        array.add(i);  
        array.add(99);
        array.add(i+i);
        System.out.println(array.size());
        System.out.println(array.contains(2));
        System.out.println("Forma Desordenada: "+array);
        array.remove(1);
        System.out.println(array.size());
        System.out.println(array.contains(24));
        Collections.sort(array);
        System.out.println("Forma Ordenada: "+array);
    }
}
