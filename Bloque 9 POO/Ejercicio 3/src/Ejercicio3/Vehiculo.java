/*
    Ejercicio 3: Construir un programa que dada una serie de vehículos caracterizados
por su marca, modelo y precio, imprima las propiedades del vehículo más barato. Para ello,
 se deberan leer por teclado las caracteristicas de cada vehículo y crear una clase que represente
a cada uno de ellos.
*/
package Ejercicio3;

public class Vehiculo {
    //Atributos
    private String marca;
    private String modelo;
    private float precio;
    
    //Modelos

    public Vehiculo(String marca, String modelo, float precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public float getPrecio() {
        return precio;
    }
    
    public String mostrarDatos(){
        return "Marca: "+marca+"\nModelo: "+modelo+"\nPrecio: "+precio;
    }
    
}
