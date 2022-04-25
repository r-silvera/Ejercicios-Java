
package Ventana;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Ventana extends JFrame{
    public Ventana(){
        setSize(600, 600);
        setTitle("Programa");
        setResizable(false);
        
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        mostrarComponentes();
    }
    
    private void mostrarComponentes(){
        JPanel panel = new JPanel();            //Creamos el panel 
        this.getContentPane().add(panel);       //Agregamos el panel al contenido de la ventana
        panel.setLayout(null);                  //Desactivamos el diseño
        
        JLabel etiqueta = new JLabel();                                     //Creamos una etiqueta
        panel.add(etiqueta);                                                //Agregamos la etiqueta al panel
        etiqueta.setOpaque(true);                                           //Establecemos pintar el fondo de la etiqueta
        etiqueta.setText("Hola");                                           //A la etiqueta le ponemos un text
        etiqueta.setForeground(Color.WHITE);                                //Establecemos el color de la letra
        etiqueta.setBackground(Color.BLACK);                                //Cambiamos el color de fondo de la etiqueta    
        etiqueta.setBounds(10, 10, 50, 20);
    }
}

