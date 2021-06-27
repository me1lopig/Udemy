// manejo de la clase de cuentas corrientes

package es.udemy.POO;

public class usoCuenta {
    public static void main(String[] args) {

        cuentaCorriente cuenta1=new cuentaCorriente("Juan Gómez",1500);
        cuentaCorriente cuenta2=new cuentaCorriente("María López",2500);

        cuentaCorriente.Transferencia(cuenta1, cuenta2, 200); // es estatic no hace falta instanciar

        System.out.println(cuenta1.getDatosCuenta());
        System.out.println(cuenta2.getDatosCuenta());
        

    }

    
}
