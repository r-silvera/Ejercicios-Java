/*
    Ejercicio 17: Una empresa que se dedica a la venta de desinfectantes necesita un programa para gestionar
las facturas. En cada factura figura: el código del artículo, la cantidad vendida en litros y el precio por litro.
Se pide de 5 facturas introducidas: Facturación total, cantidad en litros vendidos del articulo 1 y cuantas facturas
se emitieron de mas de $600
*/
package ejercicio17;

import javax.swing.JOptionPane;

public class Ejercicio17 {

    public static void main(String[] args) {
       int codigo, litros, litrosDelArticulo1 = 0, conteoDeFacturasDeMasDe600 = 0;
       float precioLitro, facturaciónTotal = 0, importeFactura;
       
       for(int i=1; i<=5; i++){
           codigo = Integer.parseInt(JOptionPane.showInputDialog("Articulo N°"+i+"\nDigite el codigo: "));
           litros = Integer.parseInt(JOptionPane.showInputDialog("Articulo N°"+i+"\nDigite la cantidad vendida de litros: "));
           precioLitro = Float.parseFloat(JOptionPane.showInputDialog("Articulo N°"+i+"\nDigite el precio por litro: "));
           
           importeFactura = (float)litros * precioLitro;
           
           facturaciónTotal += importeFactura;
           
           if(codigo == 1){
               litrosDelArticulo1 += litros;
           }
           
           if(importeFactura > 600){
               conteoDeFacturasDeMasDe600++;
           }
           
       }
        System.out.println("Resumen de Ventas: ");
        System.out.println("La facturación total es: "+facturaciónTotal);
        System.out.println("Cantidad de litros vendidos en el articulo 1 es: "+litrosDelArticulo1);
        System.out.println("Cantidad de facturas que se emitieron a más de $600 es: "+conteoDeFacturasDeMasDe600);
    }
    
}
