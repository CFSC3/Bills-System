
package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConexaoSQL {
    
    private static final String DRIVER =  "com.mysql.cj.jdbc.Driver";
    private static final String ENDERECO = "jdbc:mysql://localHost:3306/billsystem?useTimezone=true&serverTimezone=UTC";
    private static final String USUARIO = "root";
    private static final String SENHA = "3CR2054LF17cfsc";
    
    public static Connection getConexao(){
        
        try{
            
            Class.forName(DRIVER);        
            return DriverManager.getConnection(ENDERECO, USUARIO, SENHA);
            
        } catch (ClassNotFoundException | SQLException ex){
            throw new RuntimeException("Erro na conexão!", ex);            
        }
        
    }
    
    public static void fecharConexao(Connection conexao){    
        if(conexao != null){           
            try {
                conexao.close();
            } catch (SQLException ex) {
               System.err.println("Erro: " + ex);
            }
        }  
    }
    
    public static void fecharConexao(Connection conexao, PreparedStatement st){        
        if(st != null){           
            try {
                st.close();
            } catch (SQLException ex) {
                 System.err.println("Erro: " + ex);
            }
            fecharConexao(conexao);
        }  
    }
    
    public static void fecharConexao(Connection conexao, PreparedStatement st, ResultSet resultado){        
        if(resultado != null){           
            try {
                resultado.close();
            } catch (SQLException ex) {
                 System.err.println("Erro: " + ex);
            }
            fecharConexao(conexao,st);
        }  
    }
            
}

