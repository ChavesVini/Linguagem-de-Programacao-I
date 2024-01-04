import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String phrase;
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Digite uma frase para reverte-lá: ");
            phrase = scan.next();
            ReversedPhrase(phrase);
        } catch {

        }
    }
}
