package ex3;
import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = 0;
        
        do{
            System.out.println("1.- SUMA VOCALS\n2.- INVERTEIX CADENA\n3.- ES PALINDROM?\n4.- SURT");

            System.out.println();

            System.out.println("Introdueix la acció que vols fer: ");
            input = sc.nextInt();

        }while (input != 4); {
            switch (input) {
                case 1:
                    metode.comptaVocals("");
                    break;
                case 2 :
                    metode.inverteixText("");
                    break;
                case 3:
                    metode.esPalindrom(true);
                    break;
                case 4:
                    System.out.println("Has sortit!");
                    break;
                default:
                    System.out.println("Entrada invalida.");
                    break;    
            }
        }
        sc.close();
    }
}
