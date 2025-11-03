import java.util.Scanner;
public class ex2_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introdueix una paraula: ");
        String paraula = sc.nextLine();

        for (int i = 0; i < paraula.length(); i++) {
            char caracter = paraula.charAt(i);
            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u' || caracter == 'A' || caracter == 'E' || caracter == 'I' || caracter == 'O' || caracter == 'U') {
                System.out.println("La paraula és: " + paraula + " i les vocals de les paraules són: " + "\"" + caracter + "\"");
            }
        }
       sc.close();
    }
}
