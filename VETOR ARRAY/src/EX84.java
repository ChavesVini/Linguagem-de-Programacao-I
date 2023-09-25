import java.util.ArrayList;
import java.util.Scanner;

//84) Faça um algoritmo para ler um valor N qualquer (que será o tamanho dos vetores). Após, ler dois
//vetores A e B (de tamanho N cada um) e depois armazenar em um terceiro vetor Soma a soma dos
//elementos do vetor A com os do vetor B (respeitando as mesmas posições) e escrever o vetor Soma.

public class EX84 {
    public static void main(String[] args) {
        ArrayList<Float> A = new ArrayList<Float>();
        ArrayList<Float> B = new ArrayList<Float>();
        ArrayList<Integer> Soma = new ArrayList<Integer>();
        Scanner inputNumeros = new Scanner(System.in);
        int N;

        System.out.println("Insira o tamanho dos vetores: ");
        N = inputNumeros.nextInt();

        for (int i=0; i<N; i++) {
            System.out.print("Escreva o número do vetor A: ");
            A.add(inputNumeros.nextFloat());
            System.out.print("Escreva o número do vetor B: ");
            B.add(inputNumeros.nextFloat());
        }

        for (int i=0; i<N; i++) {
            Soma.add(A.get(i).intValue() + B.get(i).intValue());
        }
    }
}