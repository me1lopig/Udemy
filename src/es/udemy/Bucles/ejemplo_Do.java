// ejemplo de aplicacion de Do while

package es.udemy.Bucles;

import javax.swing.JOptionPane;

public class ejemplo_Do {
    public static void main(String[] args) {

        String texto; // texto que se va a usar en la entrada de los datos

        JOptionPane.showMessageDialog(null,"Introduce una palabra y se obtiene su longitud \nPara salir introduce salir");

        do{
            
            texto=JOptionPane.showInputDialog("Introduce el texto "); 
            JOptionPane.showMessageDialog(null, "La palabra "+texto+" tiene \n"+texto.length()+" caracteres");

        } while (!texto.equalsIgnoreCase("salir"));
        System.out.println("Se sale del programa");

    }
    
}
