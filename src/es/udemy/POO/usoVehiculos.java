// ejemplo de aplicacion de clases
// uso de vehiculos

package es.udemy.POO;

public class usoVehiculos {
    public static void main(String[] args) {
        // creacion de un objeto Vehiculos
        vehiculos miCoche=new vehiculos(); // objeto de tipo vehiculo o instancia

        // modificamos una de las propiedades el color
        System.out.println("El color inicial del vehiculo es "+miCoche.getColor());
        miCoche.setColor("Verde"); // Modificamos el color del coche, por paso de parametros
        System.out.println("El color del vehiculo es "+miCoche.getColor());


    }
    
}
