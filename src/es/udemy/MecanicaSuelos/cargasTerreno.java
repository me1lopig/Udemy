// clase de cargas transmitidas al terreno para cimentaciones rectangulares
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
    // profundidad de cálculo
    private double z;




    public cargasTerreno(double B, double L,double q){
        //Constructor asignacion de los valores de la geometroa dela zapata
        this.B=B;
        this.L=L;
        this.q=q;
    }

    public cargasTerreno(double B, double L,double q,double z){
        //Constructor asignacion de los valores de la geometroa dela zapata
        this.B=B;
        this.L=L;
        this.q=q;
        this.z=z;
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
            segundoTermino=Math.PI-segundoTermino;
        }
        // valor de la tensión a la profundidad z
        return q*(primerTermino+Math.atan(segundoTermino))/(4*Math.PI);
        
    }  


    public double getTensionRectangularZ(double z){
        // calculo  de la tensión normal por métodos elásticos
        double r1=Math.sqrt(B*B+z*z);
        double r2=Math.sqrt(L*L+z*z);
        double r=Math.sqrt(B*B+L*L+z*z);

        return (q/(2*Math.PI))*(Math.atan(L*B/(z*r))+(L*B*z/r)*(1/(r1*r1)+1/(r2*r2)));

    }

    public double getTensionRectangularX(double z){
        // calculo  de la tensión normal por métodos elásticos
        double r1=Math.sqrt(B*B+z*z);
        double r=Math.sqrt(B*B+L*L+z*z);

        return (q/(2*Math.PI))*(Math.atan(L*B/(z*r))-L*B*z/(r1*r1*r));
    }

    public double getTensionRectangularY(double z){
        // calculo  de la tensión normal por métodos elásticos
        double r2=Math.sqrt(L*L+z*z);
        double r=Math.sqrt(B*B+L*L+z*z);

        return (q/(2*Math.PI))*(Math.atan(L*B/(z*r))-L*B*z/(r2*r2*r));
    }

    public double getTensionRectangularxz(double z){
        // calculo  de la tensión normal por métodos elásticos
        double r1=Math.sqrt(B*B+z*z);
        double r2=Math.sqrt(L*L+z*z);
        double r=Math.sqrt(B*B+L*L+z*z);

        return (q/(2*Math.PI))*(B/r2-z*z*B/(r1*r1*r));
    }
    public double getTensionRectangularyz(double z){
        // calculo  de la tensión normal por métodos elásticos
        double r1=Math.sqrt(B*B+z*z);
        double r2=Math.sqrt(L*L+z*z);
        double r=Math.sqrt(B*B+L*L+z*z);

        return (q/(2*Math.PI))*(L/r1-z*z*L/(r2*r1*r));
    }

    public double getTensionRectangularxy(double z){
        // calculo  de la tensión normal por métodos elásticos
        double r1=Math.sqrt(B*B+z*z);
        double r2=Math.sqrt(L*L+z*z);
        double r=Math.sqrt(B*B+L*L+z*z);

        return (q/(2*Math.PI))*(1+z/r-z*(1/r1-1/r2));
    }


}
