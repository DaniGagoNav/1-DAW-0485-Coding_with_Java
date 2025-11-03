import java.util.*;
public class ex4_26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] myArray = {1, 2, 3, 4, 5, 6};

        System.out.println("Original Array: ");
        for (int i = 0; i < myArray.length; i++){
            System.out.print(myArray[i] + " ");
        }
        System.out.println("\n");

        System.out.println("Inverted Array: ");
        for (int i = myArray.length -1; i >= 0; i--){
            System.out.print(myArray[i] + " ");
        }
        System.out.println(" ");

        sc.close();
    }
}
