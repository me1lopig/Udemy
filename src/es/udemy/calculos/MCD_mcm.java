// cálculo de Máxomo común divisor y el mínimo común múltiplo
package es.udemy.calculos;

import java.util.Scanner;


public class MCD_mcm {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        long numero1;
        long numero2;
        long resto;
        long mayor;
        long menor;
        

        // entrada de datos
        System.out.println("Introducir el numero 1 ");
        numero1=sc.nextLong();
        System.out.println("Introducir el mumero 2 ");
        numero2=sc.nextLong();

        // ordenacion de los numeros
        if(numero1>=numero2){
            mayor=numero1;
            menor=numero2;
        }
        else{
            mayor=numero2;
            menor=numero1;
        }

        // cálculos

        resto=mayor % menor; // cálculo del resto
        System.out.println("Valor del resto  "+resto);

        while(resto!=0){
            mayor=menor;
            menor=resto;

            resto=mayor%menor;
        }
        //Salida del Máximo Común divisor MCD
        System.out.printf("El MCD de %d y %d es %d%n",numero1,numero2,menor);
        
        // calculo de mínimo común multiplo mcm
        System.out.printf("El mcm de %d y %d es %d%n",numero1,numero2,Math.abs(numero1*numero2)/menor);

        sc.close(); // cerramos el Scanner
    }
    
}
