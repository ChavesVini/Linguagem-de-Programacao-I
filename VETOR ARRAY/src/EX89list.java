// 89) Faça um algoritmo para ler dois vetores V1 e V2 de 15 números cada. Calcular e escrever a
// quantidade de vezes que V1 e V2 possuem os mesmos números e nas mesmas posições.

import java.util.ArrayList;
import java.util.Scanner;

public class EX89list {
    public static void main(String[] args) {
        float[] V1 = new float[15];
        float[] V2 = new float[15];
        Scanner leitor = new Scanner(System.in);
        int contador = 0;

        for (int i=0; i<15; i++) {
            System.out.println("Insira os números pro vetor 1: ");
            leitor.nextFloat();
        }

        for (int i=0; i<15; i++) {
            System.out.println("Insira os números pro vetor 2: ");
            leitor.nextFloat();
        }

        for (int i=0; i<15; i++)  {
            if (V1[i] == V2[i]) {
                contador += 1;
            } else {
                continue;
            }
        }
        System.out.println("A quantidade de vezes que V1 e V2 possuem os mesmos números e nas mesmas posições é: " + contador);
    }
}