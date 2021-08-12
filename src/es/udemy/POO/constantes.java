package es.udemy.POO;
// uso de static

public class constantes {

    public static void main(String[] args) {

        Empleados empleado1=new Empleados("Ana");
        empleado1.setSeccion("Recursos Humanos");  // cambiamos el departamento
        Empleados empleado2=new Empleados("Antonio");
        Empleados empleado3=new Empleados("María");

        // datos de los empleados
        System.out.println(empleado1.getDatosEmpleado());
        System.out.println(empleado2.getDatosEmpleado());   
        System.out.println(empleado3.getDatosEmpleado());

    }
    
}

class Empleados{

    public Empleados (String nombre){
        this.nombre=nombre;
        seccion="Administracion";
        id=idSiguiente;
        idSiguiente++;
        
    }

    public void setSeccion(String seccion){
        this.seccion=seccion;
    }

  
    public String getDatosEmpleado(){

        return "El empleado " + nombre + " pertenece a la seccion de " + seccion+", identificador = "+id;
    }

    // propiedades de la clase
    private final String nombre; // una vez declarada no se puede cambiar una vez
    // que se declara en el constructor durante la ejeución del programa
    // se cambia sólo una vez y despues durante la ejecución  no se puede cambiar más
    private String seccion; // seccion donde trabajan los empleados
    private int id; // identificaos de empleado
    private static int idSiguiente=1; // variable de clase de incremento de numeros de empleado


}

