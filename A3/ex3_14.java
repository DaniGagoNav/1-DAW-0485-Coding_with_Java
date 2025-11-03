import java.util.Scanner;
public class ex3_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introdueix una cadena: ");
        String cadena = sc.nextLine();
        String cadenaInvertida = "";

        System.out.println("La cadena és: " + cadena);
        for (int i = cadena.length() - 1; i >= 0; i--) {
            cadenaInvertida += cadena.charAt(i);
        }

        System.out.println("La cadena invertida queda: " + "\"" + cadenaInvertida + "\"" + "\n" + "Et compte la cadena invertida igual com si no estigues? " + "\"" + cadenaInvertida.equalsIgnoreCase(cadena) + "\"");

        sc.close();
    }
}
