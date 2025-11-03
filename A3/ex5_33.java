import java.util.*;

public class ex5_33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int[][] array = new int[4][4];

        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = rand.nextInt(10);
                
                System.out.println(array[j][i] + " ");
            }
            System.out.println();
        }

        System.out.println("\n");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[j][i];
                
                System.out.print(array[j][i] + " ");
            }
            System.out.println();
            System.out.println("La suma de columna fila és: " + sum);
        }
        
        

        System.out.println("\n");

        sc.close();
    }
}
