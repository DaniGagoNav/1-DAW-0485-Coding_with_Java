import java.util.Scanner;

public class ex40{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        
        do {
            System.out.println("Introdueix un número enter positiu: ");
            numero = sc.nextInt();
        } while (numero <= 0);
        
        System.out.println("Has introduït un número vàlid: " + numero);
        sc.close();
    }
}
