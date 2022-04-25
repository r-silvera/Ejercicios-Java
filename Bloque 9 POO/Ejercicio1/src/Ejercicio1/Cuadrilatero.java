/*
    Ejercicio 1: Construir un programa que calcule el areá y el perimetro de un cuadrilatero
dada la longitud de sus lados. Los valores de la longitud deberán introducirse por línea de ordenes. Si
es un cuadrado, sólo se proporcionara la longitud de uno de los lados al constructor.
*/
package Ejercicio1;
    
public class Cuadrilatero {
    //Atributos
    private float lado1;
    private float lado2;
    
    //Metodos
    //Metodo constructor 1 (Cuadrilatero)
    public Cuadrilatero(float lado1, float lado2){
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    
    //Metodo constructor 2 (Cuadrilatero)
    public Cuadrilatero(float lado1){
        this.lado1 = this. lado2 =  lado1;
    }
    
    public float getPerimetro(){
        float perimetro = 2 * (lado1+lado2);
        return perimetro;
    }
    
    public float getArea(){
        float area = (lado1 * lado2);
        return area;
    }
}
