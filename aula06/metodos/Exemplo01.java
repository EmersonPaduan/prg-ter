package metodos;


public class Exemplo01 {

    public static void main(String[] args) {
        exibir();
        System.out.println("Dentro do main");
        exibir();  // chamada de método
    }   

    // método
    static void exibir() {
        System.out.println("Dentro do exibir");
    }


}