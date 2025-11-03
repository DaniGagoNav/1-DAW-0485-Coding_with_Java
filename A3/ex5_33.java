int[][] matriu = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        int col = 0;
        while (col < 4) {
            int suma = 0;
            int fila = 0;
            while (fila < 4) {
                suma += matriu[fila][col];
                fila++;
            }
            System.out.println("Suma columna " + col + ": " + suma);
            col++;
        }
