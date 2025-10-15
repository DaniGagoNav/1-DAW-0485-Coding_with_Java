import java.util.Scanner;

public class ex47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char confirmacio;
        
        do {
            System.out.println("Estàs segur que vols sortir? (S/N): ");
            confirmacio = sc.next().toUpperCase().charAt(0);
        } while (confirmacio != 'S' && confirmacio != 'N');
        
        if (confirmacio == 'S') {
            System.out.println("Sortint del programa...");
        } else {
            System.out.println("Operació cancel·lada.");
        }
        sc.close();
    }
}
