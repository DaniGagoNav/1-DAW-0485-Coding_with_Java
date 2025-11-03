import java.util.*;
public class ex4_30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce a number for compare with the array: ");
        int num = sc.nextInt();
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int i = 0;
        int rI = -1;

        

        while (i < array.length) {
            if (array[i] == num) {
                rI = i;
                break;
            }
            i++;
        }

        if (rI != -1) {
            int[] newArray = new int[array.length - 1];
            int nI = 0;
            int j= 0;

            while (j < array.length) {
                if (j != rI) {
                    newArray[nI] = array[j];
                    nI++;
                }
                j++;
            }

            System.out.println("Found value " + num + " for delete." + "\n" +
            "New Array: " + Arrays.toString(newArray) + "\n");
        }else{
            System.out.println("Value " + num + " for delete not found.");
            System.out.println("Original Array: " + Arrays.toString(array) + "\n");
        }
        
        sc.close();
    }
}
