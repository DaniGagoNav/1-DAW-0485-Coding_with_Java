public class mostrarTauler {
    public static void mostrarTauler(char[][] tauler) {
        System.out.println("  0   1   2");	
			for (int i=0;i<=2;i++){
				if(i == 0){
						System.out.print("0 ");
					}else  if(i == 1){
						System.out.print("1 ");
					}else{
						System.out.print("2 ");
					}
				for (int j=0;j<=2;j++){
					
					if(j != 2){
						System.out.print( tauler[i][j] + " | ");	
					}else{	
						System.out.print( tauler[i][j]);	
					}
				}
				System.out.print("\n");
				if(i != 2){
					System.out.println(" ---+---+---");
				}
			}		
			
			System.out.println();
			
    }
}
