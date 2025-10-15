import java.util.Scanner;

public class ex26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdueix un número per calcular el seu factorial: ");
        int n = sc.nextInt();
        
        long factorial = 1;
        int i = 1;
        while (i <= n) {
            factorial *= i;
            i++;
        }
        System.out.println("El factorial de " + n + " és " + factorial);
        sc.close();
    }
}
