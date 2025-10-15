import java.util.Scanner;
public class ex10{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Introdueix una contrasenya: ");
		String contrasenya = sc.next();

		if(contrasenya.equalsIgnoreCase("Java2025")){
			System.out.println("Accés permès");
		}else{
			System.out.println("Accés denegat");
		}
	}
}