package exercicio01;

import java.util.Scanner;

/**
 * Exercicio 01
 */

public class Exercicio01 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        final int TOTAL_CARROS = 5;
        int composicao[] = new int[TOTAL_CARROS];
        int totalPassageiros;

        // entrada de dados
        totalPassageiros = 0;
        for (int i = 0; i < TOTAL_CARROS; i++) {
            do {
                System.out.println("Digite a quantidade de passageiros do carro " + (i + 1) + "(0 a 250):");
                composicao[i] = teclado.nextInt();
            } while (composicao[i] < 0 || composicao[i] > 250);

            totalPassageiros += composicao[i];
        }

        // processamento/saída
        for (int i = 0; i < TOTAL_CARROS; i++) {
            System.out.print("carro " + (i + 1) + " " + composicao[i]);

            if (composicao[i] < 51) {
                System.out.println(" Azul");
            } else {
                if (composicao[i] < 101) {
                    System.out.println(" Amarelo");
                } else {
                    if (composicao[i] < 151) {
                        System.out.println(" Laranja");
                    } else {
                        System.out.println(" Vermelho");
                    }
                }
            }
        }

        System.out.println("Total de passageiros: " + totalPassageiros);

        teclado.close();
    }
}