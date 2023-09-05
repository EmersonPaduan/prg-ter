package exercicio1;

import java.util.Scanner;

/**
 * Exercicio01
 */
public class Exercicio01 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota1, nota2, media;
        double notaExame;
        int faltas;

        //entrada
        System.out.println("Digite a primeira nota");
        nota1 = teclado.nextDouble();
        System.out.println("Digite a segunda nota");
        nota2 = teclado.nextDouble();
        System.out.println("Digite a quantidade de faltas:");
        faltas = teclado.nextInt();

        // processamento
        if(faltas >= 16 ) {
            System.out.println("Aluno reprovado por faltas.");
        } else {
            media = (nota1 + nota2) / 2;
            if(media >= 6) {
                System.out.println("Aluno aprovado");
            } else {
                System.out.println("Informe a nota do exame:");
                notaExame = teclado.nextDouble();
                media = (media + notaExame) /2;
                if(media >= 5) {
                    System.out.println("Aprovado em exame");
                } else {
                    System.out.println("Reprovado.");
                }
            }
        }

        //saída


        teclado.close();
    }
}