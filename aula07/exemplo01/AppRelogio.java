package exemplo01;

public class AppRelogio {
    public static void main(String[] args) {
        Relogio relogio = new Relogio();

        // o acesso a um atributo privado só é permitido dentro da classe
        // relogio.hora = 91;
        // relogio.minuto = -27;

        relogio.setHora(20);
        relogio.setMinuto(17);
        relogio.setSegundo(74);
        System.out.println(relogio.exibir());
        System.out.println("Hora atual: " + relogio.getHora());
    }
}
