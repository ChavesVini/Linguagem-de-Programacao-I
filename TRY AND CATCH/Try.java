import java.util.InputMismatchException;
import java.util.Scanner;

public class Try {
    public static void main(String[] args) {
        Float a;
        Float b;
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Insira um número para soma: ");
            a = scan.nextFloat();
            System.out.println("Insira outro número para soma: ");
            b = scan.nextFloat();
            System.out.println(a+b);
        } catch (InputMismatchException e) {
            System.out.println(e + ": Insira números!");
            
        }
    }
}