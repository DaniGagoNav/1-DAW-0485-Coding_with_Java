import java.util.Scanner;
public class ex13{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int dia;
	System.out.println("Introudeix un numero del 1 al 7 per saber quin dia de la setmana és: ");
	switch(dia = sc.nextInt()){
	case 1:
		if(dia == 1){
		System.out.println("Has seleccionat 1, que és DILLUNS.");
		break;
	};

	case 2:
		if(dia == 2){
		System.out.println("Has seleccionat 2, que és DIMARTS.");
		break;
	};

	case 3:
		if(dia == 3){
		System.out.println("Has seleccionat 3, que és DIMECRES.");
		break;
	};

	case 4:
		if(dia == 4){
		System.out.println("Has seleccionat 4, que és DIJOUS.");
		break;
	};

	case 5:
		if(dia == 5){
		System.out.println("Has seleccionat 5, que és DIVENDRES."); 
		break;
	};

	case 6:
		if(dia == 6){
		System.out.println("Has seleccionat 6, que és DISSABTE.");
		break;
	};

	case 7:
		if(dia == 7){
		System.out.println("Has seleccionat 7, que és DIUMENGE.");
		break;
	};
	}
	
	}
}