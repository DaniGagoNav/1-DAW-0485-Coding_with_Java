import java.util.Scanner;

public class ex33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suma = 0;
        
        System.out.println("Introdueix números. El programa acabarà quan la suma superi 100.");
        while (suma <= 100) {
            System.out.print("Número: ");
            suma += sc.nextInt();
        }
        System.out.println("La suma acumulada és " + suma + " i ha superat 100.");
        sc.close();
    }
}
