package exemplo2;

public class ExemploTernario {
    public static void main(String[] args) {
        String resposta;
        double media;

        media = 8;

/*         if(media > 6) {
            resposta = "Aprovado";
        } else {
            resposta = "Reprovado";
        } 
*/

        // if ternário
        // (condição) ? verdadeiro : falso;

        resposta = (media > 6)? "Aprovado" : "Reprovado";

        System.out.println(resposta);
    }
}
