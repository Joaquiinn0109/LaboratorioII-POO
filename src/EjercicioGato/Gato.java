package EjercicioGato;
//Capa de diseño
public class Gato implements Comparable<Gato>{
    private String nombre;
    private String color;
    private String raza;

    public Gato(String nombre, String color, String raza){
        this.nombre=nombre;
        this.color=color;
        this.raza=raza;
    }
    public String getNombre(){
        return nombre;
    }
    public String getRaza(){
        return raza;
    }
    public String getColor(String color){
        return color;
    }
    public String toString(){
        return("El gato se llama "+nombre.toLowerCase()+", es de color "+color.toLowerCase()+" y es de raza "+raza.toLowerCase()+".");
    }
    public boolean equals(Gato g){
        if (g.getColor(color)==this.color && g.getColor(color) == this.color) {
            return true;
            } else {
            return false;
            }
    }
    public int compareTo(Gato o) {
        return 0;
    }
    public int compare(Gato a, Gato b){
        return a.getColor(color).compareTo(b.getColor(color));
    }
}

