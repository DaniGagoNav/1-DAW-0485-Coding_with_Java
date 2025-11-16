import java.util.*;
public class verificar{
    static Scanner sc = new Scanner(System.in);
    public static void verificar(char torn, int x, int y, char tauler[][], boolean jugadaIlegal, int comptador, boolean fi) {
		// Verificar jugada i realitzar jugada al tauler
			do{
				System.out.println("Jugador "+torn+" , entra fila i columna separades per espai: ");	
				y = sc.nextInt();
				x = sc.nextInt();			
			
			if (tauler[y][x]==' ') {
				System.out.println("jugada correcta!");
				tauler[y][x] = torn;
				jugadaIlegal = false;
				comptador++;			
			}else{
				System.out.println("jugada incorrecta");
				jugadaIlegal = true;				
			}			
			
			System.out.println("valor comptador:" + comptador);	
			
			// Verificar resultat forma Kutre    
			if ((tauler[0][0]==torn && tauler[0][1]==torn && tauler[0][2]==torn) || 
				(tauler[1][0]==torn && tauler[1][1]==torn && tauler[1][2]==torn) ||
				(tauler[2][0]==torn && tauler[2][1]==torn && tauler[2][2]==torn) ||
				
				(tauler[0][0]==torn && tauler[1][0]==torn && tauler[2][0]==torn) ||  
				(tauler[0][1]==torn && tauler[1][1]==torn && tauler[2][1]==torn) || 
				(tauler[0][2]==torn && tauler[1][2]==torn && tauler[2][2]==torn) ||  
				
				(tauler[0][0]==torn && tauler[1][1]==torn && tauler[2][2]==torn) || 
				(tauler[2][0]==torn && tauler[1][1]==torn && tauler[0][2]==torn)) 
			
				
			{	
				System.out.println("3 en ratlla !!!!!");	
				System.out.println("Ha guanyat el jugador " + torn + " en " + (comptador/2) +  " jugades");	 
				fi = true;
			}else if(comptador == 10){
				System.out.println("Heu empatat!");	
				fi = true;
			}				
		}
		while(jugadaIlegal);						
			
			//System.out.println(x + " " + y);
	
	}
}