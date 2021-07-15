
package model.dao;

import conexao.ConexaoSQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.bean.CadastroDividas;
import model.bean.NotaFiscal;

public class CadastroDividasDao {
    
    private Connection conexao = null;
    private CpfDao cpf = new CpfDao();
    private NotaFiscal nf = new NotaFiscal();
    private NotaFiscal f;
    private NotaFiscalDao fdao = new NotaFiscalDao();
    java.util.Random rand = new java.util.Random();

    public CadastroDividasDao() {
       
    }
    
    public boolean inserir(CadastroDividas dividas){
        
        conex();
        
        String sql = "Insert into Dividas values('"+dividas.getNome()+"','"+dividas.getCpf()+"',"+dividas.getValor()+",'"+dividas.getFormaDePagamento()+"',"+dividas.getParcelamento()+",str_to_date(\""+dividas.getDataCompra()+"\",\"%d/%m/%Y\"),str_to_date(\""+dividas.getDataVencimento()+"\",\"%d/%m/%Y\"),'"+dividas.getDescricao()+"','Devendo','"+cpf.retornar()+"');";
 
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
    
    public boolean excluir(CadastroDividas dividas){
        
        conex();
        
        String sql = "delete from Dividas where cpfCliente = "+dividas.getCpf()+";";
        
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
    
    public boolean atualizarSituacao(String nome, String descricao){
        
        conex();
        
        String sql = "Update Dividas set situacao = 'Pago' where nomecliente = '"+nome+"' and descricao = '"+descricao+"'and situacao = 'Devendo';";
        
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
    
    public boolean capto(String nomeCliente, String descricao){
       
        conex();
        
        String sql = "Select nomeCliente, cpfCliente, valor, parcelamento, descricao from Dividas where nomeCliente = '"+nomeCliente+"' and descricao = '"+descricao+"';";
    
        PreparedStatement st = null;
        ResultSet rs = null;
        
        try{
            st = conexao.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()){
                nf.setNomeCliente(rs.getString("nomeCliente"));
                nf.setCpfCliente(rs.getString("cpfCliente"));
                nf.setDescricao(rs.getString("descricao"));
                nf.setValorPago(Double.parseDouble(rs.getString("valor")));
                nf.setParcelamento(Integer.parseInt(rs.getString("parcelamento")));
            }
            
             String cod = String.valueOf(Long.toHexString(rand.nextLong())); 
             nf.setNumeroDeSerie(cod);
             
             f = new NotaFiscal(nf.getNumeroDeSerie(),nf.getNomeCliente(),nf.getCpfCliente(),nf.getValorPago(),nf.getDescricao(),nf.getParcelamento());
             if(fdao.inserir(f)){
            System.out.println("Sucesso3");
        }else{
            System.out.println("Erro!");
        }
             
            return true;
        }catch(SQLException ex){
            System.err.println("Erro: "+ex);
            return false;
        }finally{
            ConexaoSQL.fecharConexao(conexao, st, rs);
        }     
    }
    
    /**
     *
     * @return
     */
    public ArrayList<CadastroDividas> read(){
        conex();
        PreparedStatement st = null;
        ResultSet rs = null;
        
        ArrayList<CadastroDividas> capto = new ArrayList<>();
        
        try{
            st = conexao.prepareStatement("Select nomeCliente,descricao,parcelamento,valor,date_format(dataVencimento,\"%d/%m/%Y\"),situacao from Dividas where cpfusuario = '"+cpf.retornar()+"' and situacao = 'Devendo' order by dataVencimento ASC;");
            rs = st.executeQuery();
            while(rs.next()){
                CadastroDividas captos = new CadastroDividas();
                captos.setNome(rs.getString("nomeCliente"));
                captos.setDescricao(rs.getString("descricao"));
                captos.setParcelamento(rs.getInt("parcelamento"));
                captos.setValor(rs.getFloat("valor"));
                captos.setDataVencimento(rs.getString("date_format(dataVencimento,\"%d/%m/%Y\")"));
                captos.setSituacao(rs.getString("situacao"));
                capto.add(captos);
            }
            }catch(SQLException ex){
                    System.err.println("Erro: "+ex);         
               }finally{
                     ConexaoSQL.fecharConexao(conexao, st, rs);
                }
            
        return capto;
    }
    
    public ArrayList<CadastroDividas> read2(){
        conex();
        PreparedStatement st = null;
        ResultSet rs = null;
        
        ArrayList<CadastroDividas> capto = new ArrayList<>();
        
        try{
            st = conexao.prepareStatement("Select nomeCliente,descricao,parcelamento,valor,date_format(dataVencimento,\"%d/%m/%Y\"),situacao from Dividas where cpfusuario = '"+cpf.retornar()+"' and situacao = 'Pago' order by date_format(dataVencimento,\"%d/%m/%Y\") desc;");
            rs = st.executeQuery();
            while(rs.next()){
                CadastroDividas captos = new CadastroDividas();
                captos.setNome(rs.getString("nomeCliente"));
                captos.setDescricao(rs.getString("descricao"));
                captos.setParcelamento(rs.getInt("parcelamento"));
                captos.setValor(rs.getFloat("valor"));
                captos.setDataVencimento(rs.getString("date_format(dataVencimento,\"%d/%m/%Y\")"));
                captos.setSituacao(rs.getString("situacao"));
                capto.add(captos);
            }
            }catch(SQLException ex){
                    System.err.println("Erro: "+ex);         
               }finally{
                     ConexaoSQL.fecharConexao(conexao, st, rs);
                }
            
        return capto;
    }
    
    public String retornarCpf(String nome){
        conex();
        String c = null;
        String sql = "select cpfCliente from dividas where nomecliente = '"+nome+"' and cpfusuario = '"+cpf.retornar()+"';";
        PreparedStatement st = null;
        ResultSet rs = null;
        try{
            st = conexao.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()){
                c = rs.getString("cpfCliente");
            }
        }catch(SQLException ex){
            System.err.println("Erro: "+ex);
        }finally{
            ConexaoSQL.fecharConexao(conexao, st, rs);
        }
        return c;
    }
    
    public String retornarDUC(String nome,String descricao){
        conex();
        String c = null;
        String sql = "select date_format(dataCompra,\"%d/%m/%Y\") from dividas where nomecliente = '"+nome+"' and descricao = '"+descricao+"' and cpfusuario = '"+cpf.retornar()+"';";
        PreparedStatement st = null;
        ResultSet rs = null;
        try{
            st = conexao.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()){
                c = rs.getString("date_format(dataCompra,\"%d/%m/%Y\")");
            }
        }catch(SQLException ex){
            System.err.println("Erro: "+ex);
        }finally{
            ConexaoSQL.fecharConexao(conexao, st, rs);
        }
        return c;
    }
    
    public ArrayList<CadastroDividas> pesquisaNome(String nome){
        conex();
        PreparedStatement st = null;
        ResultSet rs = null;
        
        ArrayList<CadastroDividas> capto = new ArrayList<>();
        
        try{
            st = conexao.prepareStatement("Select nomeCliente,descricao,parcelamento,valor,dataVencimento,situacao from Dividas where nomeCliente like '"+ nome +"%' order by dataVencimento ASC;");
            rs = st.executeQuery();
            while(rs.next()){
                CadastroDividas captos = new CadastroDividas();
                captos.setNome(rs.getString("nomeCliente"));
                captos.setDescricao(rs.getString("descricao"));
                captos.setParcelamento(rs.getInt("parcelamento"));
                captos.setValor(rs.getFloat("valor"));
                captos.setDataVencimento(rs.getString("dataVencimento"));
                captos.setSituacao(rs.getString("situacao"));
                capto.add(captos);
            }
            }catch(SQLException ex){
                    System.err.println("Erro: "+ex);         
               }finally{
                     ConexaoSQL.fecharConexao(conexao, st, rs);
                }
            
        return capto;
    }
    
    public float devendo(){
    float d = 0;
    conex();
    String sql = "select sum(valor) from dividas where situacao = 'Devendo' and cpfusuario = '"+cpf.retornar()+"';";
    PreparedStatement st = null;
    ResultSet rs = null;
    try{
        st = conexao.prepareStatement(sql);
        rs = st.executeQuery();
        while(rs.next()){
            d = rs.getFloat("sum(valor)");
        }
    }catch(SQLException ex){
        System.err.println("ERRO: "+ex);
    }finally{
        ConexaoSQL.fecharConexao(conexao, st, rs);
    }
    return d;
    }
    
    public float pago(){
    float d = 0;
    conex();
    String sql = "select sum(valor) from dividas where situacao = 'Pago' and cpfusuario = '"+cpf.retornar()+"';";
    PreparedStatement st = null;
    ResultSet rs = null;
    try{
        st = conexao.prepareStatement(sql);
        rs = st.executeQuery();
        while(rs.next()){
            d = rs.getFloat("sum(valor)");
        }
    }catch(SQLException ex){
        System.err.println("ERRO: "+ex);
    }finally{
        ConexaoSQL.fecharConexao(conexao, st, rs);
    }
    return d;
    }
    
    public float total(){
    float d = 0;
    conex();
    String sql = "select sum(valor) from dividas where cpfusuario = '"+cpf.retornar()+"';";
    PreparedStatement st = null;
    ResultSet rs = null;
    try{
        st = conexao.prepareStatement(sql);
        rs = st.executeQuery();
        while(rs.next()){
            d = rs.getFloat("sum(valor)");
        }
    }catch(SQLException ex){
        System.err.println("ERRO: "+ex);
    }finally{
        ConexaoSQL.fecharConexao(conexao, st, rs);
    }
    return d;
    }
   
    public String descricao(String cpf, String dat){
        conex();
        String r = null;
        System.out.println(cpf+dat);
        String sql = "select descricao from Dividas where cpfCliente = '"+cpf+"' and dataCompra = str_to_date(\""+dat+"\",\"%d/%m/%Y\") and situacao = 'Pago' and cpfusuario = '"+this.cpf.retornar()+"';";
        PreparedStatement st = null;
        ResultSet rs = null;
        try{
            st = conexao.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()){
                r = rs.getString("descricao");
            }            
        }catch(SQLException ex){
            System.err.println("ERRO: "+ex);
        }finally{
            ConexaoSQL.fecharConexao(conexao, st, null);
        }
        return r;
    }
            
    public void conex(){
       conexao = ConexaoSQL.getConexao();
   } 

}
