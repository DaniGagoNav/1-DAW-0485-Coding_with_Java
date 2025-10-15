import java.util.Random;
import java.util.Scanner;

public class ex39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int numeroSecret = random.nextInt(100) + 1;
        int intent;
        
        System.out.println("Adivina el número secret (entre 1 i 100).");
        while (true) {
            System.out.println("Introdueix el teu intent: ");
            intent = sc.nextInt();
            if (intent < numeroSecret) {
                System.out.println("El número secret és més gran.");
            } else if (intent > numeroSecret) {
                System.out.println("El número secret és més petit.");
            } else {
                System.out.println("Correcte! Has endevinat el número secret.");
                break;
            }
        }
        sc.close();
    }
}
