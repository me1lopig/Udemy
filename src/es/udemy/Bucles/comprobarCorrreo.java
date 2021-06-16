// comprobar la validez de un correo
// existencia de @
// existencia de .
// por lo menos 4 caracteres


package es.udemy.Bucles;

import javax.swing.JOptionPane;


public class comprobarCorrreo {

    public static void main(String[] args) {

    String correo=JOptionPane.showInputDialog("Introduce el correo electrónico ");
    int arrobas=0; // numero de arrobas que tenemos en el correo
    int puntos=0; // numero de puntos que tenemos en el correo
    
    for(int i=0;i<correo.length();i++){
        if(correo.charAt(i)=='@'){ // cuenta las arrobas que hay, debe existir solo una
            arrobas++;
        }
        if(correo.charAt(i)=='.'){ // cuenta los puntos que hay, debe de existir solo una 
            puntos++;
        }
      
    }
    
    // comprobación de la estrcutura del texto del correo
    if (arrobas==1 && puntos==1 && correo.length()>=4){
        System.out.println("El correo parece correcto");
    }
    else{
        System.out.println("El correo no es correcto");
    }



    }
    
}
