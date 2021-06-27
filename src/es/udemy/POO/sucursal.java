package es.udemy.POO;

public class sucursal {

    private long numeroSucursal;
    private String direccion;
    private String ciudad;

    
    public sucursal(long numeroSucursal, String direccion,String ciudad){
        // constructor 
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



}
