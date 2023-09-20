package tabuada;

import java.util.Scanner;

public class Exercicio {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, cont;

        System.out.println("Digite o número da tabuada:");
        numero = entrada.nextInt();

        if(numero <= 0 || numero > 10) {
            System.out.println("Valor inválido");
        } else {
            // cont = 0;
            // while(cont <= 10 ) { // cont: 0 1 2 3 4 5 ... 10 11
            //     System.out.println(numero + " X " + cont + " = " + (numero * cont));
            //     cont++;
            // }

            for(cont = 0 ; cont <= 10 ; cont++) {
                System.out.println(numero + " X " + cont + " = " + (numero * cont));
            }
        }

        entrada.close();
    }

}