// 85) Faça um algoritmo para ler e armazenar em um vetor a temperatura média de todos os dias do ano.
// Calcular e escrever:
// a) Menor temperatura do ano
// b) Maior temperatura do ano
// c) Temperatura média anual
// d) O número de dias no ano em que a temperatura foi inferior a média anual

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class EX85 {
    public static void main(String[] args) {
        ArrayList<Float> temperatura = new ArrayList<Float>();
        Scanner leitor = new Scanner(System.in);
        float temperaturaMedia = 0;
        float dias = 0;

        for (int i=0; i<365; i++) {
            System.out.println("Insira uma temperatura: ");
            temperatura.add(leitor.nextFloat());
        }

        System.out.println("Menor temperatura do ano foi: " + Collections.min(temperatura));
        System.out.println("Maior temperatura do ano foi: " + Collections.max(temperatura));
        
        for (int i=0; i<365; i++) {
            temperaturaMedia += temperatura.get(i).intValue();
        }

        System.out.println("Temperatura média foi: " + temperaturaMedia/365);

        for (float temperaturas : temperatura) {
            if ((temperaturaMedia/365) > temperaturas) {
                dias += 1;
            }
        }
        System.out.println("O número de dias no ano em que a temperatura foi inferior a média anual foi: " + dias);
    }
}