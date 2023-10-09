import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import javax.lang.model.type.ArrayType;

//84) Faça um algoritmo para ler um valor N qualquer (que será o tamanho dos vetores). Após, ler dois
//vetores A e B (de tamanho N cada um) e depois armazenar em um terceiro vetor Soma a soma dos
//elementos do vetor A com os do vetor B (respeitando as mesmas posições) e escrever o vetor Soma.

public class EX84list {
    public static void main(String[] args) {
        int N;
        Scanner inputNumeros = new Scanner(System.in);

        System.out.print("Insira o tamanho dos vetores: ");
        N = inputNumeros.nextInt();

        float[] A = new float[N];
        float[] B = new float[N];
        float[] Soma = new float[N];

        for (int i=0; i<N; i++) {
            System.out.print("Escreva o número do vetor A: ");
            A[i] = inputNumeros.nextFloat();
            System.out.print("Escreva o número do vetor B: ");
            B[i] = inputNumeros.nextFloat();
        }

        for (int i=0; i<N; i++) {
            Soma[i] = A[i] + B[i];
        }
        System.out.println(Arrays.toString(Soma));
    }
}