
package Ventana;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;

public class Ventana extends JFrame{
    public Ventana(){
        setBounds(0, 0, 500, 500); 
        setTitle("Programa");
        setLocationRelativeTo(null); 
        
        //setResizable(false); //Establecemos si la ventana puede cambiar de tamaño o no
        setMinimumSize(new Dimension(200,200)); //Establecemos el tamaño minimo de la ventana
        
        this.getContentPane().setBackground(Color.MAGENTA); //Establecer el color de la ventana
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
