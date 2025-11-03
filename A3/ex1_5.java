import java.util.Scanner;

public class ex1_5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       
        
        // Creació variable
         // Demana paraula 1
        System.out.println("Introdueix una paraula: ");
        String paraula1 = sc.nextLine();

         // Demana paraula 2
        System.out.println("Introdueix un altre paraula: ");
        String paraula2 = sc.nextLine();

        // Si són iguals
        if(paraula1.equalsIgnoreCase(paraula2) && paraula2.equalsIgnoreCase(paraula1)){
            System.out.println("La paraula: " + "\"" + paraula1 + "\"" + " i la paraula: " + "\"" + paraula2 + "\"" + " coincideixen.");
        }else{
            System.out.println("La paraula: " + "\"" + paraula1 + "\"" + " i la paraula: " + "\"" + paraula2 + "\"" + " no coincideixen.");
        }
        sc.close();
    }
}