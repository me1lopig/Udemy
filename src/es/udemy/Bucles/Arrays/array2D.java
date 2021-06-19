// Ejemplo de arrays
// Ejemplo de array de dos dimensiones
package es.udemy.Bucles.Arrays;

public class array2D {
    public static void main(String[] args) {


        int [][] datos={{1,2,3,0},{3,6,8,-7},{2,8,-5,5},{7,-9,0,8}}; // introducción de los datos de la matrix
        int filas=datos.length;
        int columnas=datos[0].length;

        // impresión de las filas y columnas de la matriz
        System.out.println("El numero de filas es "+filas);
        System.out.println("El numero de columnas es "+columnas);

        // impresión de los datos que contiene la matriz
        for(int i=0;i<filas;i++){
            for(int j=0;j<columnas;j++){
                System.out.print(datos[i][j]+" ");
            }
            System.out.println(); 
        }



    }
    
}
