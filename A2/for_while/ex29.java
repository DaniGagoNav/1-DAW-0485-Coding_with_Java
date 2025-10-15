import java.util.Scanner;

public class ex29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introdueix el primer número: ");
        int a = sc.nextInt();
        System.out.print("Introdueix el segon número: ");
        int b = sc.nextInt();
        
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        System.out.println("El màxim comú divisor és: " + a);
        sc.close();
    }
}
