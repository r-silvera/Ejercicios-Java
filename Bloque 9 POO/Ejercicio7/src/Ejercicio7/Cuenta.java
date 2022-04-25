/*
    Ejercicio 7: Hacer un programa sencillo para realizar gestiones en un banco para lo cual
tendremos 3 clases (Cliente, Cuenta). Considerar que un cliente se caracteriza por su nombre,
apellido y DNI. El cliente puede consultar saldo, asi como ingresar y retirar dinero de sus cuentas.
Además cada cuenta se caracteriza por un número de cuenta y un saldo.
*/
package Ejercicio7;

public class Cuenta {
    private int númeroCuenta;
    private double saldo;

    public Cuenta(int númeroCuenta, double saldo) {
        this.númeroCuenta = númeroCuenta;
        this.saldo = saldo;
    }

    public int getNúmeroCuenta() {
        return númeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }
    
    public void ingresarDinero(double cantidad){
        saldo += cantidad;
    }
    
    public void retirarDinero(double cantidad){
        saldo -= cantidad;
    }
    
}
