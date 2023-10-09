import java.util.Scanner;

public class EX79list {
    public static void main(String[] args) {
        float[] notas = new float[20];
        Scanner inputNota = new Scanner(System.in);
        float soma = 0;
        int alunosAprovados = 0;

        for (int i=0; i<20; i++) {
            System.out.print("Escreva as notas: ");
            notas[i] = inputNota.nextFloat();
        }

        for (float nota : notas) {
            soma += nota;
        }

        for (float nota : notas) {
            if (nota > (soma/20)) {
                alunosAprovados += 1;
            }      
        }
        
        System.out.println("A média dessa turma é: " + soma/20);
        System.out.println("A quantidade de alunos que tiraram acima da média é " + alunosAprovados);
    }
}