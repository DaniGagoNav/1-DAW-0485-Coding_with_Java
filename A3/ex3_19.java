/*import java.util.Scanner;
public class ex3_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introdueix una frase: ");
        String paraula = sc.nextLine();
        
        paraula.split(" ");

        System.out.println("La abreviatura és: ");
        for (int i = 0; i <= paraula.length() - 1; i++){
            if (Character.isUpperCase(paraula.charAt(i))) {
                System.out.print(paraula.charAt(i));
            }
        }

        sc.close();
    }
}*/
import java.util.Scanner;
public class ex3_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introdueix una frase: ");
        String frase = sc.nextLine();
        
        String[] paraula = frase.split(" ");
        String abrev = " ";
       
        for (int i = 0; i <= paraula.length; i++){
            if (!paraula[i].isEmpty()) {
                abrev += Character.toUpperCase(paraula[i].charAt(i));
                
            }
        }
        System.out.println("La abreviatura es" + abrev);
    }
}