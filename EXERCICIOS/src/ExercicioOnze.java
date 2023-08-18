import java.util.Scanner;

public class ExercicioOnze {
    public static void main(String args[]){
    
    int carrosvendidos;
    double totalvendas;
    double valorrecebido;
    double salariofixo;
    double calculus;

    Scanner input = new Scanner(System.in);
    System.out.println("Digite o número de carros vendidos: ");
    carrosvendidos = Integer.parseInt(input.nextLine());
    System.out.println("Digite o valor total das vendas: ");
    totalvendas = Double.parseDouble(input.nextLine());
    System.out.println("Digite o valor que recebe por cada carro vendido: ");
    valorrecebido = Double.parseDouble(input.nextLine());
    System.out.println("Digite o salário fixo: ");
    salariofixo = Double.parseDouble(input.nextLine());

    calculus = (salariofixo+valorrecebido+(totalvendas*0.05));

    System.out.println("O seu novo salário é de: " + calculus);
}
}
