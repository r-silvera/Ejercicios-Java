
package Ventana;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Ventana extends JFrame{
    public Ventana(){
        setSize(600,600);
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
        etiqueta.setBackground(Color.BLACK);
        etiqueta.setText("Texto");
        etiqueta.setForeground(Color.WHITE);
        etiqueta.setBounds(10, 10, 60, 20);
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
        etiqueta.setFont(new Font("arial",0,20));
    }
}
