import java.util.Scanner;
public class ex3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Inserta una nota: ");
		int nota = sc.nextInt();

		if(nota<5){
		System.out.println("Estas Suspes: " + nota);
		}else if(nota<7&&nota>=5){
		System.out.println("Estas Aprovat: " + nota);
		}else if (nota>=7&&nota<9){
		System.out.println("Tens un notable: " + nota);
		}else if (nota>=9&&nota<=10){
		System.out.println("Tens un excel·lent: " + nota);
		}else{
			System.out.println("Nota Invalida: " + nota);
		}
		
	}
}