/*
    Ejercicio 3: Hacer un programa que lea un carácter por teclado y compruebe si es una letra mayúscula.
*/
package ejercicio3;

import javax.swing.JOptionPane;


public class Ejercicio3 {

    public static void main(String[] args) {
       char letra;
       
      letra = JOptionPane.showInputDialog("Escriba una letra:").charAt(0);
       
       if(Character.isUpperCase(letra)){
           JOptionPane.showMessageDialog(null, "Es mayuscula");
       }
       else{
           JOptionPane.showMessageDialog(null, "Es minuscula");
       }
    }
    
}
