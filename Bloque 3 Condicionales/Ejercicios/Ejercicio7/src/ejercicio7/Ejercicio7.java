/*
    Ejercicio 7: Pedir 3 números y mostrarlos ordenados de mayor a menor.
*/
package ejercicio7;

import javax.swing.JOptionPane;

public class Ejercicio7 {

    public static void main(String[] args) {
        int número1, número2, número3;
        
    número1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el primer número: "));
    
    número2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo número: "));
    
    número3 = Integer.parseInt(JOptionPane.showInputDialog("Digite el tercer número: "));
        
    if((número1 > número2) && (número2 > número3)){
        JOptionPane.showMessageDialog(null, "Los números ordenados de mayor a menor son:\n"+número1+"\n"+número2+"\n"+número3);
    }
    else if((número1 > número3) && (número3 > número2)){
        JOptionPane.showMessageDialog(null, "Los números ordenados de mayor a menos son:\n"+número1+"\n"+número3+"\n"+número2);
    }
    else if((número2 > número1) && (número1 > número3)){
        JOptionPane.showMessageDialog(null, "Los números ordenados de mayor a menos son:\n"+número2+"\n"+número1+"\n"+número3);
    }
    else if((número2 > número3)&&(número3>número1)){
        JOptionPane.showMessageDialog(null, "Los números ordenados de mayor a menos son:\n"+número2+"\n"+número3+"\n"+número1);
    }
    else if((número3 > número1)&&(número1>número2)){
        JOptionPane.showMessageDialog(null, "Los números ordenados de mayor a menos son:\n"+número3+"\n"+número1+"\n"+número2);
    }
    else{
        JOptionPane.showMessageDialog(null, "Los números ordenados de mayor a menos son:\n"+número3+"\n"+número2+"\n"+número1);
    }
   
  }
    
}
