// clase que define el tipo de paquete a enviar

package es.udemy.POO;

public class paquete {

    private String refEnvio;
    private float peso;
    private long dni;
    private byte prioridad; //valores 0, 1, 2


    public paquete(String refEnvio,float peso,long dni,byte prioridad){
        // metodo constructor
        this.refEnvio=refEnvio;
        this.peso=peso;
        this.dni=dni;
        this.prioridad=prioridad;
    }

    public void setPeso (float peso){
        // modificación de peso si que quiere
        // comprobamos que el peso es mayor que 0, eb caso contrario se deja igual

        if(peso>0) this.peso=peso;
        else System.out.println("El valor del peso "+peso+" es incorrecto, se mantiene el inicial");   
    }
    
    public void setPrioridad(byte prioridad){
        // modificación de la prioridad
        // se compruba que sea correcta
        if(prioridad==0||prioridad==1||prioridad==2) this.prioridad=prioridad;
        else System.out.println("La prioridad "+prioridad+" no es correcta, se mantiene la inicial");
    }

    public float getPeso(){
        // retorno del peso
        return peso;
    }

    public byte getPrioridad(){
        // retorno de la prioridad
        return prioridad;
    }



}
