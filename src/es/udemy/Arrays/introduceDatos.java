package es.udemy.Arrays;
// Creamoa una clase para la introduccion de datos en un vector

public class introduceDatos {

    public static void main(String[] args) {


        // declaracion de objetos
        claseArray vector_2=new claseArray(5);
        claseArray vector_3=new claseArray(3);


        // introduc¡mos los datos en el vector de datos y los nombres
        for (int i=0;i<3;i++)
            {
                vector_3.setIntroduceDatos(i,"Mixo "+(i+1));
            }



        // introduc¡mos los datos en el vector de datos y los nombres
        for (int i=0;i<5;i++)
            {
                vector_2.setIntroduceDatos(i,"nombre "+i);
            }
            
        System.out.println("Datos del primer objeto");
        vector_2.imprimeDatos(); // imprime todos los datos  que tenemos en el vector que hemos creados
            //vector_2.getImprimeNombres(); // imprime todos los noombres  que tenemos en el vector que hemos creados

        System.out.println("Datos del segundo objeto");
        vector_3.imprimeDatos();   


       
        // sacamos datos parciales de los arrays creados
        System.out.println("primer ejemplo");
        vector_2.imprimeDato(2);

        // sacamos datos parciales de los arrays creados
        System.out.println("Número de accesos");
        vector_2.imprimeAcceso();



    }   


}