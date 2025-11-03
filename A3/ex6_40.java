String[][][] cub = {
            {{"Paris","Roma","Londres"},{"Berlin","Madrid","Lisboa"}},
            {{"Nova York","Los Angeles","Chicago"},{"Tokio","Beijing","Seül"}}
        };
        System.out.print("Introdueix el nom de la ciutat a cercar: ");
        sc.nextLine(); // neteja buffer
        String nom = sc.nextLine();
        trobat = false;
        i = 0;
        while (i < 2) {
            int j = 0;
            while (j < 2) {
                int k = 0;
                while (k < 3) {
                    if (cub[i][j][k].equalsIgnoreCase(nom)) {
                        System.out.println("Ciutat trobada a [" + i + "][" + j + "][" + k + "]");
                        trobat = true;
                    }
                    k++;
                }
                j++;
            }
            i++;
        }
        if (!trobat) System.out.println("Ciutat no trobada.");
    }
}
