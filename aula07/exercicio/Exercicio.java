package exercicio;

import java.util.Scanner;

/*
 Escreva um programa que leia um texto informado pelo usuário
 e conte quantas letras maiúsculas existem no texto
 */

public class Exercicio {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String texto;
        int cont;

        System.out.println("Digite o texto:");
        texto = teclado.nextLine();

        cont = 0;
        for (int i = 0; i < texto.length(); i++) {
            if(Character.isUpperCase(texto.charAt(i))) {
                cont++;
            }
        }

        System.out.println("Seu texto tem " + cont + " letras maiúsculas");

        teclado.close();
    }
}
