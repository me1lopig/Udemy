package es.udemy.Arrays;
// Creamoa una clase para la introduccion de datos en un vector

public class introduceDatos {

    public static void main(String[] args) {


        // declaracion de objetos
        claseArray vector_2=new claseArray(5);
        claseArray vector_3=new claseArray(10);
    

        // introduc¡mos los datos en el vector de datos
        for (int i=0;i<5;i++)
            {
                vector_2.setIntroduceDatos(i+2);
            }
     
        // introduc¡mos los datos en el vector nombres
        for (int i=0;i<5;i++)
            {
                vector_2.setIntroduceNombres("Nombre "+i);
            }
            

            vector_2.getImprimeDatos(); // imprime todos los datos  que tenemos en el vector que hemos creados
            vector_2.getImprimeNombres(); // imprime todos los noombres  que tenemos en el vector que hemos creados

        // introduc¡mos los datos en el vector de la clase
        for (int i=0;i<10;i++)
            {
                vector_3.setIntroduceDatos(i*10);
            }

        
                // introduc¡mos los datos en el vector nombres
        for (int i=0;i<10;i++)
            {
                vector_3.setIntroduceNombres("Nombre "+i);
            }
        
        
        
        vector_3.getImprimeDatos(); // imprime todos los datos  que tenemos en el vector que hemos creados
        vector_3.getImprimeNombres(); // imprime todos los noombres  que tenemos en el vector que hemos creados

       
       
       
        // sacamos datos parciales de los arrays creados
        System.out.println("primer ejemplo");
        vector_2.getImprimeDato(2);

        System.out.println("segundo ejemplo");
        vector_3.getImprimeDato(30); // este lleva un error
        
        // imprimimos los datos totales
        System.out.println("El numero de datos total es "+vector_2.getNumeroDatos());

    }   


}