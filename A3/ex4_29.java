import java.util.*;
public class ex4_29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] myArray = {1, 2, 3, 4, 5};

        System.out.println("Original Array: ");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }
        System.out.println("\n");

        int temp = myArray[4];
        myArray[4] = myArray[0];
        myArray[0] = temp;

        System.out.println("Exchanged array: ");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }
        System.out.println("\n");

        sc.close();
    }
}
