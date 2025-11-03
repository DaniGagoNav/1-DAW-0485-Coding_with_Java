import java.util.Scanner;
public class ex2_7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introdueix una cadena: ");
        String cadena = sc.nextLine().substring(0, 5);

        System.out.println("Els primers cinc caracters de la cadena són: " + "\"" + cadena + "\"");

        sc.close();
    }
}