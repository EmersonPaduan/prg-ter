package metodos;

public class Exemplo03 {
    public static void main(String[] args) {
        int resultado;

        // a variável 'resultado' recebe o retorno do método 'soma'
        resultado = soma(5, 12);
        System.out.println("A soma = " + resultado);
    }

    // o método soma recebe dois parâmetros do tipo inteiro
    // e RETORNA como resultado, a soma destes dois valores
    static int soma(int n1, int n2) {
        int calculo;

        calculo = n1 + n2;
        return calculo;
    }

}
