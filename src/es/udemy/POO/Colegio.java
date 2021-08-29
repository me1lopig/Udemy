package es.udemy.POO;

public class Colegio {

// propiedades
private String nombreColegio;
private int numeroAlumnos;
private String [][] listaAlumnos;
private double[] notaAlumnos;
private int id;// indice de las matrices
static private int codigo =0; // código independiente de los colegios introducidos



    public Colegio(String nombreColegio,int numeroAlumnos){
    //  constructor para crear la designacion del colegio y el numero de alumnos

        this.nombreColegio=nombreColegio;
        this.numeroAlumnos=numeroAlumnos; // dimension de las natrices

        // generación de las matrices de datos
        listaAlumnos= new String [1] [numeroAlumnos];
        notaAlumnos=new double [numeroAlumnos];
        id=0; // inicializamos el indice de las matrices
    }

    public void nuevoAlumno(String nombre,double nota){
        // se almacena el nombre y la nota del alumno en dos arrays
        listaAlumnos[0][id]=nombre;
        notaAlumnos[id]=nota;
        id++;
        codigo++; // incrementamos el valor del codigo independiente del colegio
    }

    public void imprimeAlumnos(){
        // sacamos por pantalla todos los alumnos que tengamos registrados
        System.out.println("Datos de todos los alumnos");
        for(int i=0;i<id;i++)
        {
            System.out.println("Nombre Alumno "+listaAlumnos[0][i]);
            System.out.println("Colegio "+nombreColegio);
            System.out.println("Número de alumno "+i);
            System.out.println("Nota media "+notaAlumnos[i]);
        }
    }


    public double notaMedia(){
        double media=0;
        for (int i=0;i<id;i++){
            media+=notaAlumnos[i];
        }
        return media/id;
    }


    static   int getcodigoFinal(){
        // metodo estático
        return codigo; // sacamos el final de codigo usado en la entrada de datos
    }


}
