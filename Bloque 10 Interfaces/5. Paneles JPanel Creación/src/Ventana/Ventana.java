
package Ventana;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ventana extends JFrame {
    public Ventana(){
        setBounds(0, 0, 600, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Programa");
        setLocationRelativeTo(null);
        
        iniciarComponentes();
        setMinimumSize(new Dimension(400,400));
       
    }
    
    private void iniciarComponentes(){
        JPanel panel = new JPanel(); //Creación de un panel
        
        this.getContentPane().add(panel); //Agregamos el panel a la ventana
        panel.setBackground(Color.ORANGE);
    }
}
