import java.util.Scanner;
public class ex22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdueix un número per a la seva taula de multiplicar: ");
        int n = sc.nextInt();
        
        System.out.println("Taula de multiplicar del " + n + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }
}
