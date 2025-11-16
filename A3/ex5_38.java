public class ex5_38{
public static void main (String[] args){
int[][] matriua = new int[2][2];
        int[][] matriub = new int[2][2];
        i = 0;
        while (i < 2) {
            int j = 0;
            while (j < 2) {
                System.out.print("Matriu A [" + i + "][" + j + "]: ");
                matriua[i][j] = sc.nextInt();
                j++;
            }
            i++;
        }
        i = 0;
        while (i < 2) {
            int j = 0;
            while (j < 2) {
                System.out.print("Matriu B [" + i + "][" + j + "]: ");
                matriub[i][j] = sc.nextInt();
                j++;
            }
            i++;
        }
        int[][] suma = new int[2][2];
        i = 0;
        while (i < 2) {
            int j = 0;
            while (j < 2) {
                suma[i][j] = matriua[i][j] + matriub[i][j];
                j++;
            }
            i++;
        }
        System.out.println("Matriu suma:");
        i = 0;
        while (i < 2) {
            int j = 0;
            while (j < 2) {
                System.out.print(suma[i][j] + " ");
                j++;
            }
            System.out.println();
            i++;
        }
}
}
