import java.util.Scanner;
public class ex9{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Selecciona una operació: Suma, Resta, Multiplicacio, Divisio");
		String operacio = sc.next();

		System.out.println("Entra el primer operand: ");
		int a = sc.nextInt();

		System.out.println("Entra el segon operand: ");
		int b = sc.nextInt();

		int resultat = 0;

		if(operacio.equalsIgnoreCase("Suma")){
			resultat = a + b;
		}
		else if(operacio.equalsIgnoreCase("Resta")){
			resultat = a - b;
		}
		else if(operacio.equalsIgnoreCase("Multiplicacio")){
			resultat = a * b;
		}
		else if(operacio.equalsIgnoreCase("Divisio")){
			resultat = a / b;
		} else {
			System.out.println("Operació no valida.");
		}

		System.out.println("El resultat de la " + operacio + " és: " + resultat);
	}
}