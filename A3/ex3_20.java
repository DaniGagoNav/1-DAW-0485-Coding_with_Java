import java.util.Scanner;
public class ex3_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introdueix una frase: ");
        String frase = sc.nextLine();
        
        String[] paraules = frase.split(" ");
        String paraulaMesLlarga = "";

        for(int i = 0; i < paraules.length; i++){
            String paraulaActual = paraules[i];

            if(paraulaActual.length() > paraulaMesLlarga.length()){
                paraulaMesLlarga = paraulaActual;
            }
        }

        System.out.println("La paraula més gran és: " + paraulaMesLlarga);
        System.out.println("La longitud de la paraula és: " + paraulaMesLlarga.length());

        sc.close();
    }
}
