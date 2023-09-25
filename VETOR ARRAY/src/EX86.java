// 86) Faça um algoritmo para ler 10 números e armazenar em um vetor. Após isto, o algoritmo deve
// ordenar os números no vetor em ordem crescente. Escrever o vetor ordenado.

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class EX86 {
    public static void main(String[] args) {
        ArrayList<Float> valores = new ArrayList<Float>();
        Scanner leitor = new Scanner(System.in);

        for (int i=0; i<10; i++) {
            System.out.println("Insira um número: ");
            valores.add(leitor.nextFloat());
        }

        Collections.sort(valores);
        System.out.println("O vetor ordenado é: " + valores);
    }
}
