public class IncrementDecrement {
    public static void main(String[] args) {
        int lives = 5;
        lives = lives -1;
        System.out.println(lives);
        
        //Decremento
        lives--;
        System.out.println(lives);
        
        //Incremento
        lives++;
        System.out.println(lives);
        
        // Decremento e incremento prefijo
        int gift = 100 + lives++;
        System.out.println(gift);
        System.out.println(lives);



    }
}
