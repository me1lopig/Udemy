package es.udemy.calculos;

import java.util.Scanner;

public class DivisibleSiete {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int numero;
        int divisor;
        int paso;

        // entrada de datos
        System.out.println("Introducir el mumero divisor ");
        divisor=sc.nextInt();             
        
        System.out.println("Introducir el mumero base a sumar ");
        numero=sc.nextInt();

        paso=divisor*(numero/divisor+1);

        // cálculo y resultados
        System.out.printf("Hay que sumar %d a %d para obtener un multiplo de %d que es %d%n",paso-numero,numero,divisor,paso);

        sc.close(); // cerramos el Scanner
    }
    
}
