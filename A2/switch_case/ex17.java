import java.util.Scanner;
public class ex17 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Introdueix un caracter de la 'A' a la 'F' per asignar una nota: ");
    char caracter = sc.next().charAt(0);

    switch(caracter){
        case 'A':
            System.out.println("La teva nota es un EXCEL·LENT. " + caracter);
            break;
        case 'B':
            System.out.println("La teva nota es un NOTABLE. " + caracter);
            break;
        case 'C':
            System.out.println("La teva nota es un APROVAT. " + caracter);
            break;
        case 'D':
            System.out.println("La teva nota es un JUSTET. " + caracter);
            break;
        case 'F':
            System.out.println("La teva nota es un SUSPÈS. " + caracter);
            break;
        default:
            System.out.println("Nota Invalida." + caracter);
            break;
    }
}
}
