import java.util.Scanner;

public class EX80list {
    public static void main(String[] args) {
        int[] Q = new int[20];
        Scanner inputNumeros = new Scanner(System.in);
        int indice = 0;
        int maior = 0;

        for (int i=0; i<20; i++) {
            System.out.print("Escreva os números: ");
            Q[i] = inputNumeros.nextInt();
        }

        for (float numeros : Q) {
            if (numeros > maior) {
                maior = 0;
                maior += numeros;
            }
        }
        
        for (int i=0; i<20; i++) {
            if (Q[i] == maior) {
                indice += (Q[i]-1);
            }
        }
        System.out.println("O maior elemento é " + maior + ". No indice " + indice);
    }
}