import java.util.Scanner;
public class ex4{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Introdueix el numero 1: ");
		int a = sc.nextInt();

		System.out.println("Introueix el numero 2: ");
		int b = sc.nextInt();

		System.out.println("Introdueix el numero 3: ");
		int c = sc.nextInt();

		

		if(a>=b&&a>=c){
			System.out.println("El numero major és: " + a);
		}
		else if(b>=a&&b>=c){
			System.out.println("El numero major és: " + b);
		}
		else{
			System.out.println("El numero major és: " + c);
		} 
	}
}