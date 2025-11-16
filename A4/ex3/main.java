package ex3;
import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);

        int input = 0;
        do{
            System.out.println("1.- SUMA VOCALS\n2.- INVERTEIX CADENA\n3.- ES PALINDROM?\n4.- SURT");

            System.out.println();
            System.out.println("Introdueix la acció que vols fer: ");
            input = sc.nextInt();
            String inputText;
            switch (input) {
                case 1:
                    System.out.println("Introdueix el text que vols posar: ");
                    inputText = sc1.nextLine();
                    metode.comptaVocals(inputText);
                    break;
                case 2 :
                    System.out.println("Introdueix el text que vols posar: ");
                    inputText = sc1.nextLine();
                    metode.inverteixText(inputText);
                    break;
                case 3:
                    System.out.println("Introdueix el text que vols posar: ");
                    inputText = sc1.nextLine();
                    metode.esPalindrom(inputText);
                    break;
                case 4:
                    System.out.println("Has sortit!");
                    break;
                default:
                    System.out.println("Entrada invalida.");
                    break;    
            }
        }while(input != 4);
        sc.close();
    }
}
