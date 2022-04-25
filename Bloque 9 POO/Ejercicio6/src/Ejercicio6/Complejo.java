/*
    Ejercicio 6: Construir  un programa para trabajar con 2 números complejos, implemente
el siguiente menú: 
    1. Sumar dos números complejos
    2. Multiplicar 2 números complejos
    3. Comparar 2 números complejos(iguales o no)
    4. Multiplicar un número complejo por un entero
*/
package Ejercicio6;

public class Complejo {
    private double a;
    private double b;

    public Complejo(double a, double b) {
        this.a = a;
        this.b = b;
      
}
    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }
    
    public Complejo calcularSuma(Complejo c){
        Complejo suma = new Complejo(a+c.getA(),b+c.getB());
        return suma;
    }
    
    public Complejo calcularMult(Complejo c){
        Complejo mult = new Complejo((a*c.getA()-b*c.getB()),(a*c.getB()+b*c.getA()));
        return mult;
    }
    
    public boolean compararIgualdad(Complejo c){
        boolean igualdad = false;
        
        if((a==c.getA()) && (b==c.getB())){
            igualdad  = true;
        }
        return igualdad;
    }
    
    public Complejo multiplicarConEntero(int entero){
        Complejo mult = new Complejo(a*entero,b*entero);
        return mult;
    }
}
