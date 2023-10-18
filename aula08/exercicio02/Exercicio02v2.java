package exercicio02;

import java.util.Scanner;

/* versão 2 = melhorada */

public class Exercicio02v2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double valorFabrica, valorOpcionais, valorFinal;
        final double IMPOSTO = 0.03;
        String opcionais[] = { "Ar-condicionado", "Pintura metálica", "Vidro elétrico", "Direção elétrica",
                "Câmbio automático" };
        double valoresOpcionais[] = { 1500, 800, 600, 2000, 4500 };
        char opcao;

        System.out.println("Qual o preço de fábrica?");
        valorFabrica = Double.parseDouble(teclado.nextLine());

        valorOpcionais = 0;

        for (int i = 0; i < opcionais.length; i++) {
            System.out.println("Deseja "+ opcionais[i] + " (s/n)?");
            opcao = teclado.nextLine().charAt(0);
            if (opcao == 's' || opcao == 'S') {
                valorOpcionais += valoresOpcionais[i];
            }
        }

        valorFinal = (valorFabrica + valorOpcionais) * (1 + IMPOSTO);
        // é o mesmo que:
        // valorFinal = (valorFabrica + valorOpcionais) + ((valorFabrica + valorOpcionais) * IMPOSTO);
        // ou
        // valorFinal = (valorFabrica + valorOpcionais) ;
        // valorFinal = valorFinal + (valorFinal * IMPOSTO); 
        // ou ainda
        // valorFinal = (valorFabrica + valorOpcionais) ;
        // valorFinal += valorFinal * IMPOSTO;

        System.out.println("Preço fábrica: " + valorFabrica);
        System.out.println("Opcionais: " + valorOpcionais);
        System.out.println("Final (com impostos): " + valorFinal);

        teclado.close();
    }
}
