package Persistencia.Bytes;

import java.io.*;
public class LeerArchienByteyCopiarlo {
    public static void main(String[] args) throws Exception{
        int contador_de_byte = 0;
        int datos_entrada[] = new int [363];

        try{    
            FileInputStream archivo_lectura = new FileInputStream("perros.txt");
            boolean final_archivo = false;

            while(!final_archivo){                                     
                int byte_entrada = archivo_lectura.read();
              
                if(byte_entrada != -1){
                
                datos_entrada[contador_de_byte] = byte_entrada;               //almacemamos en un array 
                System.out.print(datos_entrada[contador_de_byte]);
                contador_de_byte++;
                
                }
                else{
                    final_archivo = true;
                }
            }
            archivo_lectura.close();
        } catch(IOException e){
            System.out.println("No se encuentra la imagen");
        }
        System.out.println("");
        System.out.println(" Cantidad de byte :" + contador_de_byte);

        crea_fichero(datos_entrada);
    }

    static void crea_fichero (int datos_nuevo[]){
        try{
            FileOutputStream fichero_nuevo = new FileOutputStream("Archivoperros_copia.txt");
            for(int i = 0; i<datos_nuevo.length;i++){
                fichero_nuevo.write(datos_nuevo[i]);
            }
            fichero_nuevo.close();
        }catch(IOException e){
           System.out.println("Error  al crear el archivo");
        }
    }

  
    
}
