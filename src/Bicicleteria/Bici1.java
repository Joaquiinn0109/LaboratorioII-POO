package Bicicleteria;
import java.io.Serializable;
//Tipos Enumerativos
enum TipoBici{MTB,RUTA,CITY,UTILITARIA}
enum TamañoCuadro{XS,S,M,L,XL}
public class Bici1 extends Bici implements Serializable, Nuevo
{
    private String marca;
    private String cantidadcambios;
    private String rodado;
    TipoBici tipobici;
    TamañoCuadro tamañocuadro;
    
    //Metodos.
    public void setMarca(String marca)
    {
    }
    public String getMarca(String marca)
    {
        return marca;
    }
    public void setRodado(String rodado)
    {
        this.rodado=rodado;
    }
    public String getRodado(String rodado)
    {
        return rodado;
    }
    public void setCantidadCambios(String cantidadcambios)
    {
        this.cantidadcambios=cantidadcambios;
    }
    public String getCantidadCambios(String cantidadcambios)
    {
        return cantidadcambios;
    }
    //OverRiding y OverLoading de Metodos
    public void Usando(String marca,String rodado,String cantidadcambios)
    {
        System.out.println("La bicicleta de tipo: "+tipobici);
        System.out.println("Marca: "+marca.toUpperCase());
        System.out.println("Rodado: "+rodado);
        System.out.println("Tamaño de cuadro: "+tamañocuadro);
        System.out.println("Cantidad de cambios: "+cantidadcambios);
        System.out.println("Se encuentra en uso. Muchas gracias.");
    }
    public void Lavando(String marca,String rodado)
    {
        System.out.println("La bicicleta de tipo: "+tipobici);
        System.out.println("Marca: "+marca.toUpperCase());
        System.out.println("Rodado: "+rodado);
        System.out.println("Tamaño de cuadro: "+tamañocuadro);
        System.out.println("Cantidad de cambios: "+cantidadcambios);
        System.out.println("Se encuentra en el sector de lavado. Muchas gracias.");
    }
    public void Mantenimiento(String marca,String rodado,String cantidadcambios)
    {
        System.out.println("La bicicleta de tipo: "+tipobici);
        System.out.println("Marca: "+marca.toUpperCase());
        System.out.println("Rodado: "+rodado);
        System.out.println("Tamaño de cuadro: "+tamañocuadro);
        System.out.println("Cantidad de cambios: "+cantidadcambios);
        System.out.println("Se encuentra en mantenimiento. Y podra ser retirada dentro de "+Retirar+" dias. Muchas gracias.");
    }
    //Metodos de la interface
    public void FueradeServicio(String marca,String rodado,String cantidadcambios)
    {
        System.out.println("La bicicleta de tipo: "+tipobici);
        System.out.println("Marca: "+marca.toUpperCase());
        System.out.println("Rodado: "+rodado);
        System.out.println("Tamaño de cuadro: "+tamañocuadro);
        System.out.println("Cantidad de cambios: "+cantidadcambios);
        System.out.println("Se encuentra fuera de servicio. Muchas gracias.");
    }
    public void NoseSabe(String marca,String rodado,String cantidadcambios)
    {
        System.out.println("La bicicleta de tipo: "+tipobici);
        System.out.println("Marca: "+marca.toUpperCase());
        System.out.println("Rodado: "+rodado);
        System.out.println("Tamaño de cuadro: "+tamañocuadro);
        System.out.println("Cantidad de cambios: "+cantidadcambios);
        System.out.println("No pudo ser localizada. Por favor dirigase a la sucurzal mas cercana. Muchas gracias.");
    }
    //Constructor por defecto
    Bici1 (){}
    //Constructor diseñado por programador
    void Bici1 (String marca,String cantidadcambios){
        this.cantidadcambios=cantidadcambios;
    } 
}
