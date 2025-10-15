import java.util.Scanner;

public class ex41{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suma = 0;
        int numero;
        
        do {
            System.out.println("Introdueix un número (0 per acabar): ");
            numero = sc.nextInt();
            suma += numero;
        } while (numero != 0);
        
        System.out.println("La suma total és: " + suma);
        sc.close();
    }
    
}
