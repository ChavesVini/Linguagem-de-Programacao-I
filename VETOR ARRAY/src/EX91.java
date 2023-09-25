// 91) Faça um algoritmo para ler 50 números e armazenar em um vetor VET, verificar e escrever se
// existem números repetidos no vetor VET e em que posições se encontram.

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class EX91 {
    public static void main(String[] args) {
        ArrayList<Float> VET = new ArrayList<Float>();
        ArrayList<Integer> index = new ArrayList<Integer>();
        Scanner leitor = new Scanner(System.in);

        for (float i=0; i<5; i++) {
            System.out.println("Insira os números pro vetor 1: ");
            VET.add(leitor.nextFloat());
        }

        Collections.sort(VET);

        for (int i=0; i<5; i++)  {
            for (int j=i+1; j<5; j++)
                if (VET.get(i).equals(VET.get(j))) {
                    index.add(VET.indexOf(VET.get(i)));
                } else {
                    continue;
                }
            }
        System.out.println("Aparece números repetidos, nos indices " + index);
    }
}