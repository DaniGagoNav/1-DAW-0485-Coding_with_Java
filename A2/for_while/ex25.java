import java.util.Scanner;

public class ex25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdueix un número per calcular el seu factorial: ");
        int n = sc.nextInt();
        
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println("El factorial de " + n + " és " + factorial);
        sc.close();
    }
}
