import java.util.Scanner;
public class ex3_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introdueix una frase per comptar quantes vegades apareix un caracter: ");
        String frase = sc.nextLine();

        System.out.println("Ara introdueix el caracter: ");
        char caracter = sc.next().charAt(0);

        int comptador = 0;

        for (int i =  0; i < frase.length(); i++){
            if (frase.charAt(i) == caracter){
                comptador++;
            }
        }
        System.out.println("El carcater introduit: " + "\"" + caracter + "\"" + ", ha sortit un numero de cops de: " + "\"" + comptador + "\"" + ", a la frase: " + "\"" + frase + "\"");

        sc.close();
    }
}
