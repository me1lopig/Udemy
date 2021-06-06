// mas ejemplos de estructuras de control
// aplicaión a estructuras de tipo switch


package es.udemy.entrada;

import javax.swing.JOptionPane;

public class estructuraControl {
    public static void main(String[] args) {
        int numeroHijos;


        // entrada de datos para evaluación 
        numeroHijos=Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de hijos"));

        switch (numeroHijos){

            case 0:
                JOptionPane.showMessageDialog(null,"No tienes hijos");
                break;

            case 1:
                JOptionPane.showMessageDialog(null,"Tienes "+numeroHijos+" hijos");
                break;

            case 2:
                JOptionPane.showMessageDialog(null,"Tienes "+numeroHijos+" hijos");
                break;

            default:
                JOptionPane.showMessageDialog(null,"Tienes familia numerosa");
                break;

        }
    }    
}
