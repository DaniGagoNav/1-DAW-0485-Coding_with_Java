import java.util.Scanner;
public class ex15{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int mes;
	System.out.println("Introudeix un numero del 1 al 12 per saber quin mes de l' any és: ");
	switch(mes = sc.nextInt()){
	case 1:
		System.out.println("Has seleccionat 1, que és GENER.");
		break;

	case 2:
		System.out.println("Has seleccionat 2, que és FEBRER.");
		break;

	case 3:
		System.out.println("Has seleccionat 3, que és MARÇ.");
		break;

	case 4:
		System.out.println("Has seleccionat 4, que és ABRIL.");
		break;

	case 5:
		System.out.println("Has seleccionat 5, que és MAIG.");
		break;

	case 6:
		System.out.println("Has seleccionat 6, que és JUNY.");
		break;

	case 7:
		System.out.println("Has seleccionat 7, que és JULIOL.");
		break;

	case 8:
		System.out.println("Has seleccionat 8, que és AGOST.");
		break;

	case 9:
		System.out.println("Has seleccionat 9, que és SEPTEMBRE.");
		break;

	case 10:
		System.out.println("Has seleccionat 10, que és OCTUBRE.");
		break;

	case 11:
		System.out.println("Has seleccionat 11, que és NOVEMBRE.");
		break;

	case 12:
		System.out.println("Has seleccionat 12, que és DESEMBRE.");
		break;
	default:
		System.out.println("Mes invalid: " + mes);
		break;
	}
	
	}
}