import java.util.Scanner;

public class ex1_1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // Demana paraula
        System.out.println("Introdueix una paraula: ");
        
        // Creació variable
        String paraula = sc.nextLine();

        // Print llargada paraula
        System.out.println("La llargada de la paraula és: " + paraula.length());
        
        sc.close();
    }
}