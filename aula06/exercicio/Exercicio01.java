package exercicio;

public class Exercicio01 {
    public static void main(String[] args) {
        int maior;

        maior = encontrarMax(10, 100);
        System.out.println("Maior = " + maior);
    }

    static int encontrarMax(int n1, int n2) {
        if(n1 > n2) {
            return  n1;
        } else {
            return n2;
        }
    }
}
