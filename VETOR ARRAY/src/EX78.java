import java.util.ArrayList;
import java.util.Scanner;

public class EX78 {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<String>();
        Scanner buscar = new Scanner(System.in);

        for (int i=0; i<10; i++) {
            System.out.print("Escreva os nomes: ");
            nomes.add(buscar.next());
        }

        System.out.print("Busque por um nome: ");

        if (nomes.contains(buscar.next())) {
            System.out.print("Achei!");
        }
        else {
            System.out.print("Não achei!");
        }
    }
}