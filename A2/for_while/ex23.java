import java.util.Scanner;

public class ex23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdueix una cadena de text: ");
        String text = sc.nextLine();
        
        for (int i = 0; i < text.length(); i++) {
            System.out.println(text.charAt(i));
        }
        sc.close();
    }
}
