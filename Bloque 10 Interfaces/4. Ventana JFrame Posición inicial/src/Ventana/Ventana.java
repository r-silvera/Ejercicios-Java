
package Ventana;

import javax.swing.JFrame;

public class Ventana extends JFrame{
    public Ventana(){
        //setSize(500, 500); //Establecemos el tamaño de la ventana
        setTitle("Programa"); //Establecemos el titulo del programa
        //setLocation(700,300); //Establecemos la posición inicial de la ventana
        
        setBounds(100, 200, 500, 500); //Establecemos la posicición inicial y tamaño de la ventana
        setLocationRelativeTo(null); //Establecemos la ventana en el centro
        
        
        setDefaultCloseOperation(EXIT_ON_CLOSE); //Cuando se cierre la ventana la programa se detiene
    }
}
