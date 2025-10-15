import java.util.Scanner;
public class ex14{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    
    int menu;
    System.out.println("Inserta una opció: ");
    switch(menu = sc.nextInt()){
        case 1:
            System.out.println("Has obert la calculadora.");
            break;
        case 2:
            System.out.println("Has obert la agenda.");
            break;
        case 3:
            System.out.println("Has sortit.");
            break;
        default:
            System.out.println("Opció invalida.");
    }
    
}
}