
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
        setLocationRelativeTo(null);
        
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        insertarComponentes();
    }
    
    private void insertarComponentes(){
        JPanel panel = new JPanel();
        this.getContentPane().add(panel);
        panel.setLayout(null);
        
        JLabel etiqueta = new JLabel();
        panel.add(etiqueta);
        etiqueta.setOpaque(true);
        etiqueta.setText("Hola");
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER); //Establecemos que el texto este de manera centrada dentro de la etiqueta
        etiqueta.setForeground(Color.WHITE);
        etiqueta.setBackground(Color.BLACK);
        etiqueta.setBounds(10, 10, 50, 20);
    }
}
