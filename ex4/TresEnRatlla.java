import java.util.Scanner;

public class TresEnRatlla {

	public static void main (String[] args) {		
		// 1. Declaració de variables i inicialització del tauler
        // 2. Bucle principal del joc
			// 3. Mostrar el tauler
			// 4. Demanar posició al jugador actual
			// 5. Validar moviment i actualitzar tauler
			// 6. Comprovar si hi ha guanyador o empat
			// 7. Canviar de jugador
        // 8. Mostrar resultat final

		// 1. Declaració de variables i inicialització del tauler
		boolean fi = false;
		boolean jugadaIlegal = true;
		Scanner sc = new Scanner (System.in);		
		int x = 0;
		int y = 0;
		int comptador = 1;
		char torn = 'X';
		// FI Declaració variables		 		 
		
		char[][] tauler = {
			{ ' ', ' ', ' ' },
			{ ' ', ' ', ' ' },
			{ ' ', ' ', ' ' }
			};
			
		 // 2. Bucle principal del joc	
		 while (!fi){		
			// Mostrar tauler de joc
			mostrarTauler.mostrarTauler(tauler);
			// Fer jugada
			ferJugada.ferJugada(comptador, torn);
			// Verificar jugada i realitzar jugada al tauler
			
			// Verificar resultat forma Kutre    
			verificar.verificar(torn, x, y, tauler, jugadaIlegal, comptador, fi);
			
		// FI bucle principal
		 }
			// Mostrar tauler de joc
			mostrarTauler2.mostrarTauler2(tauler);
	
	
				
	}
}

