
package model.dao;

import conexao.ConexaoSQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import model.bean.NotaFiscal;

public class NotaFiscalDao {
 
    private Connection conexao = null;
    private CpfDao cpf = new CpfDao();
    private NotaFiscal nof = new NotaFiscal();
    
    private String numeroDeSerie;
    private String nome;        
    private String cpf2;
    private String descricao;
    private String dataVencimento;
    private Double valor;
    private int parcelamento;       
            
    public NotaFiscalDao() {
       
    }
    
    public boolean inserir(NotaFiscal nf){
              
         Date data = new Date(); 
         Calendar cal = Calendar.getInstance(); 
         cal.setTime(data); 
         int dia = cal.get(Calendar.DAY_OF_MONTH); 
         int mes = cal.get(Calendar.MONTH)+1; 
         int ano = cal.get(Calendar.YEAR);
         
        conex();
        
        String sql = "insert into NotasFiscais values('"+nf.getNumeroDeSerie()+"','"+nf.getNomeCliente()+"','"+nf.getCpfCliente()+"','"+nf.getDescricao()+"',str_to_date(\""+dia+"/"+mes+"/"+ano+"\",\"%d/%m/%Y\"),"+nf.getValorPago()+","+nf.getParcelamento()+",'"+cpf.retornar()+"');";
        
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
    
    public ArrayList<NotaFiscal> read(){
        
        conex();
        PreparedStatement st = null;
        ResultSet rs = null;
        
        ArrayList<NotaFiscal> capto = new ArrayList<>();
        
        try{
            st = conexao.prepareStatement("Select numeroDeSerie, nomeClientes, descricao,date_format(dataPagamento,\"%d/%m/%Y\") from NotasFiscais where cpfusuario = '"+cpf.retornar()+"' order by dataPagamento desc;");
            rs = st.executeQuery();
            while(rs.next()){
                NotaFiscal captos = new NotaFiscal();
                captos.setNumeroDeSerie(rs.getString("numeroDeSerie"));
                captos.setNomeCliente(rs.getString("nomeClientes"));
                captos.setDescricao(rs.getString("descricao"));
                captos.setDataPagamento(rs.getString("date_format(dataPagamento,\"%d/%m/%Y\")"));
                capto.add(captos);
            }
            }catch(SQLException ex){
                    System.err.println("Erro: "+ex);         
               }finally{
                     ConexaoSQL.fecharConexao(conexao, st, rs);
                }
            
        return capto;
    }
    
    public boolean listar(NotaFiscal nf){
        
        conex();
        
        String sql = "Select numeroDeSerie, nomeClientes, cpfCliente, descricao, date_format(dataPagamento,\"%d/%m/%Y\"), valorPago, parcelamento from NotasFiscais where cpfusuario = '"+cpf.retornar()+"' and numeroDeSerie = '"+nf.getNumeroDeSerie()+"';";
        PreparedStatement st = null;
        ResultSet rs = null;
        
        try{
            st = conexao.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()){
                numeroDeSerie = rs.getString("numeroDeSerie");
                nome = rs.getString("nomeClientes");
                cpf2 = rs.getString("cpfCliente");
                descricao = rs.getString("descricao");
                dataVencimento = rs.getString("date_format(dataPagamento,\"%d/%m/%Y\")");
                valor = rs.getDouble("valorPago");
                parcelamento = rs.getInt("parcelamento");
            }
            return true;
        }catch(SQLException ex){
            System.err.println("Erro: "+ex);
            return false;
        }finally{
            ConexaoSQL.fecharConexao(conexao, st, rs);
        }
    }
    
     public ArrayList<NotaFiscal> pesquisaNome(String nome){
    conex();
        PreparedStatement st = null;
        ResultSet rs = null;
        
        ArrayList<NotaFiscal> capto = new ArrayList<>();
        
        try{
            st = conexao.prepareStatement("Select numeroDeSerie, nomeClientes, descricao,dataPagamento from NotasFiscais where nomeClientes like '"+ nome +"%' order by nomeClientes asc;");
            rs = st.executeQuery();
            while(rs.next()){
                NotaFiscal captos = new NotaFiscal();
                captos.setNumeroDeSerie(rs.getString("numeroDeSerie"));
                captos.setNomeCliente(rs.getString("nomeClientes"));
                captos.setDescricao(rs.getString("descricao"));
                captos.setDataPagamento(rs.getString("dataPagamento"));
                capto.add(captos);
            }
            }catch(SQLException ex){
                    System.err.println("Erro: "+ex);         
               }finally{
                     ConexaoSQL.fecharConexao(conexao, st, rs);
                }
            
        return capto;
    }

    public String getNumeroDeSerie() {
        return numeroDeSerie;
    }

    public void setNumeroDeSerie(String numeroDeSerie) {
        this.numeroDeSerie = numeroDeSerie;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf2() {
        return cpf2;
    }

    public void setCpf2(String cpf2) {
        this.cpf2 = cpf2;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public int getParcelamento() {
        return parcelamento;
    }

    public void setParcelamento(int parcelamento) {
        this.parcelamento = parcelamento;
    }
    
    
    
    public void conex(){
        conexao = ConexaoSQL.getConexao();
    }
}
