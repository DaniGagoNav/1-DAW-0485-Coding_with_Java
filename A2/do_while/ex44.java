import java.util.Scanner;

public class ex44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String contrasenyaPreestablerta = "pass123";
        String contrasenya;
        
        do {
            System.out.println("Introdueix la contrasenya: ");
            contrasenya = sc.nextLine();
            if (!contrasenya.equals(contrasenyaPreestablerta)) {
                System.out.println("Contrasenya incorrecta. Torna a intentar.");
            }
        } while (!contrasenya.equals(contrasenyaPreestablerta));
        
        System.out.println("Contrasenya correcta. Accés concedit.");
        sc.close();
    }
}

