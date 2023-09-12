package exercicio01;

import java.util.Scanner;

public class Exemplo01 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int contador, limite;

        System.out.println("Digite o limite da contagem:");
        limite = entrada.nextInt();

        contador = 1;
        while(contador <= limite) {
            System.out.println(contador);
            contador = contador + 1;
        }

        entrada.close();
    }
}
