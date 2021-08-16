package es.udemy.POO;

// clases de uso colegio
//

public class UsoColegio {

    public static void main(String[] args) {

        Colegio SanJavier = new Colegio("San Javier",200);
    
        
        // introducción de datos de los alumnos
        SanJavier.nuevoAlumno("Antonio", 7);
        SanJavier.nuevoAlumno("Manuela", 8);
        SanJavier.nuevoAlumno("Juan", 6);

        // obtención de los datos de todos loa alumnos incluidos
        SanJavier.getTodosAlumnos();
        
        // obtención de un alumno en particular


        // cambiar la nota de algún alumno


    }
    
}
