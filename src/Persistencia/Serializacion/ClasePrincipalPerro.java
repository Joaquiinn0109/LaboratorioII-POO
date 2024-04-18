package Persistencia.Serializacion;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ClasePrincipalPerro {
    public static void main(String[] args)throws IOException{
        ObjectInputStream in = null;
        ObjectOutputStream out = null;
        Perro [] p = {new Perro("Sultan","Ovj. Aleman"),new Perro("Pinky", "Caniche"), new Perro("Otro","Otro")};
        try {
            File f = new File("perros.txt");
            f.createNewFile();
            out = new ObjectOutputStream(new FileOutputStream(f));
            for(Perro aux : p){
               out.writeObject(aux);
            }
            Perro aux;
            in = new ObjectInputStream(new FileInputStream(f));
            for(int i = 0 ; i < 3 ; i++){
                aux = (Perro)in.readObject();
                System.out.println(aux);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            if(in !=null){
                in.close();
            }
            if(out != null){
                out.close();  }  
        }
    }
}
