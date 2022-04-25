
package Ejercicio1;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Ventana extends JFrame{ //Si queremos un componente grafico la clase debe heredar los metodos de JFrame
    private JPanel panel;
    private JLabel etiqueta;
    private JButton boton;
    private int contador = 0;
    
    public Ventana(){
        setSize(500, 450); //tamaño a la ventana
        setTitle("Ejercicio 1"); //titulo de la ventana
        setLocationRelativeTo(null); //ventana al centro
        
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        insertarComponentes();
    }
    
    private void insertarComponentes(){
        colocarPanel();
        colocarEtiqueta();
        colocarBoton();
    }
    
    private void colocarPanel(){
        panel = new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
        
    }
    
    private void colocarEtiqueta(){
        etiqueta = new JLabel();
        etiqueta.setBounds(17, 50, 450, 45);
        etiqueta.setText("Pulsa el boton");
        etiqueta.setFont(new Font("arial",0,30));
        panel.add(etiqueta);
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
        etiqueta.setBackground(Color.BLACK);
        etiqueta.setOpaque(false);
    }
    
    private void colocarBoton(){
        boton = new JButton();
        boton.setBounds(150, 280, 175, 60);
        boton.setText("PULSA AQUÍ");
        boton.setFont(new Font("arial",1,20));
        panel.add(boton);
        
        colocarOyenteDeAcción();
    }
    
    private void colocarOyenteDeAcción(){
        

        ActionListener oyenteDeAcción = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contador++;
                if(contador == 1){
                    etiqueta.setText("Boton pulsado 1 vez");
                }
                else{
                    etiqueta.setText("Boton pulsado "+contador+" veces");
                }
            }
        };
        
        boton.addActionListener(oyenteDeAcción);
    }
}
