package exemplo01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo01 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        boolean entradaValida = false;

        do{
            try {
                System.out.println("Digite um valor inteiro:");
                numero = entrada.nextInt();
                entradaValida = true;
                System.out.println("Você digitou " + numero);
            } catch (InputMismatchException ex) {
                System.out.println("Erro de digitação");
                entrada.nextLine();
            }
        } while(!entradaValida);

        System.out.println("Fim do programa");

        entrada.close();
    }
}