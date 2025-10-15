import java.util.Scanner;

public class ex38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdueix una paraula per mostrar-la al revés: ");
        String paraula = sc.nextLine();
        
        String paraulaInvertida = "";
        for (int i = paraula.length() - 1; i >= 0; i--) {
            paraulaInvertida += paraula.charAt(i);
        }
        System.out.println("La paraula al revés és: " + paraulaInvertida);
        sc.close();
    }
}
