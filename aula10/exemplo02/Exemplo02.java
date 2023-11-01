package exemplo02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;

        try {
            System.out.println("Digite um valor inteiro:");
            numero = Integer.parseInt(entrada.nextLine());
            System.out.println("Você digitou " + numero);
        } catch (InputMismatchException e) {
            System.out.println("Valor inválido");
        // } catch (NumberFormatException e) {
        //     System.out.println("Digitação incorreta");
        } 
        catch (Exception e) {
            System.out.println("Problema...");
            System.out.println(e.getMessage());
            e.printStackTrace();
        } finally {
            entrada.close();
            System.out.println("Final");
        }

    }
}
