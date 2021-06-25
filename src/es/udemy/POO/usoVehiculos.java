// ejemplo de aplicacion de clases
// uso de vehiculos

package es.udemy.POO;

public class usoVehiculos {
    public static void main(String[] args) {
        // creacion de un objeto Vehiculos
        vehiculos miCoche=new vehiculos(); // objeto de tipo vehiculo o instancia se pueden crear las que queramos
        vehiculos miCoche2=new vehiculos(); // otra instancia de la clase
        vehiculos moto=new vehiculos(2,2,1,100,"Celeste"); // instancia de vehiculo de dos ruedas

        // modificamos una de las propiedades el color de la instancia miCoche
        System.out.println("El color inicial del vehiculo 1 es "+miCoche.getColor());
        miCoche.setColor("Verde"); // Modificamos el color del coche, por paso de parametros
        System.out.println("El color del vehiculo es "+miCoche.getColor());
    

        // modificamos una de las propiedades el color de la instancia miCoche
        System.out.println("El color inicial del vehiculo 2 es "+miCoche2.getColor());
        miCoche2.setColor("Azul"); // Modificamos el color del coche, por paso de parametros
        System.out.println("El color del vehiculo es "+miCoche2.getColor());

        // caracteristicas de la moto
        System.out.println("Carateristicas del vehiculo moto");
        System.out.println(moto.getDatosVehiculo());

        // caracteristicas de vehiculo 1
        System.out.println("Carateristicas del vehiculo coche1");
        System.out.println(miCoche.getDatosVehiculo());


    }
    
}
