package br.anhembi.projalunos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentDAO {
    private static final String BD_URL = "jdbc:mysql://localhost:3306/bd_escola"; 
    private static final String USER = "professor"; // root
    private static final String PASSWORD = "aula";
    
    public static boolean inserir(Student student) {
        final String INSERT_STUDANT = "insert into alunos values(null, ?, ?)"; 
        // conectar com o BD - desconectar no final
        // try with resources fecha automaticamente ao final toda conexão aberta
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try  {
             connection = DriverManager.getConnection(BD_URL, USER, PASSWORD);
             preparedStatement = 
                connection.prepareStatement(INSERT_STUDANT);
            preparedStatement.setString(1, student.getNome());
            preparedStatement.setString(2, student.getEmail());
            // enviar o comando
            preparedStatement.execute();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            try {
                preparedStatement.close();
                connection.close();
            } catch (Exception e) {
                
            }

        }
    }
    
  public static Student buscarPorRA(int ra) {
        final String SELECT_USERS_SQL = "SELECT * FROM alunos WHERE ra = ?;";

        // try with resource automaticamente fecha tudo que foi aberto
        try (
            Connection conn = DriverManager.getConnection(BD_URL, USER, PASSWORD);
            PreparedStatement preparedStatement = conn.prepareStatement(SELECT_USERS_SQL)) {
            preparedStatement.setInt(1, ra);
            ResultSet rs = preparedStatement.executeQuery();
            if (rs.next()) { // testa se tem uma próxima linha na tabela
                int raAluno = rs.getInt("ra");
                String nome = rs.getString("nome");
                String email = rs.getString("email");
                Student student = new Student(raAluno, nome, email);
                return student;
            }
            return null; // não achou o RA
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
  
      public static int atualizarEmail(int ra, String email) {
        final String SELECT_USERS_SQL = "UPDATE alunos SET email = ? WHERE ra = ?;";

        try (Connection conn = DriverManager.getConnection(BD_URL, USER, PASSWORD);
            PreparedStatement preparedStatement = conn.prepareStatement(SELECT_USERS_SQL)) {
            preparedStatement.setString(1, email);
            preparedStatement.setInt(2, ra);
            int registros = preparedStatement.executeUpdate();
            return registros;
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }

    public static int apagarPorRA(int ra) {
        final String SELECT_USERS_SQL = "DELETE FROM alunos WHERE ra = ?;";

        try (Connection conn = DriverManager.getConnection(BD_URL, USER, PASSWORD);
            PreparedStatement preparedStatement = conn.prepareStatement(SELECT_USERS_SQL)) {
            preparedStatement.setInt(1, ra);
            int registros = preparedStatement.executeUpdate();
            return registros;
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }
}
