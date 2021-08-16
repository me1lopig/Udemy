package es.udemy.POO;

public class Colegio {

// propiedades
private String nombreColegio;
private int numeroAlumnos;
private String listaAlumnos[]= new String [numeroAlumnos];
private double notaAlumnos[]=new double [numeroAlumnos];
private int id=0; // independiente del colegio




    public Colegio(String nombreColegio,int numeroAlumnos){
    //  constructor para crear la designacion del colegio y el numero de alumnos

        this.nombreColegio=nombreColegio;
        this.numeroAlumnos=numeroAlumnos;
    }

    public void nuevoAlumno(String nombre,double nota){
        // se almacena el nombre y la nota del alumno en dos arrays

        listaAlumnos[id]=nombre;
        notaAlumnos[id]=nota;
        id++;

    }

    public void  getTodosAlumnos(){
        // sacamos por pantalla todos los alumnos que tengamos registrados

        for(int i=0;i<=id;i++)
        {
            System.out.println("Nombre Alumno "+listaAlumnos[id]);
            System.out.println("Colegio "+nombreColegio);
            System.out.println("Número de alumno "+id);
            System.out.println("Nota media "+notaAlumnos[id]);
        }

        

    }

    public void getAlumno(){
        // datos de un solo alumno

    }

}
