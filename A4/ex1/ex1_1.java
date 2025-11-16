package ex1;
import java.util.*;

public class ex1_1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdueix un nombre: ");
        int a = sc.nextInt();
        
        System.out.println();

        System.out.println("Introdueix un altre nombre: ");
        int b = sc.nextInt();

        System.out.println();

        suma(a, b);
        resta(a, b);
        multiplicacio(a, b);
        divisio(a, b);
    }

    public static int suma(int a, int b){
        int suma = a + b;
        System.out.println("El resultat es: " + suma);
        return suma;
    }

    public static int resta(int a, int b){
        int resta = a - b;
        System.out.println("El resultat es: " + resta);
        return resta;
    }

    public static int multiplicacio(int a, int b){
        int multiplicacio = a * b;
        System.out.println("El resultat es: " + multiplicacio);
        return multiplicacio;
    }

    public static int divisio(int a, int b){
        int divisio = a / b;
        if(divisio != 0){
            System.out.println("El resultat es: " + divisio);
        }else{
            System.out.println("El divisor no pot ser 0. ");
            divisio = 0;
        }
        return divisio;
    }
}
