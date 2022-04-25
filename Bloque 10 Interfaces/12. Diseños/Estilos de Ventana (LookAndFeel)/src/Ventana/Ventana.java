
package Ventana;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

public class Ventana extends javax.swing.JFrame {
    private DefaultComboBoxModel<Persona>  modelo = new DefaultComboBoxModel<Persona>();     
    private DefaultTableModel modeloTabla = new DefaultTableModel();
    public Ventana() {
        llenarModeloComboBox();
        agregarModeloTabla();
        initComponents();
        
        setLocationRelativeTo(null);
    }
    
   private void agregarModeloTabla(){
       modeloTabla.addColumn("Nombres");
       modeloTabla.addColumn("Apellidos");
       modeloTabla.addColumn("Email");
       modeloTabla.addColumn("Celular");
       modeloTabla.addColumn("Dirección");
   }
    
    private void llenarModeloComboBox(){
        modelo.addElement(new Persona("Robertino", "Silvera", "rlucassilvera@gmail.com", "1123930943", "Zuviria 422"));
        modelo.addElement(new Persona("Franco", "Silvera", "francosilvera14@gmail.com", "2315640445", "Zuviria 422"));
        modelo.addElement(new Persona("Roberto", "Silvera Juncal", "rsilverajuncalgmail.com", "5031894123", "Zuviria 422"));
        modelo.addElement(new Persona("Myriam", "Correa", "myriamcorreas@gmail.com", "1154577943", "Zuviria 422"));
        modelo.addElement(new Persona("Tomas", "Lescano", "tomas.mago@gmail.com", "1454812385", "9 de Julio 6A"));
        modelo.addElement(new Persona("Ramiro", "Fontana", "ramira.fontana@gmail.com", "114432343", "Dr Nicolas Repetto 1350"));
        
        
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        EtiquetaPersona = new javax.swing.JLabel();
        botonInsertar = new javax.swing.JButton();
        scrollTabla = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        etiquetaDatos = new javax.swing.JLabel();
        etiquetaNombre = new javax.swing.JLabel();
        cajaNombre = new javax.swing.JTextField();
        etiquetaApellido = new javax.swing.JLabel();
        cajaApellido = new javax.swing.JTextField();
        etiquetaEmail = new javax.swing.JLabel();
        cajaEmail = new javax.swing.JTextField();
        etiquetaCelular = new javax.swing.JLabel();
        cajaCelular = new javax.swing.JTextField();
        etiquetaDirección = new javax.swing.JLabel();
        cajaDirección = new javax.swing.JTextField();
        comboPersonas = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        EtiquetaPersona.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        EtiquetaPersona.setText("Persona");

        botonInsertar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        botonInsertar.setText("Insertar persona");
        botonInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInsertarActionPerformed(evt);
            }
        });

        tabla.setModel(modeloTabla);
        ListSelectionListener oyenteSelección = new ListSelectionListener(){
            @Override
            public void valueChanged(ListSelectionEvent e){
                if(e.getValueIsAdjusting()){
                    int filaSeleccionada = tabla.getSelectedRow();

                    String nombre = (String)modeloTabla.getValueAt(filaSeleccionada, 0);
                    String apellido = (String)modeloTabla.getValueAt(filaSeleccionada, 1);
                    String email = (String)modeloTabla.getValueAt(filaSeleccionada, 2);
                    String celular = (String)modeloTabla.getValueAt(filaSeleccionada, 3);
                    String dirección = (String)modeloTabla.getValueAt(filaSeleccionada, 4);

                    cajaNombre.setText(nombre);
                    cajaApellido.setText(apellido);
                    cajaEmail.setText(email);
                    cajaCelular.setText(celular);
                    cajaDirección.setText(dirección);
                }

            }
        };

        tabla.getSelectionModel().addListSelectionListener(oyenteSelección);
        scrollTabla.setViewportView(tabla);

        etiquetaDatos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etiquetaDatos.setText("Datos de la persona");

        etiquetaNombre.setText("Nombre");

        cajaNombre.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cajaNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaNombreActionPerformed(evt);
            }
        });

        etiquetaApellido.setText("Apellido");

        cajaApellido.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cajaApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaApellidoActionPerformed(evt);
            }
        });

        etiquetaEmail.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        etiquetaEmail.setText("Email");

        cajaEmail.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        etiquetaCelular.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        etiquetaCelular.setText("Celular");

        cajaCelular.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        etiquetaDirección.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        etiquetaDirección.setText("Dirección");

        cajaDirección.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cajaDirección.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaDirecciónActionPerformed(evt);
            }
        });

        comboPersonas.setModel(modelo);
        comboPersonas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboPersonasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cajaDirección)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EtiquetaPersona)
                            .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelLayout.createSequentialGroup()
                                        .addComponent(comboPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                                        .addComponent(botonInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelLayout.createSequentialGroup()
                                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(etiquetaDatos)
                                            .addComponent(etiquetaDirección))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelLayout.createSequentialGroup()
                                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(etiquetaNombre)
                                            .addComponent(cajaNombre)
                                            .addComponent(etiquetaEmail)
                                            .addComponent(cajaEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(etiquetaApellido)
                                                .addComponent(cajaApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(cajaCelular, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(etiquetaCelular))))
                                .addComponent(scrollTabla, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(EtiquetaPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboPersonas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrollTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etiquetaDatos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetaApellido))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cajaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cajaApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaEmail)
                    .addComponent(etiquetaCelular))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cajaEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cajaCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(etiquetaDirección)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cajaDirección, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInsertarActionPerformed
        Persona p = (Persona) comboPersonas.getSelectedItem();
        
        String nombres = p.getNombre();
        String apellidos = p.getApellido();
        String email = p.getEmail();
        String celular = p.getCelular();
        String dirección = p.getDirección();
        
        String persona[] = {nombres,apellidos,email,celular,dirección};
        
        modeloTabla.addRow(persona);
    }//GEN-LAST:event_botonInsertarActionPerformed

    private void cajaNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaNombreActionPerformed
        
    }//GEN-LAST:event_cajaNombreActionPerformed

    private void cajaApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaApellidoActionPerformed
        
    }//GEN-LAST:event_cajaApellidoActionPerformed

    private void cajaDirecciónActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaDirecciónActionPerformed
        
    }//GEN-LAST:event_cajaDirecciónActionPerformed

    private void comboPersonasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboPersonasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboPersonasActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               
                new Ventana().setVisible(true);
            }
        });
        try {
            UIManager.setLookAndFeel("com.jtattoo.plaf.fast.FastLookAndFeel");
        } catch (ClassNotFoundException ex) {
            //Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            //Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
           // Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
           // Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EtiquetaPersona;
    private javax.swing.JButton botonInsertar;
    private javax.swing.JTextField cajaApellido;
    private javax.swing.JTextField cajaCelular;
    private javax.swing.JTextField cajaDirección;
    private javax.swing.JTextField cajaEmail;
    private javax.swing.JTextField cajaNombre;
    private javax.swing.JComboBox<Persona> comboPersonas;
    private javax.swing.JLabel etiquetaApellido;
    private javax.swing.JLabel etiquetaCelular;
    private javax.swing.JLabel etiquetaDatos;
    private javax.swing.JLabel etiquetaDirección;
    private javax.swing.JLabel etiquetaEmail;
    private javax.swing.JLabel etiquetaNombre;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel panel;
    private javax.swing.JScrollPane scrollTabla;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
