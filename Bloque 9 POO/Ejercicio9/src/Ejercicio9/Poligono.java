
package Ejercicio9;

public abstract class Poligono {
    protected int númeroLados;

    public Poligono(int númeroLados) {
        this.númeroLados = númeroLados;
    }

    public int getNúmeroLados() {
        return númeroLados;
    }

    
    public String toString(){
        return "Número Lados: "+númeroLados;
    }
    
    public abstract double área();
}
