
package busquedasecuencial;

import javax.swing.JOptionPane;

public class BusquedaSecuencial {

    public static void main(String[] args) {
        int arreglo[] = {4,1,5,2,3};
        int dato;
        boolean band = false;
        
        dato = Integer.parseInt(JOptionPane.showInputDialog("Digite el número a buscar: "));
        
        //Busqueda Secuencial
        int i=0;
        
        while(i<5 && band == false){
            if(arreglo[i] == dato){
                band = true;
            }
            i++;
        }
        
        if(band == false){
            JOptionPane.showMessageDialog(null, "El número no se encuentra en el arreglo. ");
        }
        else{
            JOptionPane.showMessageDialog(null, "El número ha sido encontrado en la posición "+(i-1)+".");
        }
            
    }
    
}
