// 91) Faça um algoritmo para ler 50 números e armazenar em um vetor VET, verificar e escrever se
// existem números repetidos no vetor VET e em que posições se encontram.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;

public class EX91list {
    public static void main(String[] args) {
        float[] VET = new float[5];
        ArrayList<Integer> index = new ArrayList<Integer>();
        Scanner leitor = new Scanner(System.in);

        for (float i=0; i<5; i++) {
            System.out.println("Insira os números pro vetor: ");
            leitor.nextFloat();
        }

        Arrays.sort(VET);
        System.out.println("O vetor até agora: " + VET);

        for (int i=0; i<5; i++)  {
            for (int j=i+1; j<5; j++) {
                Arrays.indexOf(VET, i);
            } 
        


        System.out.println("Aparece números repetidos, nos indices " + index);
    }
}
}