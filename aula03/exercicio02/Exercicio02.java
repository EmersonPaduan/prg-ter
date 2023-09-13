package exercicio02;

import java.util.Scanner;

/*
 * Escreva um programa para calcular o fatorial de um
 * número inteiro digitado pelo usuário
 */
public class Exercicio02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero, fatorial, contador;

        // entrada
        System.out.println("Digite o número:");
        numero = teclado.nextInt();

        // processamento
        // fat = n * (n-1) * (n-2) * ... * 1
        // exemplo: fat de 5 = 5 * 4 * 3 * 2 * 1 = 120
        contador = numero;
        fatorial = 1;
        while(contador >= 1) {
            fatorial = fatorial * contador;
            contador--;
        }

        //saída
        System.out.println("Fatorial = " + fatorial);

        teclado.close();
    }
}
