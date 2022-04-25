/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package entrada.y.salida.de.datos.por.ventanas;

import javax.swing.JOptionPane;

/**
 *
 * @author t1no
 */
public class EntradaYSalidaDeDatosPorVentanas {

    public static void main(String[] args) {
        String cadena;
        int entero;
        char letra;
        double decimal;
        
       entero = Integer.parseInt(JOptionPane.showInputDialog("Escribe un número entero: "));
       JOptionPane.showMessageDialog(null, "el número entero es: " + entero );
    }
}