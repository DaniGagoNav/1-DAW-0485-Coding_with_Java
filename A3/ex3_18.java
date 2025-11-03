import java.util.Scanner;
public class ex3_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introdueix una frase: ");
        String frase = sc.nextLine();

        System.out.println("La frase és: " + frase + ", conte java? " + frase.contains("Java"));

        sc.close();
    }
}