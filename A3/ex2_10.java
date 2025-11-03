import java.util.Scanner;
public class ex2_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introdueix una paraula amb 'a' o 'A' per canviar-ho amb '@': ");
        String cadena = sc.nextLine();

        System.out.println("La cadena és: " + cadena);
        
        cadena = cadena.replace('a', '@');
        cadena = cadena.replace('A', '@');

        System.out.println("La cadena substituida queda així: " + cadena);

        sc.close();
    }

}
