import java.util.Scanner;
public class ex2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Entra un numero enter: \n");
		int numero = sc.nextInt();

		if (numero%2 == 0){
			System.out.println("\nEl numero es parell: " + numero);
		}else{
			System.out.println("\nEl numero es imparell: " + numero);
		}
	}
}