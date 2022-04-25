/*
    Ejercicio 11: Construir un programa que simule el funcionamiento de una calculadora que puede realizar las cuatro
operaciones aritméticas básicas(súma, resta, producto y división) con valores númericos enteros. El usuario debe especificar 
la operación con el primer carácter del primer parámetro de la linea de comandos: S o s para la suma, R o r para la resta P, p, 
M o m para el producto y D o d para la división.
*/
package ejercicio11;

import javax.swing.JOptionPane;

public class Ejercicio11 {
    
    public static void main(String[] args) {
        int valor1, valor2, suma, resta, mult, div;
        
        char operación;
        
        valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un valor: "));
        valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite otro valor: "));
        
        operación = JOptionPane.showInputDialog("Escriba el primer caracter de una de las operaciones de aritméticas básicas: ").charAt(0);
        
        switch(operación){
            case 'S' :
            case 's' :  suma = valor1 + valor2;
                JOptionPane.showMessageDialog(null, "La suma es: "+suma);
                break;
            
            case 'R' :
            case 'r' :  resta = valor1-valor2;
                JOptionPane.showMessageDialog(null, "La resta es: "+resta);
                break;
            case 'M' :
            case 'm' : 
            case 'P' : 
            case 'p' : mult = valor1*valor2;
            JOptionPane.showMessageDialog(null, "La multiplicación es: "+mult);
                break;
                
            case 'D' : 
            case 'd' : div= valor1 / valor2;
                JOptionPane.showMessageDialog(null, "La división es: "+div);
                break;
                
            default : JOptionPane.showMessageDialog(null, "La operación es invalida.");   
         }
    
    }

}
