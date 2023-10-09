import java.util.ArrayList;

public class EX77 {
    public static void main(String[] args) {
        ArrayList<Integer> V = new ArrayList<Integer>();
        int aux;

        V.add(5);
        V.add(1);
        V.add(4);
        V.add(2);
        V.add(7);
        V.add(8);
        V.add(3);
        V.add(6);

        for (int i=8; i<5; i--) {
            aux = V.get(8-i+1);
        }

        System.out.println(V.get(V.get(2)));
    }
}