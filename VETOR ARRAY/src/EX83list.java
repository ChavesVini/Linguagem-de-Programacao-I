import java.util.Arrays;
import java.util.Scanner;

public class EX83list {
    public static void main(String[] args) {
        float[] listaNumeros = new float[10];
        float[] vetorInvertido = new float[10];
        Scanner inputNumeros = new Scanner(System.in);

        for (int i=0; i<10; i++) {
            System.out.print("Escreva os números: ");
            listaNumeros[i] = inputNumeros.nextFloat();
            vetorInvertido[10-1-i] = listaNumeros[i];
        }

        System.out.println("Vetor invertido " + Arrays.toString(vetorInvertido));
    }
}