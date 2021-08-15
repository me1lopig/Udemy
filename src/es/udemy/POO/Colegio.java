package es.udemy.POO;

public class Colegio {

// propiedades
private String nombreColegio;
private int numeroAlumnos;
private String listaColegios[]=new String[numeroAlumnos];
private String listaAlumnos[]= new String [numeroAlumnos];
private double notaAlumnos[]=new double [numeroAlumnos];
private int id; // independiente del colegio
private static int idSiguiente=0; // variable de clase de incremento de numeros de empleado


    public Colegio(String nombreColegio,int numeroAlumnos){
    //  constructor para crear la designacion del colegio y el numero de alumnos

        this.nombreColegio=nombreColegio;
        this.numeroAlumnos=numeroAlumnos;
        id=idSiguiente;
        idSiguiente++;
    }

    public void nuevoAlumno(String Nombre,double nota){
        // se almacena el nombre y la nota del alumno en dos arrays
        listaAlumnos[id]=Nombre;
        notaAlumnos[id]=nota;

    }

    public void  getTodosAlumnos(){
        // sacamos por pantalla todos los alumnos que tengamos registrados
        System.out.println("Nombre Alumno");
        System.out.println("Colegio");
        System.out.println("Número de alumno");
        System.out.println("Nota media");

    }

}
