// ejemplo de arrays
// usamos un array de numeros enteros pero admite cualquier tipo de dato


package es.udemy.Bucles.Arrays;

public class matrices_1 {

    public static void main(String[] args) {

        int [] matriz={0,2,-3,97,6,14,-58,87}; // declaracion de un array
        String [] nombres={"Juan","Jose","María","Pinky"};

        System.out.println("Impresion con for tradicional");
        // impresión del contenido del array con un bucle tradicional
        for(int i=0;i<matriz.length;i++){
            System.out.println("El valor "+(i+1)+" es "+matriz[i]);
        }


        System.out.println("Impresion con foreach");
        // impresión con un bucle foreach
        for (int i : matriz) {
            System.out.println("El valor es "+i);
        }


        System.out.println("Impresion con for tradicional de un array de texto");
        // impresión del contenido del array con un bucle tradicional
        for(int i=0;i<nombres.length;i++){
            System.out.println("El valor "+(i+1)+" es "+nombres[i]);
        }


        System.out.println("Impresion con foreach de un array de texto");
        // impresión con un bucle foreach
        for (String j : nombres) {
            System.out.println("El valor es "+j);
        }



        }   
    }
