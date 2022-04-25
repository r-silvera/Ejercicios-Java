
package Ejercicio10;

public class Medico extends Persona{
    private String titulación;
    private int añosExperiencia;

    public Medico(String titulación, int añosExperiencia, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.titulación = titulación;
        this.añosExperiencia = añosExperiencia;
    }

    public String getTitulación() {
        return titulación;
    }

    public int getAñosExperiencia() {
        return añosExperiencia;
    }
    
    public void partidoFutbol(){
        System.out.println("Da asistencia en un partido de futbol");
    }
    
    public void entrenamiento(){
        System.out.println("Da asistencia en un entrenamiento");
    }
    
    public void curarLesion(){
        System.out.println("Curar lesion");
    }
}
