// Faça um algoritmo para ler um vetor de 30 números. Após isto, ler mais um número qualquer,
// calcular e escrever quantas vezes esse número aparece no vetor.

import java.util.ArrayList;
import java.util.Scanner;

public class EX90list {
    public static void main(String[] args) {
        float[] vetor = new float[30];
        Scanner leitor = new Scanner(System.in);
        int contador = 0;
        float proximoNumero;

        for (int i=0; i<30; i++) {
            System.out.println("Insira os números pro vetor: ");
            vetor[i] = leitor.nextFloat();
        }

        System.out.println("Insira mais um número: ");
        proximoNumero = leitor.nextFloat();

        for (int i=0; i<30; i++)  {
            if (vetor[i] == proximoNumero) {
                contador += 1;
            } else {
                continue;
            }
        }
        System.out.println("A quantidade de vezes que o numero " + proximoNumero + " aparece: " + contador);
    }
}