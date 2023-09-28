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

        V.get(3) = V.get(1);
        V.get(V.get(3)) = V.get(V.get(2));

    //     int V[] = {5,1,4,2,7,8,3,6};

    //      for (int i=8; i<5; i--) {
    //         aux = V[i];
    //         V[i] = V[8-i+1];
    //         V[8-i+1] = aux;
    //    }

    //    V[3] = V[1];
    //    V[V[3]] = V[V[2]];
    //    System.out.println(V[V[2]]);
       
    // 7

    }
}

