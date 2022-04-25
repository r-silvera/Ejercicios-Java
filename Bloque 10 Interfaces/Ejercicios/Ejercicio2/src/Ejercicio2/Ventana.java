
package Ejercicio2;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Ventana extends JFrame{
    private JPanel panel;
    private JLabel imagenColocar;
    private ImageIcon imagenFutbol,imagenBaloncesto,imagenTenis,imagenNatación;
    private JRadioButton boton1,boton2,boton3,boton4;
    private ButtonGroup grupoBotones;
    
    
    public Ventana(){
        setSize(900,500);
        setTitle("Ejercicio 2");
        setLocationRelativeTo(null);
        
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        iniciarComponentes();
    }
    
    private void iniciarComponentes(){
        colocarPanel();
        colocarEtiqueta();
        colocarRadioBotones();
    }
    
    private void colocarPanel(){
        panel = new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
    }
    
    private void colocarEtiqueta(){
        JLabel etiqueta = new JLabel();
        etiqueta.setText("Escoja su deporte favorito");
        etiqueta.setBounds(20, 30, 300, 40);
        etiqueta.setFont(new Font("arial",0,25));
        panel.add(etiqueta);
        
        imagenes();
    }
    
    private void imagenes(){
        
        imagenColocar = new JLabel();
        imagenColocar.setBounds(290, 80, 550, 320);
        panel.add(imagenColocar);
        
        imagenFutbol = new ImageIcon(getClass().getResource("/Imagenes/futbol_imagen.jpg"));
        imagenBaloncesto = new ImageIcon(getClass().getResource("/Imagenes/baloncesto_imagen.jpg"));
        imagenTenis = new ImageIcon(getClass().getResource("/Imagenes/tenis_imagen.jpg"));
        imagenNatación = new ImageIcon(getClass().getResource("/Imagenes/natación_imagen.jpg"));
  
    }
    
    private void colocarRadioBotones(){
        colocarRadioBoton1();
        colocarRadioBoton2();
        colocarRadioBoton3();
        colocarRadioBoton4();
        
        grupoBotones = new ButtonGroup();
        grupoBotones.add(boton1);
        grupoBotones.add(boton2);
        grupoBotones.add(boton3);
        grupoBotones.add(boton4);
    }
    
    private void colocarRadioBoton1(){
        boton1 =  new JRadioButton();
        boton1.setBounds(20, 100, 200, 50);
        boton1.setText("Futbol");
        boton1.setFont(new Font("arial",1,25));
        panel.add(boton1);
        
        ActionListener oyente = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                imagenColocar.setIcon(new ImageIcon(imagenFutbol.getImage().getScaledInstance(imagenColocar.getWidth(), imagenColocar.getHeight(), Image.SCALE_SMOOTH)));
            }
        };
        
        boton1.addActionListener(oyente);
        
    }
    
    private void colocarRadioBoton2(){
        boton2 =  new JRadioButton();
        boton2.setBounds(20, 180, 200, 50);
        boton2.setText("Baloncesto");
        boton2.setFont(new Font("arial",1,25));
        panel.add(boton2);
        
        ActionListener oyente = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                imagenColocar.setIcon(new ImageIcon(imagenBaloncesto.getImage().getScaledInstance(imagenColocar.getWidth(), imagenColocar.getHeight(), Image.SCALE_SMOOTH)));
            }
        };
        
        boton2.addActionListener(oyente);
        
    }
    
    private void colocarRadioBoton3(){
        boton3 =  new JRadioButton();
        boton3.setBounds(20, 260, 200, 50);
        boton3.setText("Tenis");
        boton3.setFont(new Font("arial",1,25));
        panel.add(boton3);
        
        ActionListener oyente = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {   
                imagenColocar.setIcon(new ImageIcon(imagenTenis.getImage().getScaledInstance(imagenColocar.getWidth(), imagenColocar.getHeight(), Image.SCALE_SMOOTH)));
            }
        };
        
        boton3.addActionListener(oyente);
        
    }
    
    private void colocarRadioBoton4(){
        boton4 =  new JRadioButton();
        boton4.setBounds(20, 340, 200, 50);
        boton4.setText("Natación");
        boton4.setFont(new Font("arial",1,25));
        panel.add(boton4);
        
        ActionListener oyente = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                imagenColocar.setIcon(new ImageIcon(imagenNatación.getImage().getScaledInstance(imagenColocar.getWidth(), imagenColocar.getHeight(), Image.SCALE_SMOOTH)));
            }
        };
        
        boton4.addActionListener(oyente);
        
    }
    
    
}
