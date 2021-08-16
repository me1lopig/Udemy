package es.udemy.Arrays;


public class claseArray {

    // propiedades
    private int numeroDatos;
    private double datos[];
    private int id;

    public claseArray(int numeroDatos) {
    // constructor para la creacion del vector
    this.numeroDatos=numeroDatos;
    datos=new double[numeroDatos];
    id=0;
    }

   public void setIntroduceDatos(double valor){
        //Introducimos datos en el vector que se ha creado
        datos[id]=valor;
        id++;
    }

    public void getImprimeDatos(){
        // imprimir los datos almacenados
        for(int i=0;i<numeroDatos;i++){
            System.out.println("El valor del id="+i+" es "+datos[i]);
        }         
    }
    
}
