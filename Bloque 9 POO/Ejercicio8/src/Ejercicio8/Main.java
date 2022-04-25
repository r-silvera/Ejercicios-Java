
package Ejercicio8;

import java.util.Scanner;

public class Main {
     public static int buscarPaquete(Paquete paquetes[], int númeroReferencia, int contadorPaquetes){
    int indice = 0, i = 0;
    boolean encontrado = false;
    
    while(i<contadorPaquetes && encontrado == false){
        if(númeroReferencia == paquetes[i].getNumeroReferencia()){
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
     
    public static int buscarSucursal(Sucursal sucursales[], int númeroSucursal, int contadorSucursal){
    int indice = 0, i = 0;
    boolean encontrado = false;
    
    while(i<contadorSucursal && encontrado == false){
        if(númeroSucursal == sucursales[i].getNumeroSucursal()){
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
        int númeroSucursal, opción = 0, contadorSucursales = 0, indiceSucursal;
        int númeroReferencia, prioridad, contadorPaquetes = 0, indicePaquete;
        Sucursal sucursales[] = new Sucursal[50];
        Paquete paquetes[] = new Paquete[100];
        String dirección, ciudad;
        String dni;
        double peso, precioPaquete;
        
        do{
            System.out.println("\t\n.:MENU:.");
            System.out.println("1. Crear una nueva sucursal");
            System.out.println("2. Enviar paquete");
            System.out.println("3. Consultando sucursal");
            System.out.println("4. Consultar paquete");
            System.out.println("5. Mostrar todas las sucursales");
            System.out.println("6. Mostrar todos los paquetes");
            System.out.println("7. Salir");
            
            System.out.print("Digite una de las opciones: ");
            opción = entrada.nextInt();
            
            switch(opción){
                case 1: System.out.print("\nIntroduzca el número de sucursal: ");
                        númeroSucursal = entrada.nextInt();
                        entrada.nextLine();
                        System.out.print("Introduzca la dirección de la sucursal: ");
                        dirección = entrada.nextLine();
                        System.out.print("Introduzca la ciudad donde esta ubicada la sucursal: ");
                        ciudad = entrada.nextLine();
            
                        sucursales[contadorSucursales] = new Sucursal(númeroSucursal, dirección, ciudad);
                        contadorSucursales++;
                        break;
                case 2: System.out.print("\nDigite el número de sucursal: ");
                        númeroSucursal = entrada.nextInt();
                        
                        indiceSucursal = buscarSucursal(sucursales, númeroSucursal, contadorSucursales);
                        
                        if(indiceSucursal == -1 ){
                            System.out.println("La sucursal no existe");
                        }
                        else{
                            System.out.print("Introduzca el número de referencia del paquete: ");
                        númeroReferencia = entrada.nextInt();
                        entrada.nextLine();
                        System.out.print("Introduzca el dni de la persona: ");
                        dni = entrada.nextLine();
                        System.out.print("Introduzca el peso del paquete: ");
                        peso = entrada.nextDouble();
                        do{
                            System.out.println("Introduzca la prioridad del paquete: ");
                            System.out.println("0. Normal");
                            System.out.println("1. Alta");
                            System.out.println("2. Express");
                            System.out.print("Digite una opción: ");
                            prioridad = entrada.nextInt();
            
                        }while(prioridad <= -1 && prioridad >= 3);
                        paquetes[contadorPaquetes] = new Paquete(númeroReferencia, dni, peso, prioridad);
                        
                        precioPaquete = sucursales[indiceSucursal].calcular_precio(paquetes[contadorPaquetes]);
                       
                        System.out.println("El precio del paquete es: $"+precioPaquete);
                        contadorPaquetes++;
                        }
                        break;
                case 3: System.out.print("Digite el número de la sucursal: ");
                        númeroSucursal = entrada.nextInt();
                        
                        indiceSucursal = buscarSucursal(sucursales, númeroSucursal, contadorSucursales);
                        
                        if(indiceSucursal == -1 ){
                            System.out.println("La sucursal no existe");
                        }
                        else{
                            System.out.print("\nLos datos de la sucursal son: ");
                            System.out.println(sucursales[indiceSucursal].mostrarDatosSucursal());
                        }
                        break;
                case 4: System.out.print("Digite el número de referencia del paquete: ");
                        númeroReferencia = entrada.nextInt();
                        
                        indicePaquete = buscarPaquete(paquetes, númeroReferencia, contadorPaquetes);
                        
                        if(indicePaquete == -1 ){
                            System.out.println("El paquete no existe");
                        }
                        else{
                            System.out.print("\nLos datos del paquete son: ");
                            System.out.println(paquetes[indicePaquete].mostrarDatosPaquete());
                        }
                        break;
                case 5: System.out.println("\t\n..:SUCURSALES:.."); 
                    for (int i = 0; i < contadorSucursales; i++) {
                        System.out.println("\nLos datos de la sucursal N°"+(i+1)+" son: ");
                        System.out.println(sucursales[i].mostrarDatosSucursal());
                    }
                    break;
                case 6: System.out.println("\t\n..:PAQUETES:..");
                    for (int i = 0; i < contadorPaquetes; i++) {
                        System.out.println("\nLos datos del paquete N°"+(i+1)+" son: ");
                        System.out.println(paquetes[i].mostrarDatosPaquete());
                    }
                    break;
                case 7: break;
                default : System.out.println("\nError, opción de menu incorrecta"); break;
                        
            }         
                
        }while(opción != 7);
    }   

}