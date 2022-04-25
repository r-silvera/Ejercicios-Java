
package Ejercicio2;

import java.io.Serializable;

public class Atleta implements Serializable{
    private String nombre;
    private int edad;
    private double peso;
    private int altura;

    public Atleta(String nombre, int edad, double peso, int altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getPeso() {
        return peso;
    }

    public int getAltura() {
        return altura;
    }
    
}
