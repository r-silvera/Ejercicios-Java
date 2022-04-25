/*
    Ejercicio 14: Hacer un programa que pase de Kg a otra unidad de medidas de masa, mostrar en pantalla un
menú con las opciones posibles.
*/
package ejercicio14;

import javax.swing.JOptionPane;

public class Ejercicio14 {

    public static void main(String[] args) {
        float medida,conversión;
        int opción;
        
        medida = Float.parseFloat(JOptionPane.showInputDialog("Digite la cantidad de kilogramos: "));
        
        opción = Integer.parseInt(JOptionPane.showInputDialog("Menú\n"+
        "1. Hectogramos\n"+
        "2. Decagramos\n"+
        "3. Gramos\n"+
        "4. Decigramos\n"+
        "5. Centigramos\n"+
        "6. Miligramos\n"));
        
        switch (opción){
            case 1: conversión = medida * 10;
                JOptionPane.showMessageDialog(null, "La conversión en Hectogramos es: "+conversión);
                break;
            case 2: conversión = medida*100;
                JOptionPane.showMessageDialog(null, "La conversión en Decagramos es: "+conversión);
                break;
            case 3: conversión = medida*1000;
                JOptionPane.showMessageDialog(null, "La conversión en Gramos es: "+conversión);
                break;
            case 4: conversión = medida*10000;
                JOptionPane.showMessageDialog(null, "La conversión en Decigramos es "+conversión);
                break;
            case 5: conversión = medida*100000;
                JOptionPane.showMessageDialog(null, "La conversión en Centigramos es: "+conversión);
                break;
            case 6: conversión = medida*1000000;
                JOptionPane.showMessageDialog(null, "La conversión en Miligramos es: "+conversión);
                break;
            default: JOptionPane.showMessageDialog(null, "Error, se a confundido en opción de menú.");
        }
    }
}
