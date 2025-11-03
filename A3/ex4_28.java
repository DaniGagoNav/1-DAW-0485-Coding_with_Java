import java.util.*;
public class ex4_28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] marks = new double[8];
        
        for (int i = 0; i < marks.length; i++){
            System.out.println("Introduce 8 numbers for calculate the medium of the students: ");
            marks[i] = sc.nextDouble();

            System.out.println("\n");
        }

        double average = 0;
        double sum = 0;
        for (int i = 0; i < marks.length; i++){
            sum += marks[i];
            average = sum / marks[i];
        } 
        System.out.println("The average of the marks are: " + average);

        sc.close();
   }
}