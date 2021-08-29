package es.udemy.POO;

// clases de uso colegio
//

public class UsoColegio {

    public static void main(String[] args) {

        Colegio SanJavier = new Colegio("San Javier",200);
        Colegio SanJuan = new Colegio("San Juan",150);
    
        
        // introducción de datos de los alumnos de un colegio 1
        SanJavier.nuevoAlumno("Antonio", 7.9);
        SanJavier.nuevoAlumno("Manuela", 8.3);
        SanJavier.nuevoAlumno("Juan", 6.8);

        // introducción de datos de los alumnos de un colegio 2
        SanJuan.nuevoAlumno("Manuel", 7.8);
        SanJuan.nuevoAlumno("Josefina", 8.9);
        SanJuan.nuevoAlumno("Antonia", 6.7);
  
  

        // obtención de los datos de todos loa alumnos incluidos

        
        // obtención de un alumno en particular


        // cambiar la nota de algún alumno

        // imprine el código final mediante un método estático
        
        System.out.println("El código final es "+Colegio.getcodigoFinal());


    }
    
}
