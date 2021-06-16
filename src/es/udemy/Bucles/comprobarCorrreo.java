// comprobar la validez de un correo


package es.udemy.Bucles;

import javax.swing.JOptionPane;


public class comprobarCorrreo {

    public static void main(String[] args) {

    String correo=JOptionPane.showInputDialog("Introduce el correo electrónico ");
    int arrobas=0; // numero de arrobas que tenemos en el correo
    int puntos=0; // numero de puntos que tenemos en el correo
    
    for(int i=0;i<correo.length();i++){
        if(correo.charAt(i)=='@'){ // cuenta las arrobas que hay
            arrobas++;
        }
        if(correo.charAt(i)=='.'){ // cuenta los puntos que hay
            puntos++;
        }
      
    }
    

    if (arrobas==1 && puntos==1 && correo.length()>=4){
        System.out.println("El correo parece correcto");
    }
    else{
        System.out.println("El correo no es correcto");
    }



    }
    
}
