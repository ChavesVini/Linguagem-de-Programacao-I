import java.util.ArrayList;
import java.util.Scanner;

public class EX80 {
    public static void main(String[] args) {
        ArrayList<Float> Q = new ArrayList<Float>();
        Scanner inputNumeros = new Scanner(System.in);
        int indice;
        float maior = 0;

        for (int i=0; i<20; i++) {
            System.out.print("Escreva os números: ");
            Q.add(inputNumeros.nextFloat());
        }

        for (float numeros : Q) {
            if (numeros > maior) {
                maior = 0;
                maior += numeros;
            }
        }
        indice = Q.indexOf(maior);
        System.out.println("O maior elemento é " + maior + ". No indice " + indice);
    }
}