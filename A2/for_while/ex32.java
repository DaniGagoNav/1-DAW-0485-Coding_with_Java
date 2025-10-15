import java.util.Scanner;

public class ex32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        
        System.out.println("Introdueix números. El programa acabarà quan introdueixis un número negatiu.");
        while (true) {
            System.out.println("Número: ");
            numero = sc.nextInt();
            if (numero < 0) {
                break;
            }
        }
        System.out.println("S'ha introduït un número negatiu. El programa ha acabat.");
        sc.close();
    }
}
