int[][] matriu = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        System.out.print("Introdueix un número per cercar: ");
        int num = sc.nextInt();
        trobat = false;
        int fila = 0;
        while (fila < 3) {
            int columna = 0;
            while (columna < 3) {
                if (matriu[fila][columna] == num) {
                    System.out.println("Element " + num + " trobat a fila " + fila + ", columna " + columna);
                    trobat = true;
                }
                columna++;
            }
            fila++;
        }
        if (!trobat) System.out.println(num + " no trobat.");
