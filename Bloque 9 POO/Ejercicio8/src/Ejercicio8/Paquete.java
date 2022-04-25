
package Ejercicio8;

public class Paquete {
    private int númeroReferencia;
    private String dni;
    private double peso;
    private int prioridad;

    public Paquete(int númeroReferencia, String dni, double peso, int prioridad) {
        this.númeroReferencia = númeroReferencia;
        this.dni = dni;
        this.peso = peso;
        this.prioridad = prioridad;
    }

    public int getNumeroReferencia() {
        return númeroReferencia;
    }

    public String getDni() {
        return dni;
    }

    public double getPeso() {
        return peso;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public String mostrarDatosPaquete(){
        return "Número de Referencia : "+númeroReferencia+"\nDNI: "+dni+"\nPeso: "+peso+"\nPrioridad: "+prioridad;
    }
    
}
