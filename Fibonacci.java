public class Fibonacci {
     public static void main(String[] args) {
        int sequencia[] = new int[20];
        sequencia[0] = 0;
        sequencia[1] = 1;

        System.out.print(sequencia[0]);
        System.out.print(", " + sequencia[1]);

        for(int indice = 2;indice < 20;indice++) {
            sequencia[indice] = sequencia[indice-1] + sequencia[indice-2];
        }
        for(int num: sequencia) {
            System.out.print(num + " ");
        }
    }
}