
package bucleforeach;

public class BucleForEach {

    public static void main(String[] args) {
       String[] nombres = {"Alejandro", "Maria", "Luisa", "Juan", "Narcisa", "Roberto", "Myriam"};
       
       for(int i=0; i<nombres.length; i++){//utilizamos NombreDelArreglo.length para que retorne el número de elementos que tiene el arreglo.
           System.out.println(nombres[i]);
       }
    }
    
}
