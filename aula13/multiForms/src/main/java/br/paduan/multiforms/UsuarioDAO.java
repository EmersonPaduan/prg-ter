
package br.paduan.multiforms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDAO {
    private static final String BD_URL = "jdbc:mysql://localhost:3306/bd_forms"; 
    private static final String USER = "professor"; // root
    private static final String PASSWORD = "aula";
    
    public static boolean inserir(Usuario usuario) {
        final String INSERT_USUARIO = "insert into usuarios values(null, ?, ?)"; 
        // conectar com o BD - desconectar no final
        // try with resources fecha automaticamente ao final toda conexão aberta
        try(
            Connection connection = DriverManager.getConnection(BD_URL, USER, PASSWORD);
            PreparedStatement preparedStatement = 
                connection.prepareStatement(INSERT_USUARIO);  
        ){
             
            preparedStatement.setString(1, usuario.getNome());
            preparedStatement.setString(2, usuario.getEmail());
            // enviar o comando
            preparedStatement.execute();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } 
    }

      public static Usuario buscarPorID(int id) {
        final String SELECT_USUARIO_SQL = "SELECT * FROM usuarios WHERE id = ?;";

        try (
            Connection conn = DriverManager.getConnection(BD_URL, USER, PASSWORD);
            PreparedStatement preparedStatement = conn.prepareStatement(SELECT_USUARIO_SQL)) {
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();
            
            if (rs.next()) { // testa se tem uma próxima linha na tabela
                int idUsuario = rs.getInt("id");
                String nome = rs.getString("nome");
                String email = rs.getString("email");
                
                Usuario usuario = new Usuario(idUsuario, nome, email);
                
                return usuario;
            }
            return null; // não achou o RA
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
