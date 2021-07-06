// calculo de tensiones en el terreno
// mediante métodos elásticos
// mediante la ecuaciones de Holl

package es.udemy.MecanicaSuelos;

import java.util.Scanner;

public class tensionTerreno {

    public static void main(String[] args) {
        
        // declaracion de variables

        Scanner entrada=new Scanner(System.in); // clase de entrada de datos
        double B;
        double L;
        double q;
        double zmax; // profundidad máxima de investigacion
        double z; // cota de calculo
        double incremento; // incremento del calculo de cada tension
 
        
        System.out.println("Entrada de datos de la cimentación");
        System.out.println("En las entradas decimales usar coma decimal");
    
        System.out.println("Valor de la Base de la cimentación");
        B=entrada.nextDouble();

        System.out.println("Valor del largo de la cimentación");
        L=entrada.nextDouble();

        System.out.println("Valor de la carga repartida por la cimentación");
        q=entrada.nextDouble();

        System.out.println("Valor de la profundidad de investigacion 2B recomendado");
        zmax=entrada.nextDouble();

        System.out.println("Valor de la profundidad inicial");
        z=entrada.nextDouble();

        System.out.println("Incremento de z");
        incremento=entrada.nextFloat();

        // declaracion de la clase con los datos ya incluidos y realizacion del calculo
        cargasTerreno carga1=new cargasTerreno(B, L, q);

        do{ // bucle para salida de datos

            // Tensiones normales
            System.out.printf("El valor de la carga en z a la profundidad z=%.3f m es %.3f \n",z,carga1.getTensionRectangularZ(z));
            System.out.printf("El valor de la carga en x a la profundidad z=%.3f m es %.3f \n",z,carga1.getTensionRectangularX(z));
            System.out.printf("El valor de la carga en y a la profundidad z=%.3f m es %.3f \n",z,carga1.getTensionRectangularY(z));
            // Tensiones cortantes
            System.out.printf("El valor de la carga en xz a la profundidad z=%.3f m es %.3f \n",z,carga1.getTensionRectangularxz(z));
            System.out.printf("El valor de la carga en yz a la profundidad z=%.3f m es %.3f \n",z,carga1.getTensionRectangularyz(z));
            System.out.printf("El valor de la carga en xy a la profundidad z=%.3f m es %.3f \n",z,carga1.getTensionRectangularxy(z));



            z+=incremento;
        }while (zmax+incremento>=z);

        entrada.close(); // cerramos la entrada de datos

    }
    
    
}
