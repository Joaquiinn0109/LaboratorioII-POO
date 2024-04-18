package EjercicioGato;

import java.util.ArrayList;
import java.util.Collections;

//Capa de negocio con nombre de archivo Principal.java
public class Principal {
    public static void main(String[] args) {
        ArrayList<Gato> gatos = new ArrayList<Gato>();
        gatos.add(new Gato("Pumi", "Gris", "Siames"));
        gatos.add(new Gato("Oscar", "Marron", "Siames"));
        gatos.add(new Gato("Tiger", "Negro", "Persa"));
        
        Collections.sort(gatos);
        System.out.println(gatos);
    }
}
