package es.udemy.Arrays;
// Creamoa una clase para la introduccion de datos en un vector

public class introduceDatos {

    public static void main(String[] args) {

        claseArray vector_2=new claseArray(5);
        claseArray vector_3=new claseArray(10);
    

        // introduc¡mos los datos en el vector de la clase
        for (int i=0;i<5;i++)
        {
            vector_2.setIntroduceDatos(i+2);
        }

        vector_2.getImprimeDatos(); // imprime todos los datos  que tenemos en el vector que hemos creados

  // introduc¡mos los datos en el vector de la clase
        for (int i=0;i<10;i++)
        {
            vector_3.setIntroduceDatos(i*10);
        }

        vector_3.getImprimeDatos(); // imprime todos los datos  que tenemos en el vector que hemos creados



    }   
}