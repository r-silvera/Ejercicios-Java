
package Ejercicio1;

import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args){
        Cuadrilatero c1;
        float lado1, lado2;
        
        lado1 = Float.parseFloat(JOptionPane.showInputDialog("Digite un lado del cuadrilatero: "));
        lado2 = Float.parseFloat(JOptionPane.showInputDialog("Digite otro lado del cuadrilatero: "));
        
        if(lado1 != lado2){
            c1 = new Cuadrilatero(lado1, lado2);
        }
        else{
            c1 = new Cuadrilatero(lado1);
        }
        
        System.out.println("El perimetro del cuadrilatero es: "+c1.getPerimetro());
        
        System.out.println("El area del cuadrilatero es: "+c1.getArea());
    }
}
