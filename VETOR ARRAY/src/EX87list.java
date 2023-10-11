// 87) O mesmo exercício anterior, mas depois de ordenar os elementos do vetor em ordem crescente,
// deve ser lido mais um número qualquer e inserir esse novo número na posição correta, ou seja,
// mantendo a ordem crescente do vetor.

import java.util.Arrays;
import java.util.Scanner;

public class EX87list {
    public static void main(String[] args) {
        float[] valores = new float[11];
        Scanner leitor = new Scanner(System.in);

        for (int i=0; i<10; i++) {
            System.out.println("Insira um número: ");
            valores[i] = leitor.nextFloat();
        }

        Arrays.sort(valores);
        System.out.println("O vetor ordenado é: " + Arrays.toString(valores));

        for (int i=0; i<1; i++) {
            System.out.println("Insira mais um número: ");
            valores[i] = leitor.nextFloat();
        }
        
        Arrays.sort(valores);
        System.out.println("O vetor ordenado com 11 números é: " + Arrays.toString(valores));        
    }
}
