import java.util.Scanner;

public class ExercicioCinco {
    public static void main(String args[]){
    
    Scanner input = new Scanner(System.in);
    
    int number;   
    int predecessor;
    
    System.out.print("Insira um número inteiro: ");
    number = input.nextInt();
    
    predecessor = number-1; 

    System.out.println("O antecessor de "+number+ " é " + predecessor);
}
}
