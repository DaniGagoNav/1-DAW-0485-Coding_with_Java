import java.util.Scanner;

public class ex49{

    // Función que contiene la lógica del cronómetro.
    public static void mostrarCronometro(Scanner scanner) {
        int segons = 0;
        String aturar;

        System.out.println("Cronòmetre en marxa. Escriu 'S' per aturar.");
        
        do {
            System.out.println("Segons transcorreguts: " + segons);
            segons++;

            // Esperamos 1 segundo
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // Se ignora la interrupción para este ejemplo simple
            }
            
            // Verificamos si el usuario ha introducido algo
            if (scanner.hasNextLine()) {
                aturar = scanner.nextLine().trim();
                if (aturar.equalsIgnoreCase("S")) {
                    break;
                }
            }

        } while (true);

        System.out.println("Cronòmetre aturat. Total de segons: " + (segons - 1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        mostrarCronometro(sc);
        sc.close();
    }
}
