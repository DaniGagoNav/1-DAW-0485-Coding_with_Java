package ex1;
import java.util.Scanner;

public class Principal {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = 0;
        while (input != 5) {
            System.out.println("1.- SUMA\n2.- RESTA\n3.- MULTIPLICACIO\n4.- DIVISIO\n5.- SORTIR");

            System.out.println();

            System.out.println("Introdueix la operacio que vols fer: ");
            input = sc.nextInt();

            System.out.println("Introdueix un enter: ");
            int a = sc.nextInt();
            
            System.out.println();

            System.out.println("Introdueix un altre enter: ");
            int b = sc.nextInt();

            System.out.println();

            int resultat = 0;

            switch (input) {
                case 1:
                    System.out.println("El resultat es : " + (resultat = Metodes.suma(a, b)));
                    break;
                case 2 :
                    System.out.println("El resultat es : " + (resultat = Metodes.resta(a, b)));
                    Metodes.resta(a, b);
                    break;
                case 3:
                    System.out.println("El resultat es : " + (resultat = Metodes.multiplicacio(a, b)));
                    Metodes.multiplicacio(a, b);
                    break;
                case 4:
                    System.out.println("El resultat es : " + (resultat = Metodes.divisio(a, b)));
                    Metodes.divisio(a, b);
                    break;
                case 5:
                    System.out.println("Has sortit!");
                    break;
                default:
                    System.out.println("Entrada invalida.");
                    break;    
            }
        }
    }
   
}
