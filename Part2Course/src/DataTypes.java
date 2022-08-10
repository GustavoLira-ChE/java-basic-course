public class DataTypes {
    public static void main(String args[]){
        /* TIPOS DE DATOS NÚMERICOS */
        /* Enteros */
        int n = 123456789;
        System.out.println(n);
        byte byteNumber = 120; /* Desde -128 - 127 */
        System.out.println(byteNumber);
        short shortNumber = 32000; /* -32768 - 32767 */
        System.out.println(shortNumber);
        /* Al final de un número long poner una L */
        long longNumber = -92233720368547758L; /* -9223372036854775808 a- 79223372036854775807 */
        System.out.println(longNumber);

        /* Decimales */
        /* Al final de un número declarado con float poner una F */
        float floatNumber = 1.1234234523F; /* 1.40129846432481707e-45 - 3.40282346638528860e+38 */
        System.out.println(floatNumber);
        double doubleNumber = 1.5456161; /* 4.94065645841246544e-324d - 1.79769313486231570e+308d */
        System.out.println(doubleNumber);

        /* TIPOS  DE DATOS TEXTO */
        char charTypeValue = 'a';
        System.out.println(charTypeValue);
        String stringTypeValue = "texto1";
        System.out.println(stringTypeValue);

        /* TIPOS DE DATOS BOOLEANOS */
        boolean booleanType = true;
        System.out.println(booleanType);
        
        /* VAR KEYWORD para inferir el dato */
        var varDataType = "texto2";
        System.out.println(varDataType);
    }
}
