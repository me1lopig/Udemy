// control de edad y carnet de conducir
// se pregunta si se tiene edad 
// y si cumple se pregunta si se tiene carnet
package es.udemy.entrada;

import javax.swing.JOptionPane;


public class carnetConducir {
    public static void main(String[] args) {

        int edad;
        String carnet;

        // entrada de datos para evaluación 
        edad=Integer.parseInt(JOptionPane.showInputDialog("Introduce la edad "));
        if (edad>=18){ //preguntamos por el carnet de conducir

                carnet=JOptionPane.showInputDialog("¿Tienes carnet de conducir ?");

                if (carnet.equalsIgnoreCase("si")){

                    JOptionPane.showMessageDialog(null,"Puedes comprarte un coche");
                  
                }
                else{
                    JOptionPane.showMessageDialog(null,"No puedes comprarte un coche");
                }

        }
        else{

            JOptionPane.showMessageDialog(null,"No puedes conducir");

        }
        
      

    }
    
}
