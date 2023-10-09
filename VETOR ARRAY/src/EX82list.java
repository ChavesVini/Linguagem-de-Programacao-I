import java.util.Arrays;
import java.util.Scanner;

public class EX82list {
    public static void main(String[] args) {
        float[] A = new float[10];
        float[] M = new float[10];
        float X;
        Scanner inputNumeros = new Scanner(System.in);

        for (int i=0; i<10; i++) {
            System.out.print("Escreva os números: ");
            A[i] = inputNumeros.nextFloat();
        }
        
        System.out.print("Digite mais um número: ");
        X = inputNumeros.nextFloat();

        for (int i=0; i<10; i++) {
            M[i] = A[i]*X;
        }

        System.out.println("O vetor: " + Arrays.toString(M));
    }
}