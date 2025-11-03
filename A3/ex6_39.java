public class ex6_39{
public static void main (String[] args){
int[][][] cub = new int[2][2][2];
        i = 0;
        while (i < 2) {
            int j = 0;
            while (j < 2) {
                int k = 0;
                while (k < 2) {
                    cub[i][j][k] = i + j + k;
                    System.out.println("cub[" + i + "][" + j + "][" + k + "] = " + cub[i][j][k]);
                    k++;
                }
                j++;
            }
            i++;
        }
}
}
