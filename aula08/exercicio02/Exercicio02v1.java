package exercicio02;

import java.util.Scanner;

/* versão 1 = simplista (junior) */

public class Exercicio02v1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double valorFabrica, valorOpcionais, valorFinal;
        final double IMPOSTO = 0.03;
        char opcao;

        System.out.println("Qual o preço de fábrica?");
        valorFabrica = Double.parseDouble(teclado.nextLine());

        valorOpcionais = 0;

        System.out.println("Deseja Ar-condicionado (s/n)?");
        opcao = teclado.nextLine().charAt(0);
        if(opcao == 's' || opcao == 'S') {
            valorOpcionais += 1500;
        }
        
        System.out.println("Pintura metálica (s/n)?");
        opcao = teclado.nextLine().charAt(0);
        if(opcao == 's' || opcao == 'S') {
            valorOpcionais += 800;
        }

        System.out.println("Vidro elétrico (s/n)?");
        opcao = teclado.nextLine().charAt(0);
        if(opcao == 's' || opcao == 'S') {
            valorOpcionais += 600;
        }

        System.out.println("Direção elétrica (s/n)?");
        opcao = teclado.nextLine().charAt(0);
        if(opcao == 's' || opcao == 'S') {
            valorOpcionais += 2000;
        }

        System.out.println("Câmbio automático (s/n)?");
        opcao = teclado.nextLine().charAt(0);
        if(opcao == 's' || opcao == 'S') {
            valorOpcionais += 4500;
        }

        valorFinal = (valorFabrica + valorOpcionais) * (1+IMPOSTO);

        System.out.println("Preço fábrica: " + valorFabrica);
        System.out.println("Opcionais: " + valorOpcionais);
        System.out.println("Final (com impostos): "+ valorFinal);

        teclado.close();
    }
}
