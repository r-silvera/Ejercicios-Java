
package Ventana;

import javax.swing.JFrame;

public class Ventana extends JFrame{
    public Ventana(){
        setSize(500, 500); // Establecemos el tamaño de la ventana
        setDefaultCloseOperation(EXIT_ON_CLOSE); // Establecemos que cuando se cierre la ventana la aplicacion se detiene
        setTitle("El mejor titulo"); // Establecemos el titulo de la ventana
    }
}
