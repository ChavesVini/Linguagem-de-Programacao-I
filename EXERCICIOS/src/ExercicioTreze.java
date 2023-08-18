import java.util.Scanner;

public class ExercicioTreze {
    public static void main(String args[]){
    
        double note1;
        double note2;
        double note3;
        double temperature;

        Scanner input = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        note1 = Double.parseDouble(input.nextLine());
        System.out.println("Digite a segunda nota: ");
        note2 = Double.parseDouble(input.nextLine());
        System.out.println("Digite a terceira nota: ");
        note3 = Double.parseDouble(input.nextLine());

        temperature = ((note1*2)+(note2*3)+(note3*5))/10;

        System.out.println("A média final desse aluno é " + temperature);
}
}