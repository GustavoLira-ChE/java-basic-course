public class MathematicOperations {
    public static void main(String[] args) {
        double x = 2.1;
        double y = 3;

        //Math es una clase de Java que permite realizar muchos tipos de operaciones matemáticas

        // Ceil hace un redondeo al entero mayor más cercano
        System.out.println(Math.ceil(x));
        
        // floor hace el redondeo al número menor más cercano
        System.out.println(Math.floor(x));

        //Obtener la raiz cuadrada de un número
        System.out.println(Math.sqrt(y));
        
        // Obtener el área de un circulo
        // Math.pow arroja el valor de un número base elevado a una potencia
        System.out.println(Math.PI * Math.pow(y, 2));
        
        //Área de una esfera
        System.out.println(4 * Math.PI * Math.pow(y, 2));
        
        //Volúmen de una esfera
        System.out.println((4/3) * Math.PI * Math.pow(y, 3));

    }
}
