// Manejo de condicionales
// uso del else if para varias opciones

package es.udemy.entrada;

import javax.swing.JOptionPane;

public class Condicional_1 {
    public static void main(String[] args) {
        int edad; // variable que vamos a usar para controlar el entrada
        // entrada del dato
        edad=Integer.parseInt(JOptionPane.showInputDialog("Introduce la edad [Entero positivo]"));

        if(edad<18){

            System.out.println("Eres una persona muy joven");
        }
        else if (edad<41) {

            System.out.println("Eres una persona adulta");
        }
        else if (edad<65) {

            System.out.println("Eres una persona madura");
        }
        else  { // si no se cumple ninguna de las anteriores se ejecuta esta 

            System.out.println("Debes de empezar a cuidarte");
        }

    }
    
}
