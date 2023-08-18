import java.util.Scanner;

public class ExercicioDez {
    public static void main(String args[]){
    
    double porcentagemdistribuidor;
    double impostos;
    double calculus;
    int custofabrica;

    Scanner input = new Scanner(System.in);
    System.out.println("Digite o valor do carro: ");
    custofabrica = Integer.parseInt(input.nextLine());

    impostos = custofabrica*0.45;
    porcentagemdistribuidor = custofabrica*0.28; 

    calculus = (porcentagemdistribuidor+custofabrica+impostos);
    System.out.println("O seu carro novo vai custar: R$ " + calculus);
}
}
