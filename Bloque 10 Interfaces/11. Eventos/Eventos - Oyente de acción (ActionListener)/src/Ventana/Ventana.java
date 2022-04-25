
package Ventana;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Ventana extends JFrame{
    private static JPanel panel;
    private static JLabel saludo;
    private static JTextField campoTexto;
    private static JButton boton1;
    private static JTextArea areaTexto;
    
    public Ventana(){
        setSize(600, 570);
        setLocationRelativeTo(null);
        setTitle("Programa 1");
        
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        iniciarComponentes();
    }
    
    private void iniciarComponentes(){
        colocarPanel();
        colocarCampoTexto();
        //colocarEtiqueta();
        colocarAreaTexto();
        //colocarBoton();
    }
    
    private void colocarPanel(){
        panel = new JPanel();
        this.getContentPane().add(panel);
        panel.setLayout(null);
        
        //eventoDeMovimientoDeRaton();
        //eventoRuedaDelRaton();
    }
    
    private void colocarEtiqueta(){
        JLabel etiqueta = new JLabel();
        etiqueta.setText("Ingrese su nombre:");
        etiqueta.setBounds(35, 20, 225, 50);
        etiqueta.setFont(new Font("Berlin Sans FB Demi",0,25));
        panel.add(etiqueta);
        
        saludo = new JLabel();
        saludo.setBounds(35,185,400,50);
        saludo.setFont(new Font("arial",0,29));
        panel.add(saludo);
        
    }
    
    private void colocarCampoTexto(){
        campoTexto = new JTextField();
        campoTexto.setBounds(25, 35, 200, 35);
        panel.add(campoTexto);
        
        eventosDelTeclado();
    }
    
    private void colocarAreaTexto(){
        areaTexto = new JTextArea();
        areaTexto.setBounds(300, 35, 230, 330);
        panel.add(areaTexto);
        
        colocarScroll();
    }
    
    private void colocarScroll(){
        JScrollPane scroll = new JScrollPane(areaTexto,ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroll.setBounds(300, 35, 230, 330);
        panel.add(scroll);
    }
    
    private void colocarBoton(){
        boton1 = new JButton();
        boton1.setBounds(230, 400, 120, 40);
        boton1.setText("¡CLICK AQUI!");
        panel.add(boton1);

        //eventoOyenteDeAccion();
        //eventoOyenteDeRaton();
        
    }
    
    private void eventoOyenteDeAccion(){
        ActionListener oyente = new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                saludo.setText("Hola "+campoTexto.getText());
            }
        };
        
        boton1.addActionListener(oyente);
    }
    
    private void eventoOyenteDeRaton(){
        //Agregando oyente de raton - mouseListener
        MouseListener oyenteDeRaton = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(e.isAltDown()){
                    areaTexto.append("Alt\n");
                }
                else if(e.isControlDown()){
                    areaTexto.append("Control\n");
                }
                else if(e.isShiftDown()){
                    areaTexto.append("Shift\n");
                }
                else if(e.isMetaDown()){
                    areaTexto.append("Click Derecho\n");
                }
                else{
                areaTexto.append("Click Izquierdo\n");
                }
                if(e.getClickCount() == 2){
                    areaTexto.append("Doble click\n");
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {
                
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                
            }

            @Override
            public void mouseExited(MouseEvent e) {
                
            }
        };
        
        boton1.addMouseListener(oyenteDeRaton);
    }
    
    private void eventoDeMovimientoDeRaton(){
        MouseMotionListener oyenteMovimientoRaton = new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                areaTexto.append("MouseDragged\n");
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                areaTexto.append("MouseEvent\n");
            }
        };
        
        panel.addMouseMotionListener(oyenteMovimientoRaton);
    }
    
    private void eventoRuedaDelRaton(){
        MouseWheelListener ruedaRaton = new MouseWheelListener() {
            
            @Override
            public void mouseWheelMoved(MouseWheelEvent e) {
                if (e.getPreciseWheelRotation() == -1){
                    areaTexto.append("Rueda hacia arriba\n");
                }
                else if (e.getPreciseWheelRotation() == 1){
                    areaTexto.append("Rueda hacia abajo\n");
                }
            }
        };
        
        panel.addMouseWheelListener(ruedaRaton);
    }
    
    private void eventosDelTeclado(){
        KeyListener eventoTeclado = new KeyListener() {
            
            @Override
            public void keyTyped(KeyEvent e) {
                //areaTexto.append("keyTyped\n");
            }

            @Override
            public void keyPressed(KeyEvent e) {
                //areaTexto.append("keyPressed\n");
            }

            @Override
            public void keyReleased(KeyEvent e) {
                
                if(e.getKeyChar() == '\n'){
                    areaTexto.append(campoTexto.getText()+"\n");
                }
                
            }
        };
        campoTexto.addKeyListener(eventoTeclado);
    }
}
