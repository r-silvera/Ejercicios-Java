
package Ejercicio8;

public class Sucursal {
    private int númeroSucursal;
    private String dirección;
    private String ciudad;

    public Sucursal(int numeroSucursal, String dirección, String ciudad) {
        this.númeroSucursal = numeroSucursal;
        this.dirección = dirección;
        this.ciudad = ciudad;
    }

    public int getNumeroSucursal() {
        return númeroSucursal;
    }

    public String getDirección() {
        return dirección;
    }

    public String getCiudad() {
        return ciudad;
    }
    
    public String mostrarDatosSucursal(){
        return "\nNúmero de Sucursal: "+númeroSucursal+"\nDirección: "+dirección+"\nCiudad: "+ciudad;
    }
    
    public double calcular_precio(Paquete t){
        double precio;
        precio = t.getPeso();
        if(t.getPrioridad() == 1){
            precio += 10;
        }
        if(t.getPrioridad() == 2){
            precio += 20;
        }
        return precio;
    }
}
