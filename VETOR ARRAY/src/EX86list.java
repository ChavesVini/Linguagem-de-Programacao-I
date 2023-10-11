// 86) Faça um algoritmo para ler 10 números e armazenar em um vetor. Após isto, o algoritmo deve
// ordenar os números no vetor em ordem crescente. Escrever o vetor ordenado.

import java.util.Arrays;
import java.util.Scanner;

public class EX86list {
    public static void main(String[] args) {
        float[] valores = new float[10];
        Scanner leitor = new Scanner(System.in);

        for (int i=0; i<10; i++) {
            System.out.println("Insira um número: ");
            valores[i] = leitor.nextFloat();
        }

        Arrays.sort(valores);
        System.out.println("O vetor ordenado é: " + Arrays.toString(valores));
    }
}
