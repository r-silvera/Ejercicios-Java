/*
    Ejercicio 18: Hacer unas modificaciones al ejercicio anterior suponiendo que no se introduce el precio por litro.
Solo existen tres productos con precios: 
1- 0.6 $/litro.
2- 3 $/litro.
3- 1,25 $/litro

*/
package ejercicio18;

import javax.swing.JOptionPane;

public class Ejercicio18 {

    public static void main(String[] args){
       int codigo, litros, litrosDelArticulo1 = 0, conteoDeFacturasDeMasDe600 = 0;
       float precioLitro = 0, facturaciónTotal = 0, importeFactura;
       
       for(int i=1; i<=5; i++){
           do{
               codigo = Integer.parseInt(JOptionPane.showInputDialog("Articulo N°"+i+"\nDigite el codigo: "));
           }while(codigo < 1 || codigo > 3);
           litros = Integer.parseInt(JOptionPane.showInputDialog("Articulo N°"+i+"\nDigite la cantidad vendida de litros: "));
           
           switch(codigo) {
               case 1 : precioLitro = 0.6f; break;
               case 2 : precioLitro = 3; break;
               case 3 : precioLitro = 1.25f; break;
           } 
           
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
