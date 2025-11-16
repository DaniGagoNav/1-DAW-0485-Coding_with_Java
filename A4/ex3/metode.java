package ex3;
import java.util.*;

public class metode {
    public static void comptaVocals(String cadena1){
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserta una cadena per comptar les vocals: ");
        cadena1 = sc.nextLine();
        int comptador = 0;
        for (int i = 0; i < cadena1.length(); i++){
            char vocal = cadena1.charAt(i);
            if (vocal == 'a' || vocal == 'e' || vocal == 'i' || vocal == 'o' || vocal == 'u' || vocal == 'A' || vocal == 'E' || vocal == 'I' || vocal == 'O' || vocal == 'U'){
                comptador++;
            }
        }
        System.out.println("El numero de vocals és: " + comptador);
    }

    public static void inverteixText(String textOriginal){
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserta una frase per invertirla: ");
        textOriginal = sc.nextLine();
        String textInvertit = "";
        for (int i = textOriginal.length() -1; i >= 0; i--){
            textInvertit += textOriginal.charAt(i);
        }
        System.out.println("El text invertit és: " + textInvertit);
    }

    public static void esPalindrom(boolean esPalindromBool){
        Scanner sc = new Scanner(System.in);

        String textPrincipal;
        System.out.println("Inserta una frase per mostrar si es un palindrom: ");
        textPrincipal = sc.nextLine();
        String textMinus = textPrincipal.toLowerCase();
        
        esPalindromBool = true;
        for (int i = 0; i < textMinus.length()/2; i++){
            if (!(textMinus.charAt(i) == textMinus.charAt(textMinus.length()-i -1))) {
                esPalindromBool = false;
            }
        }
        System.out.println(esPalindromBool);

        sc.close();
    }
}
