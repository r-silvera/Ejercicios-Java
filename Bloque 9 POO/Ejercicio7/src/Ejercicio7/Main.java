
package Ejercicio7;

import java.util.Scanner;

public class Main {
    public static int indiceDeNúmeroCuenta(int n,Cuenta cuentas[]){
        int i = 0, indice = 0;
        
        boolean encontrado = false;
        
        while((i<cuentas.length) &&(encontrado == false)){
            if(n == cuentas[i].getNúmeroCuenta()){
                encontrado = true;
                indice = i;
            } 
            i++;
        }
        if(encontrado == false){
            indice = -1;
        }
        
        return indice;
    }
    
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        String nombre, apellido, dni;
        int númeroCuenta, nCuentas, opción, indice;
        double saldo, cantidad;
        
        Cuenta cuentas[];
        Cliente cliente;
        
        System.out.print("Introduzca el nombre del cliente: ");
        nombre = entrada.nextLine();
        System.out.print("Introduzca el apellido del cliente: ");
        apellido = entrada.nextLine();
        System.out.print("Introduzca el dni del cliente: ");
        dni = entrada.nextLine();
        System.out.print("Digite la cantidad de cuentas del cliente: ");
        nCuentas = entrada.nextInt();
        
        cuentas = new Cuenta[nCuentas];
        
        for (int i = 0; i < cuentas.length; i++) {
            System.out.println("\n Digite los datos para la cuenta "+(i+1)+": ");
            System.out.print("Digite el número de cuenta: ");
            númeroCuenta = entrada.nextInt();
            System.out.print("Digite el saldo de la cuenta: ");
            saldo = entrada.nextDouble();
            
            cuentas[i] = new Cuenta(númeroCuenta, saldo);
        }
        
        cliente = new Cliente(nombre, apellido, dni, cuentas);
        
        do{
            System.out.println("\t\n.:MENU:.");
            System.out.println("1. Ingresar dinero en la cuenta");
            System.out.println("2. Retirar dinero en la cuenta");
            System.out.println("3. Consultar dinero en la cuenta");
            System.out.println("4. Salir");
            
            System.out.print("\nDigite una opción de las anteriores: ");
            opción = entrada.nextInt();
            
            switch(opción){
                case 1: System.out.print("Digite el número de cuenta: ");
                    númeroCuenta = entrada.nextInt();
                    indice = indiceDeNúmeroCuenta(númeroCuenta, cuentas);
                    
                    if(indice == -1){
                        System.out.println("\nEl número de cuenta introducido no existe");
                    }
                    else{
                        System.out.print("\nDigite la cantidad de dinero que desea ingresar: ");
                        cantidad = entrada.nextDouble();
                        
                        cliente.ingresar_dinero(indice, cantidad);
                        System.out.println("\nIngreso realizado correctamente");
                        System.out.println("El saldo actual de la cuenta es: "+cliente.consultar_saldo(indice));
                    }
                    break;
                    
                case 2: System.out.print("Digite el número de cuenta: ");
                    númeroCuenta = entrada.nextInt();
                    indice = indiceDeNúmeroCuenta(númeroCuenta, cuentas);
                    
                    if(indice == -1){
                        System.out.println("\nEl número de cuenta introducido no existe");
                    }
                    else{  
                        System.out.print("\nDigite la cantidad de dinero que desea retirar: ");
                        cantidad = entrada.nextDouble();
                        if(cantidad > cliente.consultar_saldo(indice)){
                            System.out.println("\nError, saldo insufiente");
                        }
                        else{
                            cliente.retirar_dinero(indice, cantidad);
                            System.out.println("\nRetiro realizado correctamente");
                            System.out.println("El saldo actual de la cuenta es: "+cliente.consultar_saldo(indice));
                        }
                    }
                    break;
                    
                case 3: System.out.print("Digite el número de cuenta: ");
                    númeroCuenta = entrada.nextInt();
                    indice = indiceDeNúmeroCuenta(númeroCuenta, cuentas);
                    
                    if(indice == -1){
                        System.out.println("\nEl número de cuenta introducido no existe");
                    }
                    else{
                        System.out.println("\nEl saldo actual de la cuenta es: "+cliente.consultar_saldo(indice));
                    }
                    break;
                case 4: break;
                default : System.out.println("\nError, se confundio de opción de menu"); 
            } 
    
        } while(opción != 4);
    }
}
