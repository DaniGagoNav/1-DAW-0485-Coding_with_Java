import java.util.Scanner;

public class ex36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdueix el nombre de files (n): ");
        int n = sc.nextInt();
        System.out.println("Introdueix el nombre de columnes (m): ");
        int m = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
