package exemplo1;

import java.util.Scanner;

public class ExemploSwitch {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero = 5;

/*         if(numero == 1) {
            System.out.println("Segunda");
        } else {
            if(numero == 2) {
                System.out.println("Terça");
            } else {
                if(numero == 3) {
                    System.out.println("Quarta");
                }
            }
        } 
*/
        System.out.println("Digite o número:");
        numero = teclado.nextInt();

        switch (numero) {
            case 1:
                System.out.println("Segunda");
                break;
            case 2:
                System.out.println("Terça");
                break;
            case 3:
                System.out.println("Quarta");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }


    }
}
