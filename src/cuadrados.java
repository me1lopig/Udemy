
// buscamos numeros naturales que se puedas expresar por sumas de cuadrados diferentes


import java.util.Scanner;

public class cuadrados {
    
    public static void main(String[] args) {

        double numero; // valor del numero a descomponer en la suma de cuadrados
        long n=1; // numeros buscados
        int contador=0; // contador de numeros

        double x; // iterador
        double raiz;
        // variables del resultado
        double numero1=0;
        double numero2=0;

        Scanner sc=new Scanner(System.in);

        System.out.println("Introducir el mumero ");
        numero=sc.nextDouble();

        System.out.println("El numero es "+numero);

        do{
            x=Math.pow(n,2);
            raiz=Math.sqrt(numero-x);

            if(raiz==(long)raiz)
            {
                numero1=n;
                numero2=raiz;
                contador++; 

                System.out.printf("Los numeros son %.1f y %.1f%n",numero1,numero2);
            }
            n++; // incremento de n
            


        }while((n!=numero2)&&(contador<2));

        if (numero1==0)
        {
            System.out.println("No se han encontrado valores de suma de cuadrados");
        }

        sc.close(); // cerramos el Scanner
    }





}
