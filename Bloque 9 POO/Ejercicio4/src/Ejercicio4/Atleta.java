/*
    Ejercicio 4: Construir un programa para una competencia de atletismo, el programa debe gestionar
una serie de atletas caracterizados por su número de atleta, nombre y tiempo de carrera, al final el
programa debe mostrar los datos del atleta ganador de la carrera.
*/
package Ejercicio4;

public class Atleta {
    //Atributos
    private int númeroAtleta;
    private String nombre;
    private float tiempoDeCarrera;
    
    //Metodos

    public Atleta(int númeroAtleta, String nombre, float tiempoDeCarrera) {
        this.númeroAtleta = númeroAtleta;
        this.nombre = nombre;
        this.tiempoDeCarrera = tiempoDeCarrera;
    }

    public float getTiempoDeCarrera() {
        return tiempoDeCarrera;
    }
    
    public String mostrarDatos(){
        return "Número de atleta: "+númeroAtleta+"\nNombre: "+nombre+"\nTiempo de carrera: "+tiempoDeCarrera;
    }
    
}
