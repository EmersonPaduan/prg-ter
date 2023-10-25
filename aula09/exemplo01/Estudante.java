package exemplo01;

public class Estudante extends Pessoa {
    private int ra;

    public Estudante(int ra, String nome) {
        super(nome);
        this.ra = ra;
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }
    
    @Override // sobrescrita: polimorfismo : altera o comportamento da superclasse
    public String toString() {
        return "Estudante: " + getNome() + " - " + ra;
    }
 }
