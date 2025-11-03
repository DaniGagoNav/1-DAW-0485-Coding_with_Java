import java.util.Scanner;
public class ex4_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Array original");


        for (int i = 0; i < myArray.length; i++) {
            myArray[i] *= 2;           
        }

        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Array amb index * 2" + myArray[i]);            
        }

        sc.close();
    }
}
