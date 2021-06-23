// clase vehiculos
// ejmplo de archivo de clase
package es.udemy.POO;

public class vehiculos {
    // propiedades de los vehículos todos private solo accesible desde la clase
    private int ruedas;
    private String color;
    private int largo; 
    private int ancho;
    private int peso;


    public vehiculos() { // método constructor de la clase
        // estado inicial del vehiculo
        ruedas=4;
        largo=2;
        ancho=1;
        peso=2;
        color="sin color";
    }

    // Metodos de la propiedad Color
    public void setColor(String color){// metodo setter para cambiar el color del vehiculo
        this.color=color;
    }

    public String getColor(){ // metodo getter para obtener el color del vehiculo
        return color;
    }
    

}
