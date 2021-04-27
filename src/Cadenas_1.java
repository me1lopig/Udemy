public class Cadenas_1 {
// uso elemental de cadenas en Java
    public static void main(String[] args) {
        String nombre="Juan";

        System.out.println("Mi nombre es "+" "+nombre);
        System.out.printf("La longitud de %s es %d%n",nombre,nombre.length()); // ver la longitud de una cadena

        System.out.printf("La segunda posición de %s es %s%n",nombre,nombre.charAt(1));// sacar una letra de un string en una posición determinada
        System.out.printf("La tercera posición de %s es %s%n",nombre,nombre.charAt(2));

        // usando un bucle para sacar todas las letras
        for(int i=0;i<nombre.length();i++)
        {
            System.out.printf("La posición %d de %s es %s%n",i,nombre,nombre.charAt(i));
        }
    }
    
}
