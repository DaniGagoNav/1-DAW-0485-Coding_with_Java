import java.util.Scanner;
public class ex8{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inserta una edat: ");
		int edat = sc.nextInt();

		if(edat<12){
			System.out.println("Ets un nen");
		}
		else if(edat>=12&&edat<18){
			System.out.println("Ets un adolescsent");
		}
		else if(edat>=18&&edat<65){
			System.out.println("Ets un adult");
		}
		else{
			System.out.println("Ets gent gran");
		}
	}
}