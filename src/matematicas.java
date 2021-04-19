// uso de la librería Math de Java


import java.util.Scanner;

public class matematicas {
    public static void main(String[] args)  {

        System.out.println("Hello \n");

        // declaración de la variable de entrada
        double fnumero1;
            
            
        Scanner sc=new Scanner(System.in);

        // entrada del valor
        System.out.println("Entrada de los números flotantes [usar , para decimales] \n");
        System.out.println("Introduce el valor ");
        fnumero1=sc.nextDouble();
 

        // operaciones con la clase Math para el valor que hemos introducido
        System.out.printf("El valor del seno de %.3f radianes es %.7f %n",fnumero1,Math.sin(fnumero1));
        System.out.printf("El valor del coseno de %.3f radianes es %.7f %n",fnumero1,Math.cos(fnumero1));
        System.out.printf("El valor de la raiz cuadrada de %.3f es %.7f %n",fnumero1,Math.sqrt(fnumero1));
        System.out.printf("El valor del cuadrado de %.3f  es %.7f %n",fnumero1,Math.pow(fnumero1,2));
        System.out.printf("El valor del cubo de %.3f es %.7f %n",fnumero1,Math.pow(fnumero1,3));
        System.out.printf("El valor redondeado de %.3f es %d %n",fnumero1,Math.round(fnumero1));

        sc.close(); // cerramos el Scanner


    }   
}