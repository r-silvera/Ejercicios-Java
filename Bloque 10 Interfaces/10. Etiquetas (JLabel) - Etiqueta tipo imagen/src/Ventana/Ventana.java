
package Ventana;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

public class Ventana extends JFrame{
    private static JPanel panel;
    
    public Ventana(){
        setSize(800, 500);
        setTitle("Programa");
        setLocationRelativeTo(null);
        
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        insertarComponentes();
        
    }
    
   private void insertarComponentes(){
      colocarPanel();
      //colocarRadioBotones();
      //colocarBotones();
      //colocarBotonesDeActivación();
      //colocarEtiquetas();
      //colocarCajasDeTexto();
      //colocarAreasDeTexto();
      //colocarCasillasDeVerificación();
      //colocarListasDesplegables();
      //colocarCampoDeContraseña();
      //colocarTablas();
      colocarListas();
   }
   
   private void colocarPanel(){
       panel = new JPanel();
       this.getContentPane().add(panel);
       panel.setLayout(null);
      
   }
   
   private void colocarEtiquetas(){
       //TITULO
       JLabel etiqueta = new JLabel();
       panel.add(etiqueta);
       etiqueta.setBounds(212, 40, 350, 50);
       etiqueta.setText("League Of Legends");
       etiqueta.setForeground(Color.WHITE);
       etiqueta.setFont(new Font("Berlin Sans FB Demi",0,36));
       etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
       
       //IMAGEN DE FONDO
       ImageIcon imagen = new ImageIcon("lol_imagen2.jpg");
       JLabel etiqueta2 = new JLabel();
       panel.add(etiqueta2);
       etiqueta2.setBounds(0, 0, 800, 500); 
       etiqueta2.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(etiqueta2.getWidth(), etiqueta2.getHeight(), Image.SCALE_SMOOTH)));
   }
   
   private void colocarBotones()    {
       //Boton 1 - boton de texto
       JButton boton1 = new JButton();
       boton1.setBounds(330, 350, 120, 40);
       panel.add(boton1);       
       boton1.setEnabled(true); // Establecemos si esta habilitado o no boton;
       boton1.setText("Click aqui");
       boton1.setForeground(Color.ORANGE);
       boton1.setFont(new Font("Berlin Sans FB Demi", 0, 15));
       
       //Boton 2 - boton de imagen
       ImageIcon clickAqui = new ImageIcon("boton-clic-aqui.png");
       JButton boton2 = new JButton();
       boton2.setBounds(330,250,120,40);
       panel.add(boton2);
       boton2.setIcon(new ImageIcon(clickAqui.getImage().getScaledInstance(boton2.getWidth(), boton2.getHeight(), Image.SCALE_SMOOTH)));
       
       //Boton 3 - boton de bordes
       /*
       JButton boton3 = new JButton();
       panel.add(boton3);
       boton3.setBounds(100, 300, 110, 50);
       boton3.setBorder(BorderFactory.createLineBorder(Color.GREEN, 4, false));
       */
   }
   
   private void colocarRadioBotones(){
       //Creamos el radioBoton1
       JRadioButton radioBoton1 = new JRadioButton("Opción 1",false);
       radioBoton1.setBounds(50, 100, 100, 50);
       panel.add(radioBoton1);
       radioBoton1.setForeground(Color.WHITE);
       
       //Hacemos transparente el radioBoton1
       radioBoton1.setFocusPainted(false);
       radioBoton1.setBorderPainted(false);
       radioBoton1.setContentAreaFilled(false);
       
       //Creamos el radioBoton3
       JRadioButton radioBoton2 = new JRadioButton("Opción 2",false);
       radioBoton2.setBounds(50, 150, 100, 50);
       panel.add(radioBoton2);
       radioBoton2.setForeground(Color.WHITE);
       
       //Hacemos transparente el radioBoton2
       radioBoton2.setFocusPainted(false);
       radioBoton2.setBorderPainted(false);
       radioBoton2.setContentAreaFilled(false);
       
       //Creamos el radioBoton3
       JRadioButton radioBoton3 = new JRadioButton("Opción 3",false);
       radioBoton3.setBounds(50, 200, 100, 50);
       panel.add(radioBoton3);
       radioBoton3.setForeground(Color.WHITE);
       
       //Hacemos transparente el radioBoton3
       radioBoton3.setFocusPainted(false);
       radioBoton3.setBorderPainted(false);
       radioBoton3.setContentAreaFilled(false);
       
       //Creamos un grupo de botones y metemos a todos los botones que hicimos
       ButtonGroup grupoRadioBotones = new ButtonGroup();
       grupoRadioBotones.add(radioBoton1);
       grupoRadioBotones.add(radioBoton2);
       grupoRadioBotones.add(radioBoton3);
   }
   
   private void colocarBotonesDeActivación(){
       JToggleButton botonActivación1 = new JToggleButton("Opción 1", true);
       botonActivación1.setBounds(50, 300, 100, 50);
       panel.add(botonActivación1);
   }
   
   private void colocarCajasDeTexto(){
       JTextField cajaTexto = new JTextField();
       cajaTexto.setBounds(50, 50, 200, 30);
       panel.add(cajaTexto);
       cajaTexto.setText("Hola...");
   }
   
   private void colocarAreasDeTexto(){
       JTextArea areaTexto = new JTextArea();
       areaTexto.setBounds(20, 20, 300, 200);
       panel.add(areaTexto);
       areaTexto.setText("Escriba el texto aqui...");
       areaTexto.append("\nEscribe por aqui..."); //Añade mas texto al area
       areaTexto.setEditable(true); //Editar area de texto

       
       JScrollPane barrasDesplazamiento = new JScrollPane(areaTexto);
       barrasDesplazamiento.setBounds(20, 20, 300, 200);
       barrasDesplazamiento.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
       barrasDesplazamiento.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
       
       panel.add(barrasDesplazamiento);
   }
   
   private void colocarCasillasDeVerificación(){
       JCheckBox casillaVerificación1 = new JCheckBox("Leches");
       casillaVerificación1.setBounds(20, 20, 100, 40);
       panel.add(casillaVerificación1);
       
       JCheckBox casillaVerificación2 = new JCheckBox("Galletas");
       casillaVerificación2.setBounds(20, 50, 100, 40);
       panel.add(casillaVerificación2);
       
       JCheckBox casillaVerificación3 = new JCheckBox("Yogurt");
       casillaVerificación3.setBounds(20, 80, 100, 40);
       panel.add(casillaVerificación3);
       
       JCheckBox casillaVerificación4 = new JCheckBox("Cereal");
       casillaVerificación4.setBounds(20, 110, 100, 40);
       panel.add(casillaVerificación4);
   }
   
   private void colocarListasDesplegables(){
      /*
       String paises[] = {"Argentina","Peru","Chile","Uruguay"};
       
       JComboBox listaDesplegable = new JComboBox(paises); 
       listaDesplegable.setBounds(20, 20, 100, 30);
       
       listaDesplegable.addItem("Bolivia"); //Agregar objetos a tu lista
       listaDesplegable.setSelectedItem("Chile"); //Seleccionar el primer objeto visto
       panel.add(listaDesplegable);
       */

      DefaultComboBoxModel modelo = new DefaultComboBoxModel();
      JComboBox listaDesplegable = new JComboBox(modelo);
      
      Persona persona1 = new Persona("Robertino", 19, "Argentino");
      modelo.addElement(persona1);
      Persona persona2 = new Persona("Franco", 12, "Argentino");
      modelo.addElement(persona2);
      
      listaDesplegable.setBounds(20, 20, 200, 30);
      panel.add(listaDesplegable);
}
   
   private void colocarCampoDeContraseña(){
       JPasswordField campoContraseña = new JPasswordField();
       campoContraseña.setBounds(20, 20, 150, 30);
       campoContraseña.setText("25mayo2002MMO");
       panel.add(campoContraseña);
       
       String contraseña = "";
       
       for (int i = 0; i < campoContraseña.getPassword().length; i++) {
           contraseña += campoContraseña.getPassword()[i];
       }
       
       System.out.println("Contraseña: "+ contraseña);
   }
   
   private void colocarTablas(){
       DefaultTableModel modelo = new DefaultTableModel();
       
       String [] persona1 = {"Alejandro","21","Peruana"};
       String [] persona2 = {"Robertino","19","Argentino"};
       
       modelo.addColumn("Nombre");
       modelo.addColumn("Edad");
       modelo.addColumn("Nacionalidad");
       
       modelo.addRow(persona1);
       modelo.addRow(persona2);
       
       JTable tabla = new JTable(modelo);
       tabla.setBounds(20, 20, 300, 200);
       panel.add(tabla);
       
       JScrollPane scroll = new JScrollPane(tabla,ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
       scroll.setBounds(20, 20, 300, 200);
       panel.add(scroll);
   }
   
   private void colocarListas(){
       DefaultListModel modelo = new DefaultListModel();
       
       modelo.addElement(new Persona("Robertino Silvera",19,"Argentina"));
       modelo.addElement(new Persona("Franco Silvera",12,"Argentina"));
       
       JList lista = new JList(modelo);
       lista.setBounds(20, 20, 200, 300);
       panel.add(lista);
       
       JScrollPane scroll = new JScrollPane(lista,ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
       scroll.setBounds(20, 20, 200, 300);
       panel.add(scroll);
   }
}

