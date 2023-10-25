package exemplo01;

public class Pessoa { // extends Object
    private String nome;

    // construtor default (padrão)
    public Pessoa() { }

    // sobrecarga de método: pollimorfismo
    public Pessoa(String nome) {
        this.nome = nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override // sobrescrita: polimorfismo
    public String toString() {
        return "Pessoa: " + nome;
    }
}