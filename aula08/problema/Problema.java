package problema;

import java.util.Scanner;

/* 
 Problema com o Scanner. 
    Ocorre quando lemos um número e depois uma String

Soluções:
    1- usar 2 Scanners, um para textos e outro para números
    2- fazer uma leitura depois da entrada de números, apenas para pegar o "ENTER" do buffer
    3- ler tudo como texto e converter para numérico

*/

public class Problema {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        String texto;

        System.out.println("Digite um número");
        // numero = entrada.nextInt(); // gera o 'problema'
        // entrada.nextLine(); // solução 2
        numero = Integer.parseInt(entrada.nextLine()); // solução 3

        System.out.println("Digite um texto");
        texto = entrada.nextLine();
        
        System.out.println(numero);
        System.out.println(texto);

        entrada.close();

    }
}
