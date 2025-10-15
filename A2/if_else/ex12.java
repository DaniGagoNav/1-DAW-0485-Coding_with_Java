import java.util.Scanner;
public class ex12{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	System.out.println("Introdueix un valor enter: ");
	int valor = sc.nextInt();

	if(valor >= 10 && valor <= 50){
	System.out.println("El valor esta dins de l'interval desitjat: " + valor);
	}
	else{
	System.out.println("El valor esta fora de l'interval desitjat: " + valor);
	}
	}
}