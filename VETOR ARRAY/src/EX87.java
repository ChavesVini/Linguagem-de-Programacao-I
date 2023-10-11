// 87) O mesmo exercício anterior, mas depois de ordenar os elementos do vetor em ordem crescente,
// deve ser lido mais um número qualquer e inserir esse novo número na posição correta, ou seja,
// mantendo a ordem crescente do vetor.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class EX87 {
    public static void main(String[] args) {
        ArrayList<Float> valores = new ArrayList<Float>();
        Scanner leitor = new Scanner(System.in);

        for (int i=0; i<10; i++) {
            System.out.println("Insira um número: ");
            valores.add(leitor.nextFloat());
        }

        Collections.sort(valores);
        System.out.println("O vetor ordenado é: " + valores);

        System.out.println("Insira mais um número: ");
        valores.add(leitor.nextFloat());
        
        Collections.sort(valores);
        System.out.println("O vetor ordenado com 11 números é: " + valores);        
    }
}
