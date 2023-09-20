package dowhile;

import java.util.Scanner;

public class Exemplo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;

        // Leia números até o usuário digitar ZERO
        
        // numero = 1;
        // while (numero != 0) {
        //     System.out.println("Digite um valor inteiro:");
        //     numero = teclado.nextInt();
        // }

        do {
            System.out.println("Digite um valor inteiro:");
            numero = teclado.nextInt();
        } while (numero != 0);

        teclado.close();
    }
}
