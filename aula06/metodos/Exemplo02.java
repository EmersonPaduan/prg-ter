package metodos;

public class Exemplo02 {
    public static void main(String[] args) {

        linha(5, '-');
        linha(15, '-');
        linha(50, '*');
    }

    // o método linha tem um PARÂMETRO chamado tam, do tipo inteiro, e outro chamado letra, do tipo
    // um parâmetro é um forma de enviar informações para um método
    static void linha(int tam, char letra) {
        for (int i = 0; i < tam; i++) {
            System.out.print(letra);
        }
        System.out.println();
    }   



}
