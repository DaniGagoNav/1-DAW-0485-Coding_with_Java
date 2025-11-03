import java.util.*;
public class ex4_24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] myArray = new int[10];
        int counterEven = 0;
        int counterOdd = 0;

        for (int i = 0; i < myArray.length; i++){
            System.out.println("Introduce integers for complete the array: ");
            myArray[i] = sc.nextInt();
            System.out.println(" ");
        }

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] % 2 == 0) {
                counterEven++;    
            }
            else if (myArray[i] % 2 == 1) {
                counterOdd++;                
            }
        }

        System.out.println("There's " + counterEven + " even numbers.");            
        System.out.println("There's " + counterOdd + " odd numbers.");  

        sc.close();
    }
}