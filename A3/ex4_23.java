import java.util.*;

public class ex4_23 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        
        int[] randNum = new int[2];   

        System.out.println("Generated numbers: ");
        for(int i = 0; i < randNum.length; i++){
            randNum[i] = rand.nextInt(100) +1;
            System.out.print(randNum[i] + " ");
        }
        System.out.println("\n");

        int maxNum = randNum[0];
        int minNum = randNum[0];

        for (int i = 0; i < randNum.length; i++){
            if (randNum[i] > maxNum) {
                maxNum = randNum[i];                
            } else if (randNum[i] < minNum) {
                minNum = randNum[i];                
            }
        }

        System.out.println("El numero major generat és: " + maxNum);
        System.out.println("El numero menor generat és: " + minNum);

        sc.close();
    }
}