// calculo de tensiones en el terreno

package es.udemy.MecanicaSuelos;

import java.util.Scanner;

public class tensionTerreno {

    public static void main(String[] args) {
        
        // declaracion de variables

        Scanner entrada=new Scanner(System.in); // clase de entrada de datos
        double b;
        double l;
        double q;
        double zmax; // profundidad máxima de investigacion
        double z=0.1; // cota de calculo
        float incremento; // incremento del calculo de cada tension
 

        System.out.println("Entrada de datos de la cimentación");
        System.out.println("En las entradas decimales usar coma decimal");
    
        System.out.println("Valor de la Base de la cimentación");
        b=entrada.nextDouble();

        System.out.println("Valor del largo de la cimentación");
        l=entrada.nextDouble();

        System.out.println("Valor de la carga repartida por la cimentación");
        q=entrada.nextDouble();

        System.out.println("Valor de la profundidad de investigacion 2B recomendado");
        zmax=entrada.nextDouble();

        System.out.println("Incremento de z");
        incremento=entrada.nextFloat();

        // declaracion de la clase con los datos ya incluidos y realizacion del calculo
        cargasTerreno carga1=new cargasTerreno(b, l, q);

        do{ // bucle para salida de datos
            
            System.out.println("El valor de la carga a la profundidad z="+z+" es "+carga1.getTensionRectangular(z));
            z+=incremento;
        }while (zmax<z);

        entrada.close(); // cerramos la entrada de datos

    }
    
    
}
