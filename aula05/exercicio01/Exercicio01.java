package exercicio01;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matriz[][] = new int[3][3];
        int soma;

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                System.out.println("Digite a posição " 
                                    + linha + " x " + coluna);
                matriz[linha][coluna] = entrada.nextInt();
            }
        }

        soma = 0;
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                soma = soma + matriz[linha][coluna];
            }
        }
        System.out.println("Soma Total = " + soma);

        for (int linha = 0; linha < matriz.length; linha++) {
            soma = 0;
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                soma = soma + matriz[linha][coluna];
            }
            System.out.println("Soma linha " + linha + " = "+ soma);
        }

        for (int coluna = 0; coluna < matriz[0].length; coluna++) {
            soma = 0;
            for (int linha = 0; linha < matriz.length; linha++) {
                soma = soma + matriz[linha][coluna];
            }
            System.out.println("Soma coluna " + coluna + " = "+ soma);
        }

        entrada.close();
    }
}
