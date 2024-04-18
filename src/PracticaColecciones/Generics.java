package PracticaColecciones;

public class Generics <T> {

    private T dato;

    public void setDato(T t){
        this.dato=t;
    }
    public T getDato(){
        return this.dato;
    }
    Generics(){};
}
