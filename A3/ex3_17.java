import java.util.Scanner;
public class ex3_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introdueix una paraula: ");
        String paraula = sc.nextLine();

        System.out.println("La paraula és: " + paraula + ", i la paraula sense vocals és: " +  paraula.replaceAll("[aeiouAEIOU]", ""));

        sc.close();
    }
}
