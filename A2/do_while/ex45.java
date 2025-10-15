import java.util.Random;

public class ex45 {
    public static void main(String[] args) {
        Random random = new Random();
        int resultat;
        int intents = 0;
        
        do {
            resultat = random.nextInt(6) + 1;
            intents++;
            System.out.println("Llançament " + intents + ": Ha sortit un " + resultat);
        } while (resultat != 6);
        
        System.out.println("S'ha necessitat " + intents + " intents per treure un 6.");
    }
}

