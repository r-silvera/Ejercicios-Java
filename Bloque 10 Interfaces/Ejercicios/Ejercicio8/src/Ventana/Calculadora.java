/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ventana;

import java.math.MathContext;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


public class Calculadora extends javax.swing.JFrame {
    private String númeroActual = "";
    private String resultado = "";
    private float a,b;
    private boolean esUnaCuenta = false;
    private static int operación = 0;
    private boolean punto = true;
    private boolean raiz = false;
    /**
     * Creates new form NewJFrame
     */
    public Calculadora() {
        initComponents();
        setSize(300,450);
        setLocationRelativeTo(null);
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        panel = new javax.swing.JPanel();
        etiquetaMuestra = new javax.swing.JLabel();
        etiquetaNúmeros = new javax.swing.JLabel();
        botonC = new javax.swing.JButton();
        botonRaizCuadrada = new javax.swing.JButton();
        botonDividir = new javax.swing.JButton();
        botonBorrar = new javax.swing.JButton();
        boton7 = new javax.swing.JButton();
        boton8 = new javax.swing.JButton();
        boton9 = new javax.swing.JButton();
        botonMultiplicar = new javax.swing.JButton();
        boton4 = new javax.swing.JButton();
        boton5 = new javax.swing.JButton();
        boton6 = new javax.swing.JButton();
        botonRestar = new javax.swing.JButton();
        boton1 = new javax.swing.JButton();
        boton2 = new javax.swing.JButton();
        boton3 = new javax.swing.JButton();
        botonSumar = new javax.swing.JButton();
        botonMasMenos = new javax.swing.JButton();
        boton0 = new javax.swing.JButton();
        botonComa = new javax.swing.JButton();
        botonIgual = new javax.swing.JButton();
        barraMenu = new javax.swing.JMenuBar();
        menu1 = new javax.swing.JMenu();
        calculadoraEstandar = new javax.swing.JMenuItem();
        conversorDivisas = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        salir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");
        setPreferredSize(new java.awt.Dimension(300, 450));

        panel.setLayout(new java.awt.GridBagLayout());

        etiquetaMuestra.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        etiquetaMuestra.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        panel.add(etiquetaMuestra, gridBagConstraints);

        etiquetaNúmeros.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        etiquetaNúmeros.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        etiquetaNúmeros.setText("0");
        etiquetaNúmeros.setToolTipText("");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        panel.add(etiquetaNúmeros, gridBagConstraints);

        botonC.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        botonC.setForeground(new java.awt.Color(0, 0, 0));
        botonC.setText("C");
        botonC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(botonC, gridBagConstraints);

        botonRaizCuadrada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/raiz.png"))); // NOI18N
        botonRaizCuadrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRaizCuadradaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(botonRaizCuadrada, gridBagConstraints);

        botonDividir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/dividir.png"))); // NOI18N
        botonDividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDividirActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(botonDividir, gridBagConstraints);

        botonBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/borrar.png"))); // NOI18N
        botonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBorrarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(botonBorrar, gridBagConstraints);

        boton7.setBackground(new java.awt.Color(204, 204, 204));
        boton7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        boton7.setText("7");
        boton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton7ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(boton7, gridBagConstraints);

        boton8.setBackground(new java.awt.Color(204, 204, 204));
        boton8.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        boton8.setText("8");
        boton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton8ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(boton8, gridBagConstraints);

        boton9.setBackground(new java.awt.Color(204, 204, 204));
        boton9.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        boton9.setText("9");
        boton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton9ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(boton9, gridBagConstraints);

        botonMultiplicar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        botonMultiplicar.setForeground(new java.awt.Color(0, 0, 0));
        botonMultiplicar.setText("X");
        botonMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMultiplicarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(botonMultiplicar, gridBagConstraints);

        boton4.setBackground(new java.awt.Color(204, 204, 204));
        boton4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        boton4.setText("4");
        boton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton4ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(boton4, gridBagConstraints);

        boton5.setBackground(new java.awt.Color(204, 204, 204));
        boton5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        boton5.setText("5");
        boton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton5ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(boton5, gridBagConstraints);

        boton6.setBackground(new java.awt.Color(204, 204, 204));
        boton6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        boton6.setText("6");
        boton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton6ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(boton6, gridBagConstraints);

        botonRestar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        botonRestar.setForeground(new java.awt.Color(0, 0, 0));
        botonRestar.setText("-");
        botonRestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRestarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(botonRestar, gridBagConstraints);

        boton1.setBackground(new java.awt.Color(204, 204, 204));
        boton1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        boton1.setText("1");
        boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(boton1, gridBagConstraints);

        boton2.setBackground(new java.awt.Color(204, 204, 204));
        boton2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        boton2.setText("2");
        boton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(boton2, gridBagConstraints);

        boton3.setBackground(new java.awt.Color(204, 204, 204));
        boton3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        boton3.setText("3");
        boton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton3ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(boton3, gridBagConstraints);

        botonSumar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        botonSumar.setForeground(new java.awt.Color(0, 0, 0));
        botonSumar.setText("+");
        botonSumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSumarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(botonSumar, gridBagConstraints);

        botonMasMenos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/masmenos.png"))); // NOI18N
        botonMasMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMasMenosActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(botonMasMenos, gridBagConstraints);

        boton0.setBackground(new java.awt.Color(204, 204, 204));
        boton0.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        boton0.setText("0");
        boton0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton0ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(boton0, gridBagConstraints);

        botonComa.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        botonComa.setForeground(new java.awt.Color(0, 0, 0));
        botonComa.setText(".");
        botonComa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonComaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(botonComa, gridBagConstraints);

        botonIgual.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        botonIgual.setForeground(new java.awt.Color(0, 0, 0));
        botonIgual.setText("=");
        botonIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIgualActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(botonIgual, gridBagConstraints);

        menu1.setText("Usos");
        menu1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        calculadoraEstandar.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        calculadoraEstandar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/calculadora.png"))); // NOI18N
        calculadoraEstandar.setText("Calculadora Estándar");
        menu1.add(calculadoraEstandar);

        conversorDivisas.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        conversorDivisas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/divisas.png"))); // NOI18N
        conversorDivisas.setText("Conversor de Divisas");
        conversorDivisas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conversorDivisasActionPerformed(evt);
            }
        });
        menu1.add(conversorDivisas);
        menu1.add(jSeparator2);

        salir.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir.png"))); // NOI18N
        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        menu1.add(salir);

        barraMenu.add(menu1);

        setJMenuBar(barraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void conversorDivisasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conversorDivisasActionPerformed
        ConversorDivisas conversor = new ConversorDivisas();
        conversor.setVisible(true);
        
        dispose();
    }//GEN-LAST:event_conversorDivisasActionPerformed

    private void boton0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton0ActionPerformed
        si_TieneMasDe12CaracteresAgrandarPantalla(númeroActual);
        númeroActual= etiquetaNúmeros.getText();
        
         if((etiquetaNúmeros.getText() != "0") && (esUnaCuenta == false)){
          if(operación == -1){
                etiquetaNúmeros.setText("0");
                operación = 0;
            }
            else{
                etiquetaNúmeros.setText(númeroActual+"0");
            }
       }
        else{
            etiquetaNúmeros.setText("0");
            esUnaCuenta = false;
        }
      
    }//GEN-LAST:event_boton0ActionPerformed

    private void boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton1ActionPerformed
        si_TieneMasDe12CaracteresAgrandarPantalla(númeroActual);
        númeroActual = etiquetaNúmeros.getText();
        
        if((etiquetaNúmeros.getText() != "0") && (esUnaCuenta == false)){
            if(operación == -1){
                etiquetaNúmeros.setText("1");
                operación = 0;
            }
            else{
                etiquetaNúmeros.setText(númeroActual+"1");
            }
       }
        else{
            
            etiquetaNúmeros.setText("1");
            esUnaCuenta = false;
            
        }
    }//GEN-LAST:event_boton1ActionPerformed

    private void boton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton2ActionPerformed
        si_TieneMasDe12CaracteresAgrandarPantalla(númeroActual);
        númeroActual = etiquetaNúmeros.getText();
        
        if((etiquetaNúmeros.getText() != "0") && (esUnaCuenta == false)){
           if(operación == -1){
                etiquetaNúmeros.setText("2");
                operación = 0;
            }
            else{
                etiquetaNúmeros.setText(númeroActual+"2");
            }
       }
        else{
            etiquetaNúmeros.setText("2");
            esUnaCuenta = false;
        }
    }//GEN-LAST:event_boton2ActionPerformed

    private void boton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton3ActionPerformed
        si_TieneMasDe12CaracteresAgrandarPantalla(númeroActual);
        númeroActual = etiquetaNúmeros.getText();
        
        if((etiquetaNúmeros.getText() != "0") && (esUnaCuenta == false)){
           if(operación == -1){
                etiquetaNúmeros.setText("3");
                operación = 0;
            }
            else{
                etiquetaNúmeros.setText(númeroActual+"3");
            }
       }
        else{
            etiquetaNúmeros.setText("3");
            esUnaCuenta = false;
        }
    }//GEN-LAST:event_boton3ActionPerformed

    private void boton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton4ActionPerformed
        si_TieneMasDe12CaracteresAgrandarPantalla(númeroActual);
        númeroActual = etiquetaNúmeros.getText();
        
        if((etiquetaNúmeros.getText() != "0") && (esUnaCuenta == false)){
           if(operación == -1){
                etiquetaNúmeros.setText("4");
                operación = 0;
            }
            else{
                etiquetaNúmeros.setText(númeroActual+"4");
            }
       }
        else{
            etiquetaNúmeros.setText("4");
            esUnaCuenta = false;
        }
    }//GEN-LAST:event_boton4ActionPerformed

    private void boton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton5ActionPerformed
        si_TieneMasDe12CaracteresAgrandarPantalla(númeroActual);
        númeroActual = etiquetaNúmeros.getText();
        
        if((etiquetaNúmeros.getText() != "0") && (esUnaCuenta == false)){
           if(operación == -1){
                etiquetaNúmeros.setText("5");
                operación = 0;
            }
            else{
                etiquetaNúmeros.setText(númeroActual+"5");
            }
       }
        else{
            etiquetaNúmeros.setText("5");
            esUnaCuenta = false;
        }
        
    }//GEN-LAST:event_boton5ActionPerformed

    private void boton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton6ActionPerformed
        si_TieneMasDe12CaracteresAgrandarPantalla(númeroActual);
        númeroActual = etiquetaNúmeros.getText();
        
        if((etiquetaNúmeros.getText() != "0") && (esUnaCuenta == false)){
           if(operación == -1){
                etiquetaNúmeros.setText("6");
                operación = 0;
            }
            else{
                etiquetaNúmeros.setText(númeroActual+"6");
            }
       }
        else{
            etiquetaNúmeros.setText("6");
            esUnaCuenta = false;
        }
    }//GEN-LAST:event_boton6ActionPerformed

    private void boton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton7ActionPerformed
        si_TieneMasDe12CaracteresAgrandarPantalla(númeroActual);
        númeroActual = etiquetaNúmeros.getText();
        
        if((etiquetaNúmeros.getText() != "0") && (esUnaCuenta == false)){
           if(operación == -1){
                etiquetaNúmeros.setText("7");
                operación = 0;
            }
            else{
                etiquetaNúmeros.setText(númeroActual+"7");
            }
       }
        else{
            etiquetaNúmeros.setText("7");
            esUnaCuenta = false;
        }
    }//GEN-LAST:event_boton7ActionPerformed

    private void boton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton8ActionPerformed
        si_TieneMasDe12CaracteresAgrandarPantalla(númeroActual);
        númeroActual = etiquetaNúmeros.getText();
        
        if((etiquetaNúmeros.getText() != "0") && (esUnaCuenta == false)){
           if(operación == -1){
                etiquetaNúmeros.setText("8");
                operación = 0;
            }
            else{
                etiquetaNúmeros.setText(númeroActual+"8");
            }       }
        else{
            etiquetaNúmeros.setText("8");
            esUnaCuenta = false;
        }
    }//GEN-LAST:event_boton8ActionPerformed

    private void boton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton9ActionPerformed
        si_TieneMasDe12CaracteresAgrandarPantalla(númeroActual);
        númeroActual = etiquetaNúmeros.getText();
        
        if((etiquetaNúmeros.getText() != "0") && (esUnaCuenta == false)){
          if(operación == -1){
                etiquetaNúmeros.setText("9");
                operación = 0;
            }
            else{
                etiquetaNúmeros.setText(númeroActual+"9");
            }
       }
        else{
            etiquetaNúmeros.setText("9");
            esUnaCuenta = false;
        }
    }//GEN-LAST:event_boton9ActionPerformed

    private void botonComaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonComaActionPerformed
        númeroActual = etiquetaNúmeros.getText();
            if(punto == true){
                if(operación == -1){
                etiquetaNúmeros.setText("0.");
                operación = 0;
                
                }   
                 else{
                    etiquetaNúmeros.setText(númeroActual+".");
             } 
            punto = false;
        }
    }//GEN-LAST:event_botonComaActionPerformed

    private void botonCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCActionPerformed
        etiquetaMuestra.setText("");
        etiquetaNúmeros.setText("0");
        punto = true;
    }//GEN-LAST:event_botonCActionPerformed

    private void botonSumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSumarActionPerformed
        if(etiquetaMuestra.getText().isEmpty()|| raiz == true){
            númeroActual = etiquetaNúmeros.getText();
            a = Float.valueOf(númeroActual);
            etiquetaMuestra.setText(númeroActual+" +");
            esUnaCuenta = true;
            operación = 1;
            punto = true;
        }
    }//GEN-LAST:event_botonSumarActionPerformed

    private void botonRestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRestarActionPerformed
        if(etiquetaMuestra.getText().isEmpty()|| raiz == true){
            númeroActual = etiquetaNúmeros.getText();
            a = Float.valueOf(númeroActual);
            etiquetaMuestra.setText(númeroActual+" -");
            esUnaCuenta = true;
            operación = 2;
            punto = true;
        }
    }//GEN-LAST:event_botonRestarActionPerformed

    private void botonIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIgualActionPerformed
        if(operación != 0){
            punto = true;    
            System.out.println(a);
            b = Float.valueOf(etiquetaNúmeros.getText());
            System.out.println(b);
            
            switch(operación){
                case 1: resultado = String.valueOf(a + b);
                    etiquetaNúmeros.setText(resultado);
                    etiquetaMuestra.setText("");
                        
                    break;
                
                case 2: resultado = String.valueOf(a - b);
                    etiquetaNúmeros.setText(resultado);
                    etiquetaMuestra.setText("");
                    
                    break;
                    
                case 3: resultado = String.valueOf(a * b);
                    etiquetaNúmeros.setText(resultado);
                    etiquetaMuestra.setText("");
                    
                    break;
                    
                case 4: resultado = String.format("%.2f",(a * b));
                    etiquetaNúmeros.setText(resultado);
                    etiquetaMuestra.setText("");
                
                    
                default : etiquetaNúmeros.setText(resultado);
                    break;
            }
            a = 0;
            b = 0;
            operación = -1;
            esUnaCuenta = false;      
            punto = true;
            raiz = false;
        }
    }//GEN-LAST:event_botonIgualActionPerformed

    private void botonMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMultiplicarActionPerformed
       if(etiquetaMuestra.getText().isEmpty()|| raiz == true){
            númeroActual = etiquetaNúmeros.getText();
            a = Float.valueOf(númeroActual);
            etiquetaMuestra.setText(númeroActual+" *");
            esUnaCuenta = true;
            operación = 3;
            punto = true;
        }

    }//GEN-LAST:event_botonMultiplicarActionPerformed

    private void botonDividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDividirActionPerformed
        if(etiquetaMuestra.getText().isEmpty()|| raiz == true){
            númeroActual = etiquetaNúmeros.getText();
            a = Float.valueOf(númeroActual);
            etiquetaMuestra.setText(númeroActual+" /");
            esUnaCuenta = true;
            operación = 4;
            punto = true;
        }

    }//GEN-LAST:event_botonDividirActionPerformed

    private void botonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBorrarActionPerformed
            String cadenaMenosUltimaLetra = etiquetaNúmeros.getText();
            punto = true;

            if(etiquetaNúmeros.getText().length() != 1){
                
                cadenaMenosUltimaLetra = cadenaMenosUltimaLetra.substring(0, cadenaMenosUltimaLetra.length()-1);
                etiquetaNúmeros.setText(cadenaMenosUltimaLetra);
                
            }
            else{
                etiquetaNúmeros.setText("0");
            }
            
        
    }//GEN-LAST:event_botonBorrarActionPerformed

    private void botonRaizCuadradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRaizCuadradaActionPerformed
                si_TieneMasDe12CaracteresAgrandarPantalla(etiquetaNúmeros.getText());
                númeroActual = etiquetaNúmeros.getText();
                a = Float.valueOf(númeroActual);
                etiquetaMuestra.setText("sqrt("+númeroActual+")");
                if((Math.sqrt(a) > Math.sqrt(a)%.2f) && (getSize().width < 500)){
                    resultado = String.valueOf(Math.sqrt(a));
                    setSize(getSize().width+100, getSize().height+10);
                }
                else{
                    resultado = String.valueOf(Math.sqrt(a));
                }
                etiquetaNúmeros.setText(resultado);
                
                punto = true;
                raiz = true;
    }//GEN-LAST:event_botonRaizCuadradaActionPerformed

    private void botonMasMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMasMenosActionPerformed
        if(etiquetaMuestra.getText().isEmpty()|| raiz == true){
            si_TieneMasDe12CaracteresAgrandarPantalla(etiquetaNúmeros.getText());
            if(etiquetaNúmeros.getText().charAt(0) == '-'){
                númeroActual = etiquetaNúmeros.getText();
                etiquetaNúmeros.setText(númeroActual.replace("-", ""));
            }
            else{
                númeroActual = etiquetaNúmeros.getText();
                etiquetaNúmeros.setText("-"+númeroActual);
            }
        }
    }//GEN-LAST:event_botonMasMenosActionPerformed

    /**
     * @param args the command line arguments
     * 
     * 
     */
    
    public void si_TieneMasDe12CaracteresAgrandarPantalla(String a){
        if((a.length() == 12)){
            if(getSize().width <= 550 && getSize().height <= 450){
                setSize(getSize().width+250, getSize().height+100);
                setLocationRelativeTo(null);
                if(operación == -1){
                    etiquetaNúmeros.setText("0");
                }
            }
        }
        if(a.length()>24){
            JOptionPane.showMessageDialog(null, "Error, número fuera de rango.");
            JOptionPane.showMessageDialog(null, "El rango maximo de números permitidos es de 23 cifras.");
            etiquetaNúmeros.setText("0");
            setSize(300, 450);
            setLocationRelativeTo(null);
            if(operación == -1){
                    etiquetaNúmeros.setText("0");
                }
        }
    }
    
    public static void main(String args[]) {
        
        
        
        
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        try {
            //</editor-fold>
            //</editor-fold>
            UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
        } catch (ClassNotFoundException ex) {
            //Logger.getLogger(Calculadora.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            //Logger.getLogger(Calculadora.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            //Logger.getLogger(Calculadora.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            //Logger.getLogger(Calculadora.class.getName()).log(Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
                
            }
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JButton boton0;
    private javax.swing.JButton boton1;
    private javax.swing.JButton boton2;
    private javax.swing.JButton boton3;
    private javax.swing.JButton boton4;
    private javax.swing.JButton boton5;
    private javax.swing.JButton boton6;
    private javax.swing.JButton boton7;
    private javax.swing.JButton boton8;
    private javax.swing.JButton boton9;
    private javax.swing.JButton botonBorrar;
    private javax.swing.JButton botonC;
    private javax.swing.JButton botonComa;
    private javax.swing.JButton botonDividir;
    private javax.swing.JButton botonIgual;
    private javax.swing.JButton botonMasMenos;
    private javax.swing.JButton botonMultiplicar;
    private javax.swing.JButton botonRaizCuadrada;
    private javax.swing.JButton botonRestar;
    private javax.swing.JButton botonSumar;
    private javax.swing.JMenuItem calculadoraEstandar;
    private javax.swing.JMenuItem conversorDivisas;
    private javax.swing.JLabel etiquetaMuestra;
    private javax.swing.JLabel etiquetaNúmeros;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JMenu menu1;
    private javax.swing.JPanel panel;
    private javax.swing.JMenuItem salir;
    // End of variables declaration//GEN-END:variables
}
