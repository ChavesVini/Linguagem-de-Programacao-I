// 89) Faça um algoritmo para ler dois vetores V1 e V2 de 15 números cada. Calcular e escrever a
// quantidade de vezes que V1 e V2 possuem os mesmos números e nas mesmas posições.

import java.util.ArrayList;
import java.util.Scanner;

public class EX89 {
    public static void main(String[] args) {
        ArrayList<Float> V1 = new ArrayList<Float>();
        ArrayList<Float> V2 = new ArrayList<Float>();
        Scanner leitor = new Scanner(System.in);
        int contador = 0;

        for (int i=0; i<15; i++) {
            System.out.println("Insira os números pro vetor 1: ");
            V1.add(leitor.nextFloat());
        }

        for (int i=0; i<15; i++) {
            System.out.println("Insira os números pro vetor 2: ");
            V2.add(leitor.nextFloat());
        }

        for (int i=0; i<15; i++)  {
            if ((V1.get(i).intValue()) == (V2.get(i).intValue())) {
                contador += 1;
            } else {
                continue;
            }
        }
        System.out.println("A quantidade de vezes que V1 e V2 possuem os mesmos números e nas mesmas posições é: " + contador);
    }
}