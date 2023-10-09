import java.util.Scanner;

public class EX81list {
    public static void main(String[] args) {
        int[] Q = new int[20];
        Scanner inputNumeros = new Scanner(System.in);
        int indice = 0;
        int menor = Integer.MAX_VALUE;

        for (int i=0; i<20; i++) {
            System.out.print("Escreva os números: ");
            Q[i] = inputNumeros.nextInt();
        }

        for (float numeros : Q) {
            if (numeros < menor) {
                menor = 0;
                menor += numeros;
            }
        }

        for (int i=0; i<20; i++) {
            if (Q[i] == menor) {
                indice += (Q[i]-1);
            }
        }
        System.out.println("O menor elemento é " + menor + ". No indice " + indice);
    }
}