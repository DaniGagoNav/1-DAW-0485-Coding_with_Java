import java.util.Scanner;

public class ex46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double saldo = 0;
        char resposta;
        
        do {
            System.out.println("Vols introduir un moviment? (S/N): ");
            resposta = sc.next().toUpperCase().charAt(0);
            
            if (resposta == 'S') {
                System.out.print("Introdueix l'import del moviment: ");
                double importMoviment = sc.nextDouble();
                saldo += importMoviment;
                System.out.println("Saldo actual: " + saldo);
            }
        } while (resposta == 'S');
        
        System.out.println("Procés finalitzat. Saldo final: " + saldo);
        sc.close();
    }
}
