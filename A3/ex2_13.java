import java.util.Scanner;
public class ex2_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introdueix una frase per eliminar els espais: ");
        String frase = sc.nextLine();

        System.out.println("La frase amb espais és: " + "\"" + frase + "\"" + " i sense espais és: " + "\"" + frase.replaceAll(" ", "") + "\"");

        sc.close();
    }
}
