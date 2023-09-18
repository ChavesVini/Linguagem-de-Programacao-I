import java.util.Scanner;
import java.util.ArrayList;

public class EX78 {
    public static void main(String[] args) {
        String nome;
        String[] nomes;
        String pesquisa;

        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite os nomes, separando com virgula: ");
        nomes = leitor.next().split(",");

        ArrayList<String> listaNomes = new ArrayList<>();

        for (int i=0; i<nomes.length; i++) {
            String outrosnomes = nomes[i];
            listaNomes.add(outrosnomes);
        }

        Scanner buscador = new Scanner(System.in);
        System.out.print("Digite algum nome: ");
        pesquisa = buscador.next();

        if (listaNomes.contains(pesquisa)) {  
            System.out.println("Achei!");
        }
        else {
            System.out.println("Não achei!");
             }
         }
    }