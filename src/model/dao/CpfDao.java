
package model.dao;

import conexao.ConexaoSQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.bean.Login;

public class CpfDao {
    
    private Connection conexao = null;

    public CpfDao() {
         conexao = ConexaoSQL.getConexao();
    }
    
    public boolean inserir(String login){
        
        conex();
        
        String sql = "Insert into cpfUsuario(cpf) values(?);";
        
        PreparedStatement st = null;
        
        try{
            st = conexao.prepareStatement(sql);
            st.setString(1, String.valueOf(login));
            st.executeUpdate();
            return true;
        }catch(SQLException ex){
            System.err.println("Erro: "+ex);
            return false;
        }finally{
            ConexaoSQL.fecharConexao(conexao, st);
        }
    }
    
    public boolean excluir(){
        
        String sql = "delete from cpfUsuario where cpf = '"+retornar()+"';";
        
        conex();
        
        PreparedStatement st = null;
        
        try{
            st = conexao.prepareStatement(sql);
            st.executeUpdate();
            return true;
        }catch(SQLException ex){
            System.err.println("Erro: "+ex);
            return false;
        }finally{
            ConexaoSQL.fecharConexao(conexao, st);
        }
    }
    
    public String retornar(){
        
        String cpf = null;
        
        conex();
        
        String sql = "select cpf from cpfUsuario;";
        PreparedStatement st = null;
        ResultSet rs = null;
        
        try{
            st = conexao.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()){
             cpf = rs.getString("cpf");
            }
        }catch(SQLException ex){
            System.err.println("Erro: "+ex);
        }finally{
            ConexaoSQL.fecharConexao(conexao, st, rs);
        }
        return cpf;
    }
    
    public void conex(){
        conexao = ConexaoSQL.getConexao();
    }
    
}
