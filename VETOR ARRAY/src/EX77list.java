public class EX77list {
    public static void main(String[] args) {
        int aux;
        int V[] = {5,1,4,2,7,8,3,6};

        for (int i=8; i<5; i--) {
            aux = V[i];
            V[i] = V[8-i+1];
            V[8-i+1] = aux;
        }

        V[3] = V[1];
        V[V[3]] = V[V[2]];
        System.out.println(V[V[2]]);
         
        //irá sair "7"
    }
}
