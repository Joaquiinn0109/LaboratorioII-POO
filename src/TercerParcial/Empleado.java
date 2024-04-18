package TercerParcial;
//Capa de diseño del problema planteado con nombre: Empleado.java
import java.io.Serializable;

public class Empleado implements Serializable {
    private transient int id;
    private String nombre;
    private int salario;

    //Constructor sin argumentos
    public Empleado(){}
    //Constructor de JavaBean
    public Empleado(int id, String nombre, int salario){
        this.id=id;
        this.nombre=nombre;
        this.salario=salario;
    }
    //Getters y Setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getSalario() {
        return salario;
    }
    public void setSalario(int salario) {
        this.salario = salario;
    }
    //Sobreescritura metodo toString
    public String toString(){
        return "La persona llamada: "+nombre+" tiene un salario de: $"+salario;
    }
}
