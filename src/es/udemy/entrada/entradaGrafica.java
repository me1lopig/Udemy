// entrada de datos desde una ventana
package es.udemy.entrada;
import javax.swing.JOptionPane;

public class entradaGrafica {

    public static void main(String[] args) {
        
        String nombre=JOptionPane.showInputDialog("Introduce tu nombre");
        int edad=Integer.parseInt( JOptionPane.showInputDialog("Introduce tu edad"));
       
        System.out.println("El nombre es "+nombre);
        System.out.println("La edad es  "+edad);

    }

    
}
