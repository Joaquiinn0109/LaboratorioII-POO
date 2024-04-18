package Persistencia.Serializacion;
import java.io.Serializable;
public class Persona implements Serializable{
    private String dni;
    private String nombre;
    private int edad;
    private transient String estadoCivil;
    
    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getEstadoCivil() {
        return estadoCivil;
    }
    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
    public Persona(){}

    public Persona(String dni,String nombre, int edad, String estadoCivil){
        this.dni=dni;
        this.nombre=nombre;
        this.edad=edad;
        this.estadoCivil=estadoCivil;
    }
    public String toString(){
        return "La persona: "+nombre+", con DNI: "+dni+" tiene "+edad+" años.";
    }
}
