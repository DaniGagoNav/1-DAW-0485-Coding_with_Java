package ex3;
import java.util.*;

public class metode {
    public static void comptaVocals(String inputText){
        int comptador = 0;
        for (int i = 0; i < inputText.length(); i++){
            char vocal = inputText.charAt(i);
            if (vocal == 'a' || vocal == 'e' || vocal == 'i' || vocal == 'o' || vocal == 'u' || vocal == 'A' || vocal == 'E' || vocal == 'I' || vocal == 'O' || vocal == 'U'){
                comptador++;
            }
        }
        System.out.println("El numero de vocals és: " + comptador);
    }

    public static void inverteixText(String inputText){
        String textInvertit = "";
        for (int i = inputText.length() -1; i >= 0; i--){
            textInvertit += inputText.charAt(i);
        }
        System.out.println("El text invertit és: " + textInvertit);
    }

    public static void esPalindrom(String inputText){
        String textMinus = inputText.toLowerCase();
        boolean esPalindromBool = true;

        for (int i = 0; i < textMinus.length()/2; i++){
            if (!(textMinus.charAt(i) == textMinus.charAt(textMinus.length()-i -1))) {
                esPalindromBool = false;
            }
        }
        System.out.println(esPalindromBool);
    }
}
