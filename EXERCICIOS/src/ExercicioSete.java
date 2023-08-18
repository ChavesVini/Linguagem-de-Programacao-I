import java.util.Scanner;

public class ExercicioSete {
    public static void main(String args[]) {
    
    int dia;
    int mes;
    int ano;
    int idadeanos;
    int idadedias;
    int idademeses;

    Scanner input = new Scanner(System.in);
    System.out.println("Digite o dia: ");
    dia = Integer.parseInt(input.nextLine());
    System.out.println("Digite o mês: ");
    mes = Integer.parseInt(input.nextLine());
    System.out.println("Digite o ano: ");
    ano = Integer.parseInt(input.nextLine());

    idadeanos = 2023 - ano;
    idademeses = idadeanos*12;
    idadedias = idademeses*30;

    System.out.println("A idade em dias é " + idadedias);
}
}
