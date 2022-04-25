/*
    Ejercicio 13: Hacer un programa que simule un cajero automático con un saldo inicial de 1000 Dólares, con el siguiente menú de opciones:
   1. Ingresar dinero a la cuenta.
   2. Retirar dinero de la cuenta.
   3. Salir.
*/
package ejercicio13;

import javax.swing.JOptionPane;

public class Ejercicio13 {

    public static void main(String[] args) {
        final int saldo_Inicial = 1000;
        int opción;
        float ingreso, retiro, saldoActual;
        
        opción = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido a su cajero automatico\n"+
        "1. Ingresar dinero a la cuenta\n"+
        "2. Retirar dinero de la cuenta\n"+
        "3. Salir\n"));
        
        switch(opción){
            case 1 : ingreso = Float.parseFloat(JOptionPane.showInputDialog("Digite la cantidad de dinero a ingresar: "));
                saldoActual = saldo_Inicial + ingreso;
                JOptionPane.showMessageDialog(null, "El saldo actual de la cuenta es: $"+saldoActual);
                break;
            case 2 : retiro = Float.parseFloat(JOptionPane.showInputDialog("Digite la cantidad de dinero a retirar: "));
                if(saldo_Inicial > retiro){
                    saldoActual = saldo_Inicial - retiro;
                    JOptionPane.showMessageDialog(null, "El saldo actual de la cuenta es: $"+saldoActual);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Error, la cantidad de dinero a retirar excede el saldo actual de la cuenta.");
                }
                break;
            case 3 : break;
            default : JOptionPane.showMessageDialog(null, "Error");
          
        }
    }
    
    
}
