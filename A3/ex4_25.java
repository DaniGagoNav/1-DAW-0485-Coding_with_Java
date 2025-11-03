import java.util.*;
public class ex4_25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = {"Gago", "Campru", "Ale", "Iker", "Oriol", "Arnau", "Xevi", "Marc"};
      
        System.out.println("Introduce a name for see if match with the list: ");
        String inputName = sc.nextLine();

        for (int i = 0; i < names.length; i++){
            if (names[i].equalsIgnoreCase(inputName)) {
                System.out.println("The names matches.");
            }
        }
        for (int i = 0; i < names.length; i++){
            System.out.println("The names are: " + names[i]);
        }

        sc.close();
    }
}