// 88) Faça um algoritmo para ler um vetor de 20 números. Após isto, deverá ser lido mais um número
// qualquer e verificar se esse número existe no vetor ou não. Se existir, o algoritmo deve gerar um novo
// vetor sem esse número. (Considere que não haverão números repetidos no vetor).

import java.util.ArrayList;
import java.util.Scanner;

public class EX88 {
    public static void main(String[] args) {
        ArrayList<Float> valores = new ArrayList<Float>();
        Scanner leitor = new Scanner(System.in);
        float numeroAdicional;

        for (int i=0; i<20; i++) {
            System.out.println("Insira um número: ");
            valores.add(leitor.nextFloat());
        }

        System.out.println("Insira mais um número: ");
        numeroAdicional = leitor.nextFloat();
        valores.add(numeroAdicional);

        for (float i=0; i<20; i++) {
            if (valores.contains(numeroAdicional)) {
                valores.remove(numeroAdicional);
            } else {
                continue;
            }
        }
        System.out.println("O vetor sem o número é: " + valores);
    }
}