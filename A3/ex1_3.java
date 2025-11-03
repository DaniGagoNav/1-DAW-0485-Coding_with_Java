import java.util.Scanner;

public class ex1_3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // Demana paraula
        System.out.println("Introdueix una paraula: ");
        
        // Creació variable
        String paraula = sc.nextLine();

        // Print majuscules/minuscules paraula
        System.out.println("La cadena en majuscules: " + paraula.toUpperCase() + "\nLa cadena en minuscules: " + paraula.toLowerCase());
       
        sc.close();
    }
}