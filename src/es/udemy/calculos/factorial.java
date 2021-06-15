// calculo del factorial de un numero
// calculo sin recursividad

package es.udemy.calculos;

import java.util.Scanner;


public class factorial {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double factorial=1;
        long numero;
        
        // entrada de los datos
        System.out.println("Introduce el numero para calcular el factorial");
        numero=sc.nextLong();

        // Calculo del valor del factorial
        for(long i=1;i<=numero;i++){
            factorial*=i;      
        }

        sc.close();
    System.out.println("El valor del factorial de "+numero+" es "+factorial);

    }
    
}
