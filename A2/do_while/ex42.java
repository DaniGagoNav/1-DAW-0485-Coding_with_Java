import java.util.Random;
import java.util.Scanner;

public class ex42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int numeroSecret = random.nextInt(10) + 1;
        int intent;
        
        System.out.println("Adivina el número secret (entre 1 i 10).");
        do {
            System.out.print("Introdueix el teu intent: ");
            intent = sc.nextInt();
            if (intent != numeroSecret) {
                System.out.println("Incorrecte. Torna a intentar.");
            }
        } while (intent != numeroSecret);
        
        System.out.println("Correcte! Has encertat el número secret.");
        sc.close();
    }
    
}
