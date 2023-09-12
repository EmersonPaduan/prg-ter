package exemplo01;

/**
 * while = enquanto
 * o bloco de repeti;ão é executado ENQUANTO a condi;ão for verdadeira 
 */
public class Exemplo01 {

    public static void main(String[] args) {
        int contador;

        contador = 1;
        while(contador <= 10) {
            System.out.println(contador);
            contador = contador + 1;
        }
    }
}