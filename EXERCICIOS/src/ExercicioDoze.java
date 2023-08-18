import java.util.Scanner;

public class ExercicioDoze {
    public static void main(String args[]){
    
        double fahrenheit;
        double temperature;

        Scanner input = new Scanner(System.in);
        System.out.println("Digite a temperatura em Fahrenheit: ");
        fahrenheit = Double.parseDouble(input.nextLine());

        temperature = (fahrenheit-32)*5/9;

        System.out.println("A temperatura em Celsius é " + temperature);
}
}