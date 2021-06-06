// ejemplo de uso de bucle While
// se va a usar en la comprobación de una clave


package es.udemy.Bucles;

import javax.swing.JOptionPane;

public class bucleWhile {
    public static void main(String[] args) {

        String clave="Juan";
        String acceso="";
        int intentos=0;

        while (!clave.equals(acceso)){
            intentos++;
            acceso=JOptionPane.showInputDialog("Introduce la clave: intento "+intentos);       
        }

        JOptionPane.showMessageDialog(null,"Has acertado la clave en "+intentos+" intentos");
    }
    
}
