// ejemplo de bucle for

package es.udemy.Bucles;

public class bucle_for1 {
    public static void main(String[] args) {
        
// bucles anidados
// si no se declara fuera se cond¡sidera variable local y no se puede trabajar fuera del bucle
    int i;
    int j;
        for(i=1;i<=10;i++){
            for (j=i;j<=10;j++){
                System.out.println("i="+i+" j="+j+" i+j="+(i+j));

            }
            if ((i+j)==12){
                System.out.println("Se termina el bucle ");
                break;
            }
        }

    }

    
}
