
package Ejercicio3;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Ventana extends JFrame{
    private JPanel panel;
    private JLabel etiqueta;
    private int pulsado = 0, red = 0, green = 0, blue = 0;
    private JButton boton1,boton2,boton3;
    
    public Ventana(){
        setSize(700,450);
        setTitle("Ejercicio 3");
        setLocationRelativeTo(null);
        
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        iniciarComponentes();
    }
    
    private void iniciarComponentes(){
        colocarPanel();
        colocarEtiqueta();
        colocarBotones();
    }
    
    private void colocarPanel(){
       panel = new JPanel();
       panel.setLayout(null);
       this.getContentPane().add(panel);
       
       eventoDeRuedaDeMouse();
    }
    
    private void colocarEtiqueta(){
        etiqueta = new JLabel("Color(Rojo,Verde,Azul)");
        etiqueta.setBounds(0, 40, 700, 60);
        etiqueta.setFont(new Font("arial",0,30));
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(etiqueta);
    }
    
    private void colocarBotones(){
        colocarBotonRojo();
        colocarBotonVerde();
        colocarBotonAzul();
        
    }
    
    private void colocarBotonRojo(){
        boton1 = new JButton("Rojo");
        boton1.setBounds(90, 300, 120, 55);
        boton1.setFont(new Font("arial",1,20));
        boton1.setForeground(Color.RED);
        panel.add(boton1);

        boton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pulsado = 1;
            }
        });
    }
    
    private void colocarBotonVerde(){
        boton2 = new JButton("Verde");
        boton2.setBounds(270, 300, 120, 55);
        boton2.setFont(new Font("arial",1,20));
        boton2.setForeground(Color.GREEN);
        panel.add(boton2);
        
        boton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pulsado = 2;
            }
        });
    }
    
    private void colocarBotonAzul(){
        boton3 = new JButton("Azul");
        boton3.setBounds(450, 300, 120, 55);
        boton3.setFont(new Font("arial",1,20));
        boton3.setForeground(Color.BLUE);
        panel.add(boton3);
        
        boton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pulsado = 3;
            }
        });
    }
    
    private void eventoDeRuedaDeMouse(){
        
        MouseWheelListener eventoRueda = new MouseWheelListener() {
            @Override
            public void mouseWheelMoved(MouseWheelEvent e) {
                if(pulsado !=0){
                    if(pulsado == 1){
                        red -= e.getWheelRotation();
                        if(red < 0){
                            red = 0;
                        }
                        if(red > 255){
                            red = 255;
                        }
                    }
                    else if(pulsado == 2){
                        green -= e.getWheelRotation();
                        if(green < 0){
                            green = 0;
                        }
                        if(green > 255){
                            green = 255;
                        }
                    }
                    else{
                       blue -= e.getWheelRotation();
                        if(blue < 0){
                            blue = 0;
                        }
                        if(blue > 255){
                            blue = 255;
                        } 
                    }
                }
                etiqueta.setText("Color (Rojo = "+red+", Verde = "+green+", Azul = "+blue+")");
                panel.setBackground(new Color(red,green,blue));
            }
        };
        
        panel.addMouseWheelListener(eventoRueda);
    }
}
