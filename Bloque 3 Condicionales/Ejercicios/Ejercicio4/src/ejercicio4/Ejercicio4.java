/*
 Ejercicio 4: En MegaPlaza se hacen un 20% de descuento a los clientes cuya compra supere los  $300.
¿Cual será la cantidad que pagará una persona por su compra? 
*/
package ejercicio4;

import javax.swing.JOptionPane;

public class Ejercicio4 {

    
    public static void main(String[] args) {
        float precioDeCompra, descuento;
        
        precioDeCompra = Float.parseFloat(JOptionPane.showInputDialog("Digite la compra que hara en MegaPlaza: "));
        
        if(precioDeCompra > 300){
            descuento = precioDeCompra * 0.20f;
            precioDeCompra -= descuento;
            JOptionPane.showMessageDialog(null, "Usted pagara:"+ precioDeCompra);
        }
        else{
            JOptionPane.showMessageDialog(null, "Usted pagara"+ precioDeCompra);
        }
    }
    
}
