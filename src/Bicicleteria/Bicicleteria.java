package Bicicleteria;
import java.util.*;
public class Bicicleteria 
{
     public static void main (String [] args){
        Scanner reader = new Scanner(System.in);
        Bici1 b = new Bici1();
        String m,r,cc;
        int _opcionTipo=0,_opcionTamaño=0;
        try {
        System.out.println("Le pediremos los datos de su bici para saber en que estado se encuentra.");
        do{
        System.out.println("Selecione el tipo de Bicicleta: ");
        System.out.println("0. MTB ");
        System.out.println("1. RUTA ");
        System.out.println("2. CITY ");
        System.out.println("3. UTILITARIA ");
        _opcionTipo=reader.nextInt();
        switch(_opcionTipo)
        {
            case 0: b.tipobici=TipoBici.MTB;
            break;
            case 1: b.tipobici=TipoBici.RUTA;
            break;
            case 2: b.tipobici=TipoBici.CITY;
            break;
            case 3: b.tipobici=TipoBici.UTILITARIA;
            break;
        }
        if(_opcionTipo <0 || _opcionTipo >3)
        {
            System.out.println("Ha Ingresado una opcion incorrecta, por favor seleccione nuevamente.");
        }
        } while(_opcionTipo <0 || _opcionTipo >3);
        System.out.println("Ingrese la marca.");
        m=reader.next();
        b.setMarca(m);
        System.out.println("Ingrese el rodado.");
        r=reader.next();
        b.setRodado(r);
        do{
        System.out.println("Selecione el tamaño del cuadro: ");
        System.out.println("0. XS ");
        System.out.println("1. S ");
        System.out.println("2. M ");
        System.out.println("3. L ");
        System.out.println("4. XL ");
        _opcionTamaño=reader.nextInt();
        switch(_opcionTamaño)
        {
            case 0: b.tamañocuadro=TamañoCuadro.XS;
            break;
            case 1: b.tamañocuadro=TamañoCuadro.S;
            break;
            case 2: b.tamañocuadro=TamañoCuadro.M;
            break;
            case 3: b.tamañocuadro=TamañoCuadro.L;
            break;
            case 4: b.tamañocuadro=TamañoCuadro.XL;
            break;
        }
        if(_opcionTamaño <0 || _opcionTamaño >4)
        {
            System.out.println("Ha Ingresado una opcion incorrecta, por favor seleccione nuevamente.");
        }
        } while(_opcionTamaño <0 || _opcionTamaño >4);
        System.out.println("Ingrese la cantidad de cambios.");
        cc=reader.next();
        b.setCantidadCambios(cc);
        b.Mantenimiento(m,r,cc);
        }catch(Exception e)
        {
            System.out.println("Ha ocurrido un ERROR debido a que ingreso los datos de forma incorrecta, por favor dirigase a la tienda mas cercana.");
        }
      reader.close();  
    }
}
