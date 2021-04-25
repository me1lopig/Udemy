
// buscamos numeros naturales que se puedas expresar por sumas de cuadrados diferentes


import java.util.Scanner;

public class cuadrados {
    
    public static void main(String[] args) {

        double numero; // valor del numero a descomponer en la suma de cuadrados
        long n=2; // numeros buscados

        double x; // iterador
        double raiz;
        // variables del resultado
        double numero1;
        double numero2;

        Scanner sc=new Scanner(System.in);

        System.out.println("Introducir el mumero ");
        numero=sc.nextDouble();

        System.out.println("El numero es "+numero);

        do{
            x=Math.pow(n,2);
            raiz=Math.sqrt(numero-x);

            if(raiz==(int)raiz)
            {
                numero1=n;
                numero2=raiz;

                System.out.printf("Los numeros son %.1f y %.1f",numero1,numero2);
            }
            n++; // incremento de n


        }while((numero-x)>0);

        sc.close(); // cerramos el Scanner
    }





}
