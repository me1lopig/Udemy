// ejemplo de entrada y salida de datos en Java
package es.udemy.entrada;

import java.util.Scanner;

public class entrada_1 {
    
    public static void main(String[] args) {

        Scanner entrada= new Scanner(System.in); // entrada por la consola

        // entrada de un texto
        System.out.println("Introduce tu nombre ");
        String nombre=entrada.nextLine();

        System.out.println("Introduce tu apellido ");
        String apellido=entrada.nextLine();
        System.out.printf("El nombre completo es %s %s%n",nombre,apellido);

        // entramos dos numeros y los sumamos
        System.out.println("Introduce el primer número ");
        int numero1=entrada.nextInt();
        System.out.println("Introduce el segundo número ");
        int numero2=entrada.nextInt();

        System.out.printf("La operación %d+%d=%d%n",numero1,numero2,numero1+numero2);
        


        entrada.close(); // cerramos el scanner
    }
}
