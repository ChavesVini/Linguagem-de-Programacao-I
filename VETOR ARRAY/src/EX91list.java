// 91) Faça um algoritmo para ler 50 números e armazenar em um vetor VET, verificar e escrever se
// existem números repetidos no vetor VET e em que posições se encontram.

import java.util.Arrays;
import java.util.Scanner;

public class EX91list {
    public static void main(String[] args) {
        int[] VET = new int[5];
        float[] index = new float[5];
        Scanner leitor = new Scanner(System.in);
        int position = 0;

        for (int i=0; i<5; i++) {
            System.out.println("Insira os números pro vetor: ");
            VET[i] = leitor.nextInt();
        }

        Arrays.sort(VET);
        System.out.println("O vetor até agora: " + Arrays.toString(VET));

        for (int i=0; i<5; i++) {
            for (int j=i+1; j<5; j++) {
                if (VET[i] == VET[j]) {
                    index[i] = position;
                    index[j] = position+1;
                } else {
                    index[j] = -1;
                }
            }
            position += 1; 
        }
        System.out.println("Aparece números repetidos, nos indices " + Arrays.toString(index));
    }
}