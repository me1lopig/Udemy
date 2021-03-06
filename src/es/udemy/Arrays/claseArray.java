package es.udemy.Arrays;


public class claseArray {

    // propiedades
    private int numeroDatos; // dimensión de los arregklos
    private double datos[]; // array de datos numericos
    private int id; // índice de los arregos
    private String [][] nombres; // array de nombres se pone una fila o una columna de base
    static private int control=0; // controlamos el numero de acceso a la clase desde uno de los mñetodos



    public claseArray(int numeroDatos) {
    // constructor para la creacion del vector en el que introducimos los datos
    this.numeroDatos=numeroDatos;
    datos=new double[numeroDatos];
    nombres=new String [1][numeroDatos];
    id=0;  
    }

    // introducción de los datos 

   public void setIntroduceDatos(double valor,String nombre){
        //Introducimos datos en el vector que se ha creado
        datos[id]=valor;
        nombres[0][id]=nombre;
        id++;
        control++; // incrementamos contol en la variable estática
    }


    public void imprimeDatos(){
        // imprimir los datos almacenados
        for(int i=0;i<numeroDatos;i++){
            System.out.println("El valor del id="+i+" es "+datos[i]);
            System.out.println("El nombre  es "+nombres[0][i]);
        }         
    }



    public void imprimeDato(int posicion){
        // imprime un dato en concreto en este caso un número y un nombre
        // se comprueba el indice que sea menor o igual que la dimension del vector

        if (posicion>id) {
            System.out.println("El valor del indice "+ posicion+" supera a la dimensión de la matriz");
            return;
        }
        System.out.println("El valor del indice "+posicion+" es "+datos[posicion]);
        System.out.println("El valor del nombre  "+posicion+" es "+nombres[0][posicion]);

    }   

    public void imprimeAcceso(){
        System.out.println("El número de acceso es "+control);
    }

}
