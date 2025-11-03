import java.util.Scanner;

public class ex1_2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // Demana paraula
        System.out.println("Introdueix una paraula: ");
        
        // Creació variable
        String paraula = sc.nextLine();

        // Print caracter paraula
        System.out.println("El primer caracter de la paraula és: " + paraula.charAt(0) + "\nEl ultim caracter de la paraula és:  " + paraula.charAt(paraula.length() - 1));
       
        sc.close();
    }
}