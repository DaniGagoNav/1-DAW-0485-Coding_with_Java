
    import java.util.Scanner;

public class ex37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdueix un número per començar el compte enrere: ");
        int n = sc.nextInt();
        
        while (n >= 0) {
            System.out.println(n);
            n--;
        }
        sc.close();
    }
}