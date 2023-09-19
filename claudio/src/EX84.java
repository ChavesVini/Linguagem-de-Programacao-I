import java.util.ArrayList;
import java.util.Scanner;

public class EX84 {
    public static void main(String[] args) {
        ArrayList<Float> A = new ArrayList<Float>();
        ArrayList<Float> M = new ArrayList<Float>();
        int N;
        Scanner inputNumeros = new Scanner(System.in);

        System.out.print("Digite mais um número: ");
        N = inputNumeros.nextInt();

        for (float i=0; i<10; i++) {
            System.out.print("Escreva os números: ");
            A.add(inputNumeros.nextFloat());
        }
        


        for (float x : A) {
            x *= X;
            M.add(x); 
        }

        System.out.println("O vetor: " + M);
    }
}