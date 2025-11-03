public class ex5_37{
public static void main (String[] args){
int[][] matriu = new int[2][3];
        i = 0;
        while (i < 2) {
            int j = 0;
            while (j < 3) {
                System.out.print("Introdueix element [" + i + "][" + j + "]: ");
                matriu[i][j] = sc.nextInt();
                j++;
            }
            i++;
        }
        int[][] transposa = new int[3][2];
        i = 0;
        while (i < 3) {
            int j = 0;
            while (j < 2) {
                transposa[i][j] = matriu[j][i];
                j++;
            }
            i++;
        }
        System.out.println("Matriu original:");
        i = 0;
        while (i < 2) {
            int j = 0;
            while (j < 3) {
                System.out.print(matriu[i][j] + " ");
                j++;
            }
            System.out.println();
            i++;
        }
        System.out.println("Matriu transposada:");
        i = 0;
        while (i < 3) {
            int j = 0;
            while (j < 2) {
                System.out.print(transposa[i][j] + " ");
                j++;
            }
            System.out.println();
            i++;
        }
}
}
