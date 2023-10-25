package exemplo01;
public class App {
    public static void main(String[] args) {
        Pessoa p;
        p = new Pessoa("Diego");
        Estudante e = new Estudante(123, "Roberta");
        Pessoa p2 = new Estudante(222, "Marcos");

        // p.setNome("Diego");
        // e.setNome("Roberta");
        // e.setRa(123);

        System.out.println(p.getNome());
        System.out.println(e.getRa() + " - " + e.getNome());

        System.out.println(p); // chama automaticamente o toString
        System.out.println(e);
        System.out.println(p2); // chama automaticamente o toString do Estudante

    }
}
