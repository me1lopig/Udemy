// clase de cargas transmitidas al terreno por distintos tipos de cimenataciones
// incluye los tipos
// tensiones verticales de una carga rectangular calculo en el borde del rectangulo BxL
// B es el dado menor
// L es el lado mayor

package es.udemy.MecanicaSuelos;

public class cargasTerreno {
    // atributos del tipo de cimentación

    // dimenaiones de la cimentación
    private double B;
    private double L;
    // valor de la carga
    private double q; 
    // prpfundidad de calculo
    private double zmax=2*B; // se recomienda un valor inicial de 2 el ancho menor de la cimentación

    public cargasTerreno(double B, double L,double q){
        //Constructor asignacion de los valores de la geometroa dela zapata
        this.B=B;
        this.L=L;
        this.q=q;

    }

    public void setProfundidad( double zmax){
        // modificación de la profundidad de cálculo
        this.zmax=zmax;
    }


    
    
}
