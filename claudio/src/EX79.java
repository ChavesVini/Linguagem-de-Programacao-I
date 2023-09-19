import java.util.ArrayList;
import java.util.Scanner;

public class EX79 {
    private ArrayList<Float> notas;
    private float inputNota; 
    private float calculo;

    public static void main(String[] args) {
        ArrayList<Float> notas = new ArrayList<Float>();
        Scanner inputNota = new Scanner(System.in);
        float soma = 0;
        int alunosAprovados = 0;

        for (int i=0; i<20; i++) {
            System.out.print("Escreva as notas: ");
            notas.add(inputNota.nextFloat());
        }

        for (float nota : notas) {
            soma += nota;
        }

        for (float nota : notas) {
            if (nota >= (soma/20)) {
                alunosAprovados += 1;
            }      
        }
        System.out.println("A média dessa turma é: " + soma/20);
        System.out.println("A quantidade de alunos que tiraram acima da média é " + alunosAprovados);
    }
}