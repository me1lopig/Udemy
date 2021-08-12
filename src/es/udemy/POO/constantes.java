package es.udemy.POO;
// uso de static

public class constantes {

    public static void main(String[] args) {
        Empleados empleado1=new Empleados("Ana");
        System.out.println(empleado1.getDatosEmpleado());

        // cambiamos el departamento
        empleado1.setSeccion("Recursos Humanos");
        System.out.println(empleado1.getDatosEmpleado());


    }
    
}

class Empleados{

    public Empleados (String nombre){
        this.nombre=nombre;
        seccion="Administracion";
    }

    public void setSeccion(String seccion){
        this.seccion=seccion;
    }

  
    public String getDatosEmpleado(){

        return "El empleado " + nombre + " pertenece a la seccion de " + seccion;
    }

    // propiedades de la clase
    private final String nombre; // una vez declarada no se puede cambiar una vez
    // que se declara en el constructor durante la ejeución del programa
    // se cambia sólo una vez
    private String seccion;



}