import java.util.Scanner;
public class ex2_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introdueix una frase: ");
        String frase = sc.nextLine();

        System.out.println("La frase conté: " + frase.split(frase, frase.length()) + "paraules");
    }
}
