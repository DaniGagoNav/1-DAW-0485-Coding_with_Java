import java.util.Scanner;

public class ex28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdueix el nombre de termes de la successió de Fibonacci que vols mostrar: ");
        int n = sc.nextInt();

        int a = 0, b = 1;
        System.out.println("Els primers " + n + " termes de la successió de Fibonacci són:");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
        }
        sc.close();
    }
}
