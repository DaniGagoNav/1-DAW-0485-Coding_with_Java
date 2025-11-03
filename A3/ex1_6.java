import java.util.Scanner;
public class ex1_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introdueix una frase: ");
        String frase = sc.nextLine().trim();

        System.out.println("La frase sense espais al principi i final és: " + "\"" + frase + "\"");

        sc.close();
    }
}
