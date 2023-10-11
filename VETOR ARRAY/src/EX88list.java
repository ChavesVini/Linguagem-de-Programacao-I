// 88) Faça um algoritmo para ler um vetor de 20 números. Após isto, deverá ser lido mais um número
// qualquer e verificar se esse número existe no vetor ou não. Se existir, o algoritmo deve gerar um novo
// vetor sem esse número. (Considere que não haverão números repetidos no vetor).

import java.util.Arrays;
import java.util.Scanner;

public class EX88list {
    public static void main(String[] args) {
        String[] valores = new String[21];
        Scanner leitor = new Scanner(System.in);
        String numeroAdicional = null;

        for (int i=0; i<20; i++) {
            System.out.println("Insira um número: ");
            valores[i] = leitor.next();
        }

        for (int i=0; i<1; i++) {
            System.out.println("Insira mais um número: ");
            numeroAdicional = leitor.next();
        }

        for (int i=0; i<21; i++) {
            if (Arrays.toString(valores).contains(numeroAdicional)) {
                valores[i] = null;
            }
        }
        System.out.println("O vetor sem o número é: " + Arrays.toString(valores));
    }
        
}