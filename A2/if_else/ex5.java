import java.util.Scanner;
public class ex5{

	private static double descompteSoci = 0.90;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Té el client targeta  de soci (true/false): ");
		boolean soci = sc.nextBoolean();
		
		System.out.println("El preu és: ");
		double preu = sc.nextDouble();

		double preuFinal = preu * descompteSoci;

		if(soci == true){
			System.out.println("El preu final és: " + preuFinal);
		}else{
			System.out.println("El preu final és: " + preu);
		}
	}
}