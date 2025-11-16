public class ex5_36{
public static void main (String[] args){
int[][] matriu = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int[] temp = matriu[0];
        matriu[0] = matriu[2];
        matriu[2] = temp;
        System.out.println("Matriu després de l'intercanvi de files:");
        fila = 0;
        while (fila < 3) {
            int columna = 0;
            while (columna < 3) {
                System.out.print(matriu[fila][columna] + " ");
                columna++;
            }
            System.out.println();
            fila++;
        }
}
}
