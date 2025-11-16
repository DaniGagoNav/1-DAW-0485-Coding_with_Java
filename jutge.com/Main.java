import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        if (x >= y) {
            for (int i = x; i >= y; i--) {
                System.out.println(i);
            }
        }else if (y >= x){
            for (int i = y; i >= x; i--) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}
