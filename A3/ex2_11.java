import java.util.Scanner;
public class ex2_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introdueix una cadena: ");
        String cadena = sc.nextLine();
        String cadenaInvertida = "";

        System.out.println("La cadena és: " + cadena);
        for (int i = cadena.length() - 1; i >= 0; i--) {
            cadenaInvertida += cadena.charAt(i);
        }

        System.out.println(cadenaInvertida);

        sc.close();
    }
}
