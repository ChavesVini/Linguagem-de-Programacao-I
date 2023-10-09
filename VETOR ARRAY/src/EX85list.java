// 85) Faça um algoritmo para ler e armazenar em um vetor a temperatura média de todos os dias do ano.
// Calcular e escrever:
// a) Menor temperatura do ano
// b) Maior temperatura do ano
// c) Temperatura média anual
// d) O número de dias no ano em que a temperatura foi inferior a média anual

import java.util.Scanner;

public class EX85list {
    public static void main(String[] args) {
        float[] temperatura = new float[10];
        Scanner leitor = new Scanner(System.in);
        float temperaturaMedia = 0;
        float dias = 0;
        int menor = Integer.MAX_VALUE;
        int maior = 0;

        for (int i=0; i<10; i++) {
            System.out.println("Insira uma temperatura: ");
            temperatura[i] = leitor.nextFloat();
        }

        for (float numeros : temperatura) {
            if (numeros < menor) {
                menor = 0;
                menor += numeros;
            }
        }

        for (float numeros : temperatura) {
            if (numeros > maior) {
                maior = 0;
                maior += numeros;
            }
        }

        System.out.println("Menor temperatura do ano foi: " + menor);
        System.out.println("Maior temperatura do ano foi: " + maior);
        
        for (int i=0; i<10; i++) {
            temperaturaMedia += temperatura[i];
        }

        System.out.println("Temperatura média foi: " + temperaturaMedia/10);

        for (float temperaturas : temperatura) {
            if ((temperaturaMedia/10) > temperaturas) {
                dias += 1;
            }
        }
        System.out.println("O número de dias no ano em que a temperatura foi inferior a média anual foi: " + dias);
    }
}