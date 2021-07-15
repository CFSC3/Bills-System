
package model.dao;

import conexao.ConexaoSQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.bean.FormularioClientes;
import model.bean.HistoricoCliente;

public class FormularioClienteDao {
    
    private Connection conexao = null;
    private CadastroDividasDao  da = new CadastroDividasDao();
    private CpfDao cpf = new CpfDao();

    public FormularioClienteDao() {
      
    }
    
    public boolean Atualizar(FormularioClientes fc){
        
        
        String sql = "Update FormularioCliente set descricao = '"+fc.getDescricao()+"' , situacao = '"+fc.getSituacao()+"', dataUltimaDivida = str_to_date(\""+fc.getDataUltimaCompra()+"\",\"%d/%m/%Y\") where nomeCliente = '"+fc.getNomeCliente()+"' and cpfusuario = '"+cpf.retornar()+"';";
        String sql1 = "insert into historicoCliente values('"+fc.getNomeCliente()+"','"+retornaCpf(fc.getNomeCliente())+"',str_to_date(\""+fc.getDataUltimaCompra()+"\",\"%d/%m/%Y\"),'"+da.descricao(retornaCpf(fc.getNomeCliente()),fc.getDataUltimaCompra())+"','"+fc.getDescricao()+"','"+cpf.retornar()+"');";
        conex();
        PreparedStatement st = null;
        PreparedStatement st1 = null;

        try{
            st = conexao.prepareStatement(sql);
            st.executeUpdate();
            st1  = conexao.prepareStatement(sql1);
            st1.executeUpdate();
            return true;
        }catch(SQLException ex){
            System.err.println("Erro: "+ex);
            return false;
        }finally{
            ConexaoSQL.fecharConexao(conexao, st1);
            ConexaoSQL.fecharConexao(conexao, st);
        }
    }
    
    public String retornaCpf(String nome){
        
        conex();
        
        String e = null;
        
        String sql = "select cpf from FormularioCliente where nomeCliente = '"+nome+"' and cpfusuario = '"+cpf.retornar()+"'";
        PreparedStatement st = null;
        ResultSet rs = null;
        try{
            st = conexao.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()){
                e = rs.getString("cpf");
            }
        }catch(SQLException ex){
            System.err.println("ERRO: "+ex);
        }finally{
            ConexaoSQL.fecharConexao(conexao, st, rs);
        }
        
        return e;
    }
    
    public ArrayList<FormularioClientes> read(){
        conex();
        PreparedStatement st = null;
        ResultSet rs = null;
        
        ArrayList<FormularioClientes> capto = new ArrayList<>();
        
        try{
            st = conexao.prepareStatement("Select nomeCliente,descricao,situacao,date_format(dataUltimaDivida,\"%d/%m/%Y\") from formularioCliente where cpfusuario = '"+cpf.retornar()+"';");
            rs = st.executeQuery();
            while(rs.next()){
                FormularioClientes captos = new FormularioClientes();
                captos.setNomeCliente(rs.getString("nomeCliente"));
                captos.setDescricao(rs.getString("descricao"));
                captos.setSituacao(rs.getString("situacao"));
                captos.setDataUltimaCompra(rs.getString("date_format(dataUltimaDivida,\"%d/%m/%Y\")"));
                
                capto.add(captos);
            }
            }catch(SQLException ex){
                    System.err.println("Erro: "+ex);         
               }finally{
                     ConexaoSQL.fecharConexao(conexao, st, rs);
                }
            
        return capto;
    }
     
    public ArrayList<HistoricoCliente> readHistorico(String cpf1){
        conex();
        PreparedStatement st = null;
        ResultSet rs = null;
        
        ArrayList<HistoricoCliente> capto = new ArrayList<>();
        
        try{
            st = conexao.prepareStatement("Select nomeCliente,cpf,situacao,descricao,date_format(dataUltimaDivida,\"%d/%m/%Y\") from historicoCliente where cpf = '"+cpf1+"' and cpfusuario = '"+cpf.retornar()+"';");
            rs = st.executeQuery();
            while(rs.next()){
                HistoricoCliente captos = new HistoricoCliente();
                captos.setNomeCliente(rs.getString("nomeCliente"));
                captos.setDescricao(rs.getString("descricao"));
                captos.setSituacao(rs.getString("situacao"));
                captos.setDataUltimaCompra(rs.getString("date_format(dataUltimaDivida,\"%d/%m/%Y\")"));
                captos.setCpf(rs.getString("cpf"));
                
                capto.add(captos);
            }
            }catch(SQLException ex){
                    System.err.println("Erro: "+ex);         
               }finally{
                     ConexaoSQL.fecharConexao(conexao, st, rs);
                }
            
        return capto;
    }
    
    public ArrayList<FormularioClientes> pesquisaNome(String nome){
    conex();
        PreparedStatement st = null;
        ResultSet rs = null;
        
        ArrayList<FormularioClientes> capto = new ArrayList<>();
        
        try{
            st = conexao.prepareStatement("Select nomeCliente,descricao,situacao,dataUltimaDivida from formularioCliente where nomeCliente like '"+ nome +"%'order by nomeCliente asc;;");
            rs = st.executeQuery();
            while(rs.next()){
                FormularioClientes captos = new FormularioClientes();
                captos.setNomeCliente(rs.getString("nomeCliente"));
                captos.setDescricao(rs.getString("descricao"));
                captos.setSituacao(rs.getString("situacao"));
                captos.setDataUltimaCompra(rs.getString("dataUltimaDivida"));
                
                capto.add(captos);
            }
            }catch(SQLException ex){
                    System.err.println("Erro: "+ex);         
               }finally{
                     ConexaoSQL.fecharConexao(conexao, st, rs);
                }
            
        return capto;
    }
    
    public void conex(){
        conexao = ConexaoSQL.getConexao();
    }   
}
