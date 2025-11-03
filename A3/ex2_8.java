import java.util.Scanner;
public class ex2_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("introdueix una frase: ");
        String frase = sc.nextLine();

        System.out.println("Introdueix una paraula per buscar a la frase: ");
        String paraula = sc.nextLine();

        System.out.println("La paraula buscada dins la frase que és: " + frase + " és: " + "\"" + frase.indexOf(paraula) + "\"");

        sc.close();
    }
}
