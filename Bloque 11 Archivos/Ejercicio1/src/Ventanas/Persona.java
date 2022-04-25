
package Ventanas;

public class Persona {
    String nombre, email, celular;

    public Persona(String nombre, String email, String celular) {
        this.nombre = nombre;
        this.email = email;
        this.celular = celular;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public String getCelular() {
        return celular;
    }
    
}
