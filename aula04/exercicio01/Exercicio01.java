package exercicio01;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero, resto;
        int qtdePares = 0, qtdeImpares = 0;

        for(int cont = 1; cont < 11; cont++) {
            System.out.println("Digite um valor inteiro:");
            numero = teclado.nextInt();
            resto = numero % 2;
            if(resto == 0) {
                qtdePares++;
            } else {
                qtdeImpares++;
            }
        }
        
        System.out.println("Pares: " + qtdePares);
        System.out.println("Impares: " + qtdeImpares);

        teclado.close();
    }
}