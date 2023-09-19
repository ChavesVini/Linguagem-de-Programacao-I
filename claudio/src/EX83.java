import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class EX83 {
    public static void main(String[] args) {
        ArrayList<Float> listaNumeros = new ArrayList<Float>();
        Scanner inputNumeros = new Scanner(System.in);

        for (float i=0; i<10; i++) {
            System.out.print("Escreva os números: ");
            listaNumeros.add(inputNumeros.nextFloat());
        }

        Collections.reverse(listaNumeros);
        System.out.println("Vetor invertido " + listaNumeros);
    }
}