import java.util.Scanner;

public class ExercicioNove {
    public static void main(String args[]){
    
    double salary;
    double percent;
    double newsalary;

    Scanner input = new Scanner(System.in);
    System.out.println("Digite o salário base: ");
    salary = Double.parseDouble(input.nextLine());
    System.out.println("Digite o percentual: ");
    percent = Double.parseDouble(input.nextLine());

    newsalary = salary*percent;

    System.out.println("O seu novo salário é de: " + newsalary);
}
}
