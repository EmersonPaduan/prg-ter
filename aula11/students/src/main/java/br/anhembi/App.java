package br.anhembi;

public class App {

    public static void main(String[] args) {
        // Student student1 = new Student("Alessandra", "ale2@gmail.com");

        // boolean result = StudentDAO.inserir(student1);

        // if(result) {
        // System.out.println("Inserido com sucesso");
        // } else {
        // System.out.println("Erro");
        // }

        Student student2 = StudentDAO.buscarPorRA(4);

        if (student2 != null) {
            System.out.println(student2);
        } else {
            System.out.println("Não encontrado");
        }

        Student student3 = new Student("Tony", "tony@email.com");

        if (StudentDAO.inserir(student3)) {
            System.out.println("inserido");
        } else {
            System.out.println("Erro");
        }

        int registrosAfetados = StudentDAO.atualizarEmail(1, "novoEmail@email.com");

        if (registrosAfetados > 0) {
            System.out.println(registrosAfetados + " registro(s) atualizado(s)");
        } else {
            System.out.println("Nada atualizado.");
        }

        registrosAfetados = StudentDAO.apagarPorRA(1);

        if(registrosAfetados > 0) {
            System.out.println(registrosAfetados + " registro(s) apagado(s)");
        } else {
            System.out.println("Nada apagado.");
        }

    }
}
