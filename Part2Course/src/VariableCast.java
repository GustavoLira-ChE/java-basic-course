public class VariableCast {
    public static void main(String[] args) {
        //En programación hay situaciones donde es necesario cambiar el tipo de dato (Exactitud, Estimación)
        //Ejemplo de CAST

        //En un año se ubicaron 302 perros en diferentes hogares
        //¿Cuántos perros fueron ubicados al mes?

        double monthlyDogs = 302.0 / 12.0;
        System.out.println(monthlyDogs);

        //Estimación
        int monthlyDogEstimation = (int) monthlyDogs;
        System.out.println(monthlyDogEstimation);
        
        //Exactitud
        int a = 302;
        int b = 12;
        System.out.println(a/b);
        System.out.println((double) a/b);
        
    }
}
