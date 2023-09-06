package exemplo1;

import java.util.Scanner;

public class ExemploSwitch {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;

        System.out.println("Digite o número:");
        numero = teclado.nextInt();

/*      
        if(numero == 1) {
            System.out.println("Segunda");
        } else {
            if(numero == 2) {
                System.out.println("Terça");
            } else {
                if(numero == 3) {
                    System.out.println("Quarta");
                }
                // etc ...
            }
        } 
*/

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
            // etc ...
            default:
                System.out.println("Opção inválida");
                break;
        }

        teclado.close();
    }
}
