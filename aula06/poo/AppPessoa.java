package poo;

public class AppPessoa {

    public static void main(String[] args) {
        // criando (instanciando) um objeto do tipo Pessoa
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();

        p1.nome = "Emerson";
        p1.apresentar();
        
        p2.nome = "Paduan";
        p2.apresentar();
    }
}
