
package ClaseFile;

import java.io.File;

public class ClaseFile {
    public static void main(String[] args) {
        File directorio = new File("carpetaPrueba");
        
        if(directorio.exists()){
            System.out.println("El directorio existe");
            System.out.println("Ruta absoluta: "+directorio.getAbsolutePath());
            System.out.println("Es un directorio? "+directorio.isDirectory());
            System.out.println("Se puede leer? "+directorio.canRead());
        }
        else{
            System.out.println("El archivo no existe");
        }
    }
}
