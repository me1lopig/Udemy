package es.udemy.Arrays;

public class claseArray {

// propiedades
private int numeroDatos;
private double datos[]=new double[numeroDatos];
private int id=0;


    public claseArray(int numeroDatos) {
    // constructor para la creacion del vector

    this.numeroDatos=numeroDatos;

    }

    public void setIntroduceDatos(double valor){
        //Introducimos datos en el vector que se ha craado

        datos[id]=valor;
        id++;

    }

    public void getImprimeDatos(){

    }
    
}
