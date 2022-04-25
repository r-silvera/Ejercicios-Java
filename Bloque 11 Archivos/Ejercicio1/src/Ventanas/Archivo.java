
package Ventanas;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Archivo {
    File archivo;

    public void crearArchivo(){
        archivo = new File("agendaContactos.txt");
        
        try {
            if (archivo.createNewFile()){
                //archivo creado
            }
            
        } catch (IOException ex) {
            System.err.println("Error, "+ex);
        }
    }
    
    public void escribirArchivo(Persona persona){
        try {
            FileWriter escribir = new FileWriter(archivo,true);
            escribir.write(persona.getNombre()+"%"+persona.getEmail()+"%"+persona.celular+"\r\n");
            
            escribir.close();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error, "+ex);
        }
    }
    
}
