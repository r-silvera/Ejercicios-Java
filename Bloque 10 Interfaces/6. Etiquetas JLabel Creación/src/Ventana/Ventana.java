
package Ventana;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ventana extends JFrame{
    
    public Ventana(){
        setBounds(0, 0, 600, 600);
        setTitle("Programa");
        setLocationRelativeTo(null);
        
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        iniciarComponente();
    }
    
    private void iniciarComponente(){
        JPanel panel = new JPanel();            //Creación de un panel
        panel.setLayout(null);                  //Desactivamos el diseño
        this.getContentPane().add(panel);       //Agregamos el panel a la ventana

        JLabel etiqueta = new JLabel();         //Creamos una etiqueta
        panel.add(etiqueta);                    //Agregamos la etiqueta al panel
        etiqueta.setText("Texto");              //Establecemos el texto de la etiqueta
        etiqueta.setBounds(10,10,50,30);        //Establecemos la posición y tamaño de la etiqueta
        
        
    }
}
