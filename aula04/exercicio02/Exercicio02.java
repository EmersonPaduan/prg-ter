package exercicio02;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero, resto;
        int qtdePares = 0, qtdeImpares = 0;
        double media = 0;

        for(int cont = 1; cont < 11; cont++) {
            System.out.println("Digite um valor inteiro:");
            numero = teclado.nextInt();
            resto = numero % 2;
            if(resto == 0) {
                qtdePares++;
                media = media + numero; // soma todos os valores pares
            } else {
                qtdeImpares++;
            }
        }
        media = media / qtdePares; // calcula a média, dividindo a soma pela qde de números
        System.out.println("Média Pares: " + media);
        System.out.println("Porcentagem impares: " + (qtdeImpares * 10) + "%");

        teclado.close();
    }
}