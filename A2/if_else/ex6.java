import java.util.Scanner;
public class ex6{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Inserta un nombre per saber si és positiu , negatiu o zero.");
		int a = sc.nextInt();

		if(a>0){
			System.out.println("És un nombre Positiu.");
		}else if(a<0){
			System.out.println("És un nombre Negatiu.");
		}else{
			System.out.println("És 0.");
		}
		
	}
}