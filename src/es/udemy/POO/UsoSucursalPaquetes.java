// clase principal se piden los datos y se procesan

package es.udemy.POO;

import java.util.Scanner;

public class UsoSucursalPaquetes {

    public static void main(String[] args) {
        // declaración de las variables

        // datos generales
        long numeroSucursal;
        String direccion;
        String ciudad;

        // datos de cada uno de los paquetes
        int refEnvio;
        double peso;
        String dni;
        int prioridad; //valores 0, 1, 2
        int numeroPaquetes;

        Scanner entrada=new Scanner (System.in);


        System.out.println("Introduce los datos de la sucursal ");
        System.out.println();

        System.out.println("Número de la sucursal ");
        numeroSucursal=entrada.nextLong();

        System.out.println("Dirección de la sucursal ");
        direccion=entrada.next();
        
        System.out.println("Ciudad ");
        ciudad=entrada.next();

        sucursal s1=new sucursal(numeroSucursal,direccion,ciudad);
     
        System.out.println("Inroducir el número de paquetes a enviar ");
        numeroPaquetes=entrada.nextInt();

        // definimos una matriz de paquetes 
        paquete [] paquetes=new paquete[numeroPaquetes];

        System.out.println("Introduce los datos de los paquetes ");

        for(int i=0;i<numeroPaquetes;i++){
            System.out.println("Introduzca los datos del paquete "+(i+1));
            System.out.println("Referencia");
            refEnvio=entrada.nextInt();
            System.out.println("DNI del remitente ");
            dni=entrada.next();
            System.out.println("Peso: ");
            peso=entrada.nextDouble();
            System.out.println("Prioridad ");
            prioridad=entrada.nextInt();
            paquetes[i]=new paquete(refEnvio,peso,dni,prioridad);
            
        }
        

        System.out.println("\nLos datos de la sucursal son :");
        System.out.println("Sucursal "+s1.getNumeroSucursal());
        System.out.println("Situada em "+s1.getDireccion());
        System.out.println("\nLos datos de los paquetes son:");

        for(int i=0;i<numeroPaquetes;i++){
            System.out.println("Paquete "+(i+1));
            System.out.println("Precio "+s1.calculaPrecio(paquetes[i]));
            System.out.println("Peso "+paquetes[i].getPeso());
            System.out.println("------------------------------------");

        }



    }
    
}
