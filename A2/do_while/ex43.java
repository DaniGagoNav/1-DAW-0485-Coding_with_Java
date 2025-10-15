import java.util.Scanner;

public class ex43 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int opcio;
        
        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Afegir");
            System.out.println("2. Esborrar");
            System.out.println("3. Sortir");
            System.out.println("Tria una opció: ");
            opcio = sc.nextInt();
            
            switch (opcio) {
                case 1:
                    System.out.println("Has triat Afegir.");
                    break;
                case 2:
                    System.out.println("Has triat Esborrar.");
                    break;
                case 3:
                    System.out.println("Sortint del programa...");
                    break;
                default:
                    System.out.println("Opció no vàlida. Torna a intentar.");
            }
        } while (opcio != 3);
        sc.close();
    }
}
