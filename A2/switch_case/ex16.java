import java.util.Scanner;
public class ex16{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Introdueix el primer enter: ");
    int a = sc.nextInt();

    System.out.println("Introdueix el segon enter: ");
    int b = sc.nextInt();
    
    System.out.println("Inserta un operand: ");
    char operand = sc.next().charAt(0);
    int resultat;

    switch(operand){
        case '+':
            resultat = a + b;
            System.out.println("La suma de " + a + " més " + b + " és: " + resultat);
            break;
        case '-':
            resultat = a - b;
            System.out.println("La resta de " + a + " menys " + b + " és: " + resultat);
            break;
        case '/':
            resultat = a / b;
            System.out.println("La divisio de " + a + " entre " + b + " és: " + resultat);
            break;
        case '*':
            resultat = a * b;
            System.out.println("La multiplicacio de " + a + " per " + b + " és: " + resultat);
            break;
        default:
            System.out.println("Operació invalida.");
    }
    
}
}