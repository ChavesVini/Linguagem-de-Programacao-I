import java.util.Scanner;

public class ExercicioSeis {
    public static void main(String args[]){
    
    double width;
    double height;
    double calculus;

    Scanner input = new Scanner(System.in);
    System.out.println("Digite a base: ");
    width = Double.parseDouble(input.nextLine());
    System.out.println("Digite a altura: ");
    height = Double.parseDouble(input.nextLine());

    calculus = width*height;

    System.out.println(calculus);
}
}
