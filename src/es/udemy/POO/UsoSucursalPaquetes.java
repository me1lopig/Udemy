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
        String refEnvio;
        double peso;
        String dni;
        byte prioridad; //valores 0, 1, 2
        int numeroPaquetes;

        Scanner entrada=new Scanner (System.ini);


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
        


    }
    
}
