import java.util.Arrays;
import java.util.Scanner;

public class EX78list {
    public static void main(String[] args) {
        String[] nomes = new String[10];
        Scanner buscar = new Scanner(System.in);

        for (int i=0; i<10; i++) {
            System.out.print("Escreva os nomes: ");
            nomes[i] = buscar.next();
        }

        System.out.print("Busque por um nome: ");

        if (Arrays.toString(nomes).contains(buscar.next())) {
            System.out.println("Achei!");
        }
        else {
            System.out.print("Não achei!");
        }
    }
}