
package model.dao;

//import com.mysql.jdbc.Statement;
import conexao.ConexaoSQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.bean.CadastroUsuario;
import model.bean.Login;


public class CadastroUsuarioDao {
    
    private Connection conexao= null;
    private CpfDao d = new CpfDao();
    private String cpf;
    private String senha;
    
    public CadastroUsuarioDao() {
        
    }
    
    public boolean inserir(CadastroUsuario usuario){
        
        conex();
       
        String sql = "Insert into Usuario(nome,email,cpf,senha) values(?,?,?,?);";
        
        PreparedStatement st = null;
        
        try{
            st = conexao.prepareStatement(sql);
            st.setString(1,usuario.getNome());
            st.setString(2, usuario.getEmail());
            st.setString(3, usuario.getCpf());
            st.setString(4, usuario.getSenha());
            st.executeUpdate();
            return true;
        }catch(SQLException ex){
            System.err.println("Erro: " +ex);
            return false;
        }finally{
            ConexaoSQL.fecharConexao(conexao, st);
        }
    }
    
    public boolean excluir(){
        
        String sql6 = "Delete from Usuario where cpf = '"+ d.retornar() +"';";
        d.excluir();
        conex();
        PreparedStatement st = null;
  
        try{
   
            st = conexao.prepareStatement(sql6);
            st.executeUpdate();
            return true;
        }catch(SQLException ex){
            System.err.println("Erro: " +ex);
            return false;
        }finally{
            ConexaoSQL.fecharConexao(conexao, st);
        }
    }
    
    public boolean atualizaEmail(String cpf,String email){
        conex();
        String sql = "update Usuario set email = '"+email+"' where cpf = '"+cpf+"';";
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
    
    public boolean aux1(){
         String sql1 = "Delete from historicoCliente where cpfusuario = '"+ d.retornar() +"';";
       
         conex();
     
        PreparedStatement st = null;
        try{
            st = conexao.prepareStatement(sql1);
            st.executeUpdate();
            return true;
            
        }catch(SQLException ex){
            System.err.println("Erro: " +ex);
            return false;
        }finally{
            ConexaoSQL.fecharConexao(conexao, st);
        }
    }
    
     public boolean aux2(){
         String sql2 = "Delete from formulariocliente where cpfusuario = '"+ d.retornar() +"';";
         
         conex();
     
        PreparedStatement st = null;
        try{
            st = conexao.prepareStatement(sql2);
            st.executeUpdate();
            return true;
        }catch(SQLException ex){
            System.err.println("Erro: " +ex);
            return false;
        }finally{
            ConexaoSQL.fecharConexao(conexao, st);
        }
    }
     
      public boolean aux3(){
        String sql3 = "Delete from notasfiscais where cpfusuario = '"+ d.retornar() +"';";
         
         conex();
     
        PreparedStatement st = null;
        try{
            st = conexao.prepareStatement(sql3);
            st.executeUpdate();
            return true;
        }catch(SQLException ex){
            System.err.println("Erro: " +ex);
            return false;
        }finally{
            ConexaoSQL.fecharConexao(conexao, st);
        }
    }
       
      public boolean aux4(){
        String sql4 = "Delete from dividas where cpfusuario = '"+ d.retornar() +"';";
         
         conex();
     
        PreparedStatement st = null;
        try{
            st = conexao.prepareStatement(sql4);
            st.executeUpdate();
            return true;
        }catch(SQLException ex){
            System.err.println("Erro: " +ex);
            return false;
        }finally{
            ConexaoSQL.fecharConexao(conexao, st);
        }
    }
      
       public boolean aux5(){
       String sql5 = "Delete from cliente where cpfusuario = '"+ d.retornar() +"';";
         
         conex();
     
        PreparedStatement st = null;
        try{
            st = conexao.prepareStatement(sql5);
            st.executeUpdate();
            return true;
        }catch(SQLException ex){
            System.err.println("Erro: " +ex);
            return false;
        }finally{
            ConexaoSQL.fecharConexao(conexao, st);
        }
    }
       
    public boolean atualizaSenha(String cpf,String senha){
        conex();
        String sql = "update usuario set senha = '"+senha+"' where cpf = '"+cpf+"';";
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
    
    public void login(String cpf, String senha){
     
        conex();
        
        String sql = "Select cpf,senha from Usuario where cpf = '"+cpf+"';";
    
        PreparedStatement st = null;
        ResultSet rs = null;
        
        try{
            st = conexao.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()){
                this.cpf = rs.getString("cpf");
                this.senha = rs.getString("senha");
            }
        }catch(SQLException ex){
            System.err.println("Erro: "+ex);
        }finally{
            ConexaoSQL.fecharConexao(conexao, st, rs);
        }
    }
    
    public String retornar(String cpf){
        
        String senha = null;
        
        conex();
        
        String sql = "select senha from Usuario where cpf = '"+cpf+"';";
        PreparedStatement st = null;
        ResultSet rs = null;
        
        try{
            st = conexao.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()){
             senha = rs.getString("senha");
            }
        }catch(SQLException ex){
            System.err.println("Erro: "+ex);
        }finally{
            ConexaoSQL.fecharConexao(conexao, st, rs);
        }
        return senha;
    }
    
    public String retornar1(){
        
        String email = null;
       
        String sql = "select email from Usuario where cpf = '"+d.retornar()+"';";
        conex();
        PreparedStatement st = null;
        ResultSet rs = null;
        
        try{
            st = conexao.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()){
             email = rs.getString("email");
            }
        }catch(SQLException ex){
            System.err.println("Erro: "+ex);
        }finally{
            ConexaoSQL.fecharConexao(conexao, st, rs);
        }
        return email;
    }
    
    public String nomeR(){
        String n = null;
        
        String sql = "select nome from usuario where cpf='"+d.retornar()+"';";
        conex();
        PreparedStatement st = null;
        ResultSet rs = null;
        try{
            st = conexao.prepareStatement(sql);
            rs= st.executeQuery();
            while(rs.next()){
                n = rs.getString("nome");
            }
        }catch(SQLException ex){
            System.err.println("ERRO: "+ex);
        }
        
        return n;
    }
    
    public void conex(){
        conexao = ConexaoSQL.getConexao();
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
     
}
