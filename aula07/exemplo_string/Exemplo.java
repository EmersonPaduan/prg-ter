package exemplo_string;

/*
 charAt(i) é equivalente à [i], acessa uma posição da String
 */
public class Exemplo {
    public static void main(String[] args) {
        String texto = "Boa noite";

        System.out.println(texto);
        for(int i = 0; i < texto.length(); i++) {
            System.out.print(texto.charAt(i) + "-");
        }
        System.out.println();

        // verifica se o caracter é maiúsculo
        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.isUpperCase('a'));
    }
}
