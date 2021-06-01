// solución de ecuaciones de segundo grado
// ax^2+bx+c=0

package es.udemy.calculos;

import java.util.Scanner;

public class segundoGrado {

    public static void main(String[] args) {

        double a ;
        double b ;
        double c;
        double discriminante;
        double x1,x2; //soluciones de la ecuación parte real
        double x1imag,x2imag;  // soluciones de la ecuación parte imaginaria

        Scanner sc=new Scanner(System.in);

        // entrada de datos
        System.out.println("Introducir el coeficiente ax^2 ");
        a=sc.nextDouble();

        System.out.println("Introducir el coeficiente bx ");
        b=sc.nextDouble();

        System.out.println("Introducir el coeficiente c ");
        c=sc.nextDouble();

        // control de discriminante
        discriminante=Math.pow(b, 2)-4*a*c;
        System.out.println("El valor del discriminantes es "+discriminante);

        if (discriminante>=0){
            // parte real de las soluciones
            x1=(-b+Math.sqrt(discriminante))/(2*a);
            x2=(-b-Math.sqrt(discriminante))/(2*a);
            // parte imaginaria de las soluciones
            x1imag=0;
            x2imag=0;
            
        }
        else{
        // soluciones complejas
            // parte real de las soluciones
            x1=-b/(2*a);
            x2=x1;
            // parte imaginaria de las soluciones
            x1imag=Math.sqrt(Math.abs(discriminante))/(2*a);
            x2imag=-x1imag;
        }

        System.out.println("Las soluciones son: ");
        System.out.printf("x1= %.3f+%.3fj%n",x1,x1imag);
        System.out.printf("x2= %.3f+%.3fj%n",x2,x2imag);

        sc.close(); // cerramos el Scanner

    }


    
}
