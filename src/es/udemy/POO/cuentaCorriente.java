// ejercicio de cuenta corriente
package es.udemy.POO;

import java.util.Random;

public class cuentaCorriente {

    // declaraciónd de las propiedades
    private double saldo;
    private String nombreTitular;
    private long numeroCuenta;

    public cuentaCorriente(String nombreTitular,double saldo){
        // constructor
        // solo se introduce el saldo y el nombre del titular

        this.saldo=saldo;
        this.nombreTitular=nombreTitular;
        // creacion de un mumero de cuenta aleatorio
        Random rnd=new Random();
        numeroCuenta=Math.abs(rnd.nextLong());
    }
    public void setIngreso(double ingreso){
        // los ingresos debe de ser positivos
        if (ingreso<0) System.out.println("No se permiten ingresos negativos");
        else saldo+=ingreso;
    } 

    public void setReingreso(double reingreso){
        // los reingresos deben de ser negativos
        if (reingreso>0) System.out.println("No se permiten reingresos positivos");
        else saldo-=reingreso;
    
    }

    public String getSaldo(){
        return "El saldo es "+saldo;
    }

    public static void Transferencia(cuentaCorriente titu1,cuentaCorriente titu2,double cantidad){
        // metodo Static el metoodo pertenece a la propia clase no hace falta instanciar para ejecutarlo
        // tomamos datos de las clases generadas en la clase principal
        // usamos los datos de los titulares
        titu1.saldo+=cantidad;
        titu2.saldo+=cantidad;

    }

    public String getDatosCuenta(){
        // representamos los datos de la cuenta
        return "Titular "+nombreTitular+"\n"+
        "Nº de cuenta: "+numeroCuenta+"\n"+
        "Saldo: "+saldo;

    }
    
}
