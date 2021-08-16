package es.udemy.Arrays;
// Creamoa una clase para la introduccion de datos en un vector

public class introduceDatos {

    public static void main(String[] args) {

        double vector_1[]=new double[5];
        claseArray vector_2=new claseArray(5);


        // introduc¡mos los datos en el vector local
        for (int i=0;i<5;i++)
        {
            vector_1[i]=i;
        }

        // imprimimos los datos del vector local
        for (int i=0;i<5;i++)
        {
            System.out.println("El valor de la posición "+i+" es "+vector_1[i]);
        }

        // trabajamos con la clase

        // introduc¡mos los datos en el vector local
        for (int i=0;i<5;i++)
        {
            vector_2.setIntroduceDatos(i);
        }






    }
    
}
