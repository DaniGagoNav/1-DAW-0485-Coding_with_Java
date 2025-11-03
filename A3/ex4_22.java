import java.util.Scanner;
public class ex4_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] myArray = new int[5];

        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Introduce an Integer: ");
            myArray[i] = sc.nextInt();    
        }
        
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] *= 5;         
        }
        for (int i = 0; i < myArray.length; i++) {
            System.out.println("The sum is: " + myArray[i]);   
        }


        sc.close();
    }
}
