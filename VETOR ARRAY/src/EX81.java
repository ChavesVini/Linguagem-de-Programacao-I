import java.util.ArrayList;
import java.util.Scanner;

public class EX81 {
    public static void main(String[] args) {
        ArrayList<Float> Q = new ArrayList<Float>();
        Scanner inputNumeros = new Scanner(System.in);
        int indice;
        float menor = Integer.MAX_VALUE;

        for (int i=0; i<20; i++) {
            System.out.print("Escreva os números: ");
            Q.add(inputNumeros.nextFloat());
        }

        for (float numeros : Q) {
            if (numeros <= menor) {
                menor = 0;
                menor += numeros;
            }
        }
        indice = Q.indexOf(menor);
        System.out.println("O menor elemento é " + menor + ". No indice " + indice);
    }
}