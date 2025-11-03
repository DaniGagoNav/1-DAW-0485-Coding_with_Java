import java.util.*;
public class ex4_27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] myArray = new int[5];

        int[] copyArray = new int[myArray.length];
        
        for (int i = 0; i < myArray.length; i++){
            System.out.println("Introduce a number for the array: ");
            myArray[i] = sc.nextInt();

            copyArray[i] = myArray[i];

            System.out.println("\n");
        }
        
        System.out.println("The original array is: ");
        for (int i = 0; i < myArray.length; i++){
        System.out.print(myArray[i] + " ");
        }

        System.out.println("\n");

        System.out.println("The copied array is: ");
        for (int i = 0; i < copyArray.length; i++){
        System.out.print(copyArray[i] + " ");
        }
        System.out.println("\n");

        sc.close();
    }
}