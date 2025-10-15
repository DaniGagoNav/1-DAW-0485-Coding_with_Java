public class ex34 {
    public static void main(String[] args) {
        System.out.println("Nombres primers entre 1 i 100:");
        for (int i = 2; i <= 100; i++) {
            boolean esPrimer = true;
            int j = 2;
            while (j < i) {
                if (i % j == 0) {
                    esPrimer = false;
                    break;
                }
                j++;
            }
            if (esPrimer) {
                System.out.println(i);
            }
        }
    }
}
