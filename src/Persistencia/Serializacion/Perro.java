package Persistencia.Serializacion;
import java.io.Serializable;
public class Perro implements Serializable{
    private String nombre;
    private String raza;
    public Perro(String nombre, String raza){
        this.nombre = nombre;
        this.raza = raza;
    }
    public Perro(){}
    public String getRaza() {
        return raza;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String toString() {
        return "Perro :"+this.nombre +" Raza :"+ this.raza;
    }
    
}

