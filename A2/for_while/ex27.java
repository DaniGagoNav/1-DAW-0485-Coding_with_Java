import java.util.Scanner;

public class ex27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdueix un número enter per sumar els seus dígits: ");
        int numero = sc.nextInt();
        
        int suma = 0;
        int tempNumero = Math.abs(numero);
        while (tempNumero > 0) {
            suma += tempNumero % 10;
            tempNumero /= 10;
        }
        System.out.println("La suma dels dígits és: " + suma);
        sc.close();
    }
}

