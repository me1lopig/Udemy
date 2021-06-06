// ejemplo de uso de cadenas 
// no hay que poner Do While no le veo sentido




package es.udemy.Bucles;


import javax.swing.JOptionPane;

public class bucle_Do {
    
    public static void main(String[] args) {
        
        String texto;
        texto=JOptionPane.showInputDialog("Introduce el texto "); 
        
    
        // forma sin bucle
        JOptionPane.showMessageDialog(null,"El texto "+texto+" tiene una longitud de "+texto.length()+" caracteres");
    }
    
}
