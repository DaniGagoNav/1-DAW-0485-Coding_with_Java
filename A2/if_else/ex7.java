import java.util.Scanner;
public class ex7{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inserta en un any per saber si es traspas o no.");
		int any = sc.nextInt();

		if((any%4==0&&any%100!=0)||(any%400==0)){
			System.out.println("El numero " + any + " és de traspas.");
		}else{
			System.out.println("El numero " + any + " no és de traspas");
		}
		
		
	}
}