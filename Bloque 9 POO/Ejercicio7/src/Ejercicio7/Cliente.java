/*
    Ejercicio 7: Hacer un programa sencillo para realizar gestiones en un banco para lo cual
tendremos 3 clases (Cliente, Cuenta). Considerar que un cliente se caracteriza por su nombre,
apellido y DNI. El cliente puede consultar saldo, asi como ingresar y retirar dinero de sus cuentas.
Además cada cuenta se caracteriza por un número de cuenta y un saldo.
*/
package Ejercicio7;

public class Cliente {
    private String nombre;
    private String apellido;
    private String dni;
    private Cuenta cuentas[];

    public Cliente(String nombre, String apellido, String dni, Cuenta[] cuentas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.cuentas = cuentas;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }

    public Cuenta[] getCuentas() {
        return cuentas;
    }
    
    public double consultar_saldo(int n){
        
        return cuentas[n].getSaldo();
      
    }
    
    public void ingresar_dinero(int n, double cantidad){
        cuentas[n].ingresarDinero(cantidad);
    }
    
    public void retirar_dinero(int n, double cantidad){
        cuentas[n].retirarDinero(cantidad);
    }
}
