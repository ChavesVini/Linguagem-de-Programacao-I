import java.util.ArrayList;
import java.util.Scanner;

public class EX82 {
    public static void main(String[] args) {
        ArrayList<Float> A = new ArrayList<Float>();
        ArrayList<Float> M = new ArrayList<Float>();
        float X;
        Scanner inputNumeros = new Scanner(System.in);

        for (float i=0; i<10; i++) {
            System.out.print("Escreva os números: ");
            A.add(inputNumeros.nextFloat());
        }
        
        System.out.print("Digite mais um número: ");
        X = inputNumeros.nextFloat();

        for (float x : A) {
            x *= X;
            M.add(x); 
        }

        System.out.println("O vetor: " + M);
    }
}