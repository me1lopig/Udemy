package es.udemy.Arrays;


public class claseArray {

    // propiedades
    private int numeroDatos;
    private double datos[];
    private int id;
    private static int control=0;
    private String nombres[]; // array estatico


    public claseArray(int numeroDatos) {
    // constructor para la creacion del vector
    this.numeroDatos=numeroDatos;
    datos=new double[numeroDatos];
    nombres=new String [numeroDatos];
    id=0;
    control++;
    }

    // introducción de los datos 

   public void setIntroduceDatos(double valor){
        //Introducimos datos en el vector que se ha creado
        datos[id]=valor;
        id++;   
    }

    public void setIntroduceNombres(String nombre){
        //Introducimos los nombres en el vector 
        nombres[id]=nombre;   
    }



    public void getImprimeDatos(){
        // imprimir los datos almacenados
        for(int i=0;i<numeroDatos;i++){
            System.out.println("El valor del id="+i+" es "+datos[i]);
        }         
    }

    public void getImprimeNombres(){
        // imprimir los datos almacenados
        for(int i=0;i<numeroDatos;i++){
            System.out.println("El valor del id="+i+" es "+nombres[i]);
        }         
    }



    public void getImprimeDato(int posicion){
        // imprime un dato en concreto
        // se comprueba el indice que sea menor o igual que la dimension del vector

        if (posicion>id) {
            System.out.println("El valor del indice "+ posicion+" supera a la dimensión de la matriz");
            return;
        }
        System.out.println("El valor del indice "+posicion+" es "+datos[posicion]);

    }   

        /*public int getNumeroDatos(){

            // retornamos el mumero de datos introducidos en total
            return control;

        }*/

}
