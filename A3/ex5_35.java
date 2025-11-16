public class ex5_35{
public static void main (String[] args){
int[][] matriu = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        int i = 0;
        while (i < 4) {
            System.out.println("Diagonal[" + i + "][" + i + "] = " + matriu[i][i]);
            i++;
        }
}
}
