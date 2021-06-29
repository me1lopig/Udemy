package es.udemy.POO;

public class sucursal {

    private long numeroSucursal;
    private String direccion;
    private String ciudad;

    
    public sucursal(long numeroSucursal, String direccion,String ciudad){
        // constructor que establece los valores de los atributos
        this.numeroSucursal=numeroSucursal;
        this.direccion=direccion;
        this.ciudad=ciudad;
    }
    
    // metodos getter para la obtencion de datos
    public long getNumeroSucursal(){
        // metodo para obtener el mumeros de la sucursal
        return numeroSucursal;
    }

    public String getDireccion(){
        // metodo para la obtencion de la direccion
        return direccion;
    }

    public String getCiudad(){
        // metodo para la obtencion de la ciudad
        return ciudad;
    }

    public double calculaPrecio(paquete paquete1){
        // se introduce el precio y la prioridad del envío
        // el precio se calcula en función del peso del paquete
        double precio=paquete1.getPeso(); 
        if(paquete1.getPrioridad()==1){
            precio+=10;
        }
        else if (paquete1.getPrioridad()==2) precio+=20;
        return precio;

    }

}
