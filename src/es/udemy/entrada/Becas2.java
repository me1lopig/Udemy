// control de concesion de becas
// con dos variables de control, distancia al centro de estudios y renta familiar
// en este caso solo con cumplir un de los criterios
package es.udemy.entrada;

import javax.swing.JOptionPane;

public class Becas2 {
    public static void main(String[] args) {

        int distancia;
        int numeroHermanos;
        double renta;

        // entrada de datos para evaluación 
        distancia=Integer.parseInt(JOptionPane.showInputDialog("Introduce la distancia al colegio [km]"));
        numeroHermanos=Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de hermanos en el centro"));
        renta=Double.parseDouble(JOptionPane.showInputDialog("Introduce la renta familiar[€]"));

        // evaluación de concesión de beca 
        // en este caso con solo cumplir uno de los requisitos se concede
        if (distancia>10 || renta<20000 || numeroHermanos>=2){

            System.out.println("Se concede la beca");
        }
        else{
            System.out.println("No se concede la beca");

        }
        System.out.println("Resumen de los datos introducidos");
        System.out.println("Distancia al colegio "+distancia+" km");
        System.out.println("Número de hermanos en el colegio "+numeroHermanos);
        System.out.println("Renta familiar "+renta+" €");

    }
    
}
