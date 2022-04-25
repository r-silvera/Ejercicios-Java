
package Ventana;

public class Persona {
    private String nombre;
    private String apellido;
    private String email;
    private String celular;
    private String Dirección;

    public Persona(String nombre, String apellido, String email, String celular, String Dirección) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.celular = celular;
        this.Dirección = Dirección;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEmail() {
        return email;
    }

    public String getCelular() {
        return celular;
    }

    public String getDirección() {
        return Dirección;
    }
    
    @Override
    public String toString(){
        return this.nombre+" "+this.apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public void setDirección(String Dirección) {
        this.Dirección = Dirección;
    }
    
}
