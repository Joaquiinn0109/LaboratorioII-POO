package PracticaColecciones;

import java.util.*;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<String>();
        String s ="hola";
        array.add("mundo");
        array.add(s);  
        array.add("me cago");
        array.add(s+s);
        System.out.println(array.size());
        System.out.println(array.contains("holahola"));
        array.remove("me cago");
        System.out.println(array.size());
        System.out.println(array.contains("me cago"));
        System.out.println(array);
    }
}
