package MetodotoStringyequals;

import java.io.Serializable;

public class Peliculas implements Serializable{
    //Declaracion de atributos
    private String genero;
    private String titulo;
    private int duracion;
    //Metodos
    public void setGenero(String genero){
        this.genero=genero;
    }
    public String getGenero(String genro){
        return genero;
    }
    public void setTitulo(String titulo){
        this.titulo=titulo;
    }
    public String getTitulo(String titulo){
        return titulo;
    }
    public void setDuracion(int duracion){
        this.duracion=duracion;
    }
    public int getDuracion(int duracion){
        return duracion;
    }
    //Sobreescritura metodo toString
    public String toString(){
        return ("La pelicula de genero "+genero+" se llama "+titulo+" y tiene una duracion de "+duracion+" min.");
    }
    //sobreescritura metodo hashCode
    public int hashCode(){ 
        return duracion * 12;
    }
    //Sobreescritura metodo equals
    public boolean equals(Peliculas O){
        if (O.getGenero(genero)==this.genero && O.getTitulo(titulo) == this.titulo && O.getDuracion(duracion)==this.duracion) {
        return true;
        } else {
        return false;
        }
    }
    //Constructor por defecto
    Peliculas(){}
    //Constructor desarrollado por programador
    Peliculas(String genero, String titulo, int duracion){
        this.genero=genero;
        this.titulo=titulo;
        this.duracion=duracion;
    }
}
