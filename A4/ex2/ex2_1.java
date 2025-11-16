package ex2;
import java.util.Scanner;

public class ex2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdueix la temperatura en celisus: ");
        double c = sc.nextDouble();
        c = ex2_2.celsiusAFahrenheit(c);
        System.out.println(c);

        System.out.println("Introdueix la temperatura en fahrenheit: ");
        double f = sc.nextDouble();
        sc.close();
        f = ex2_2.fahrenheitACelsius(f);
        System.out.println(f);
    }
}
