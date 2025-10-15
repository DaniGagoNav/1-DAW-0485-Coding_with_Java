import java.util.Scanner;

public class ex48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sumaNotes = 0;
        int numNotes = 0;
        double nota;
        
        System.out.println("Introdueix notes (negatiu per acabar).");
        do {
            System.out.println("Nota: ");
            nota = sc.nextDouble();
            if (nota >= 0 && nota <= 10) {
                sumaNotes += nota;
                numNotes++;
            } else if (nota >= 0) {
                System.out.println("Nota no vàlida. Ha de ser entre 0 i 10.");
            }
        } while (nota >= 0);
        
        if (numNotes > 0) {
            double mitjana = sumaNotes / numNotes;
            System.out.printf("La mitjana de les notes és: %.2f%n", mitjana);
        } else {
            System.out.println("No s'han introduït notes vàlides.");
        }
        sc.close();
    }
}

