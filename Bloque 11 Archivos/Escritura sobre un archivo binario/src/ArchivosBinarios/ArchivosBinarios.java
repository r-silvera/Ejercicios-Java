
package ArchivosBinarios;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ArchivosBinarios {
    
    private void escribirBinario(){
         try {
            FileOutputStream archivo = new FileOutputStream("personas.bin",true);
            ObjectOutputStream escritura = new ObjectOutputStream(archivo);
            
            Persona persona1 = new Persona("Robertino", 19);
            Persona persona2 = new Persona("Franco",12);
            
            //Escribimos objetos sobre el archivo binario
            escritura.writeObject(persona1);
            escritura.writeObject(persona2);
            
            escritura.close();//Cerramos el archivo binario
            
        } catch (FileNotFoundException ex) {
            System.err.println("Error, "+ex);
        } catch (IOException ex) {
            System.err.println("Error, "+ex);
        }
    }

    private void añadirBinario(){
         try {
            FileOutputStream archivo = new FileOutputStream("personas.bin",true);
            AñadirContenido escritura = new AñadirContenido(archivo);
            
            Persona persona1 = new Persona("Myriam", 51);
            Persona persona2 = new Persona("Brisa",17);
            
            //Escribimos objetos sobre el archivo binario
            escritura.writeObject(persona1);
            escritura.writeObject(persona2);
            
            escritura.close();//Cerramos el archivo binario
            
        } catch (FileNotFoundException ex) {
            System.err.println("Error, "+ex);
        } catch (IOException ex) {
            System.err.println("Error, "+ex);
        }
    }
    
    private void leerBinario(){
        Persona objetoPersona;
        
        try {
            FileInputStream archivo = new FileInputStream("personas.bin");
            ObjectInputStream lectura = new ObjectInputStream(archivo);
            while(true){ //Recorremos el archivo binario
                objetoPersona = (Persona) lectura.readObject();
                objetoPersona.mostrarDatos();   
            }
            
        }catch(EOFException ex){
            return;//finalizo de leer todo el archivo binario
        } catch (FileNotFoundException ex) {
            System.err.println("Error, "+ex);
        } catch (IOException ex) {
            System.err.println("Error, "+ex);
        } catch (ClassNotFoundException ex) {
            System.err.println("Error, "+ex);
        }
    }

    public static void main(String[] args) {
       ArchivosBinarios archivo = new ArchivosBinarios();
       //archivo.escribirBinario();
       archivo.añadirBinario();
       archivo.leerBinario();
    }
}

