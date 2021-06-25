// clase vehiculos
// ejmplo de archivo de clase
package es.udemy.POO;

public class vehiculos {
    // propiedades de los vehículos todos private solo accesible desde la clase
    // encapsuladas, solo se puede cambiar desde la clase
    private int ruedas;
    private String color;
    private int largo; 
    private int ancho;
    private int peso;


    public vehiculos() { // método constructor de la clase con atributos fijos
        // estado inicial del vehiculo
        ruedas=4;
        largo=2;
        ancho=1;
        peso=2;
        color="sin color";
    }

    public vehiculos(int ruedas, int largo, int ancho,int peso,String color) { // método constructor con posibilidad de cambiar los atributos
        // estado inicial del vehiculo
        this.ruedas=ruedas;
        this.largo=largo;
        this.ancho=ancho;
        this.peso=peso;
        this.color=color;
    }



    // Metodos de la propiedad Color
    public void setColor(String color){// metodo setter para cambiar el color del vehiculo
        this.color=color;
    }

    public String getColor(){ // metodo getter para obtener el color del vehiculo
        return color;
    }
    
    public String getDatosVehiculo(){

        return "El vehiculo tiene "+ruedas+" ruedas\nun largo de "+largo+" m\nancho de "+ancho+" m \ny pesa "+peso+" kg\nes de color "+color;


    }



}
