import java.util.Scanner;
public class ex3_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Entra una frase: ");
        String frase = sc.nextLine();

        char caracters;
       

        for (int i = 0; i < frase.length(); i++) {
            caracters = frase.charAt(i);
            System.out.println("La frase caracter per caracter és: " + caracters);
        }
        sc.close();
    }
}
