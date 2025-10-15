import java.util.Scanner;
public class ex1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Entra la teva edat: \n");
		int edat = sc.nextInt();

		if (edat < 18){
			 System.out.println("\nÉs menor de edat.");
		}else if(edat >= 18){
			System.out.println("\nÉs major de edat.");
		}
	}
}