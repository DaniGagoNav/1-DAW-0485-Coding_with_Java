import java.util.Scanner;
public class ex11{
	private static final double DESCOMPTE_10 = 0.10;
	private static final double DESCOMPTE_20 = 0.20;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Afegeix el import total de la compra: ");
		double preu = sc.nextDouble();
		double resultat;

		if(preu > 100){
			resultat = preu - (DESCOMPTE_10 * preu);
			System.out.println("El preu final amb descompte és: " + resultat);
		}
		else if(preu > 200){
			resultat = preu - (DESCOMPTE_20 * preu);
			System.out.println("El preu final amb descompte és: " + resultat);
		}else{
			System.out.println("El preu final sense descompte és: "+ preu);
		}
	}
}