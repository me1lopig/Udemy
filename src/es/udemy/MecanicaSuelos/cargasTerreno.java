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


    public cargasTerreno(double B, double L,double q){
        //Constructor asignacion de los valores de la geometroa dela zapata
        this.B=B;
        this.L=L;
        this.q=q;
    }

    public double getTensionRectangular(double z){
        // se introduce el valor de z
        double m=B/z;
        double n=L/z;
        double primerTermino;
        double segundoTermino;

        primerTermino=2*m*n*Math.sqrt(m*m+n*n+1)*(m*m+n*n+2)/((m*m+n*n+m*m*n*n+1)*(m*m+n*n+1));
        segundoTermino=2*m*n*Math.sqrt(m*m+n*n+1)/(m*m+n*n+1-m*m*n*n);
        if (segundoTermino<0){ 
            // corrección por término negativo
            segundoTermino=Math.PI-2*m*n*Math.sqrt(m*m+n*n+1)/(m*m+n*n+1-m*m*n*n);
        }
        // valor de la tensión a la profundidad z
        return q*(primerTermino+Math.atan(segundoTermino))/(4*Math.PI);
        
    }  
    
}
