package exemplo01;

/* 
 Encapsulamento (com modificador private)
*/
public class Relogio {
    // atributos
    private int hora;
    private int minuto;
    private int segundo;

    // métodos
    public void setHora(int novaHora) {
        if (novaHora >= 0 && novaHora < 24) {
            hora = novaHora;
        }
    }

    public void setMinuto(int minuto) {
        if (minuto >= 0 && minuto < 60) {
            this.minuto = minuto;
        }
    }

    public void setSegundo(int segundo) {
        if( segundo >= 0 && segundo < 60) {
            this.segundo = segundo;
        }
    }

    public int getSegundo() {
        return segundo;
    }

    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public String exibir() {
        return hora + ":" + minuto + ":" + segundo;
    }
}