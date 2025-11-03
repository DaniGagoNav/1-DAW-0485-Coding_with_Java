import java.util.Scanner;

public class ex1_4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // Demana paraula
        System.out.println("Introdueix una paraula: ");
        
        // Creació variable
        String paraula = sc.nextLine();

        // Print comença/acaba paraula
        System.out.println("Comença amb: " + paraula.startsWith("a") + "\nAcaba amb: " + paraula.endsWith("s"));
        
        sc.close();
    }
}