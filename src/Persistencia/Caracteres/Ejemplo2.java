package Persistencia.Caracteres;

import java.io.File;
public class Ejemplo2 {
    public static void main(String[] args) {
        try{
            Boolean exis=false;
            File file = new File("AhoraSI.txt");
            exis=file.exists();
            if(exis == false){
                file.createNewFile();
                System.out.println("El archivo tuvo que ser creado.");
            } else{ System.out.println("El archivo ya existe.");} 
            System.out.println("La direccion absoluta del archivo es: "+file.getAbsoluteFile());
            System.out.println("La direccion canonica del archivo es: "+file.getCanonicalFile());
            System.out.println("El archivo se llama: "+file.getName());
            System.out.println("La ruta con la que se creo el objeto File es: "+file.getPath());
            System.out.println("El archivo puede ser leido? "+file.canRead());
            System.out.println("El archivo puede ser escrito? "+file.canWrite());
            System.out.println("El archivo puede ejecutarse? "+file.canExecute());
            System.out.println("Es un directorio valido? "+file.isDirectory());
            System.out.println("El fichero es oculto? "+file.isHidden());
            file.renameTo(new File("OtroNombre.txt"));
              
              }catch(Exception e){ e.printStackTrace(); }
    
    }
}
