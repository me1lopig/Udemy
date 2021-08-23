package es.udemy.Arrays;
// Creamoa una clase para la introduccion de datos en un vector

public class introduceDatos {

    public static void main(String[] args) {


        // declaracion de objetos
        claseArray vector_2=new claseArray(5);


        // introduc¡mos los datos en el vector de datos
        for (int i=0;i<5;i++)
            {
                vector_2.setIntroduceDatos(i);
      
            }
            

        vector_2.getImprimeDatos(); // imprime todos los datos  que tenemos en el vector que hemos creados
            //vector_2.getImprimeNombres(); // imprime todos los noombres  que tenemos en el vector que hemos creados
     
       
       
        // sacamos datos parciales de los arrays creados
        System.out.println("primer ejemplo");
        vector_2.getImprimeDato(2);

        // sacamos el número de datos introducidos
        System.out.println("El número de datos es "+vector_2.getNumeroDatos());
    

    }   


}