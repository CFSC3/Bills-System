package model.dao;

import conexao.ConexaoSQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.bean.CadastroCliente;
import model.bean.Login;

public class CadastroClienteDao {

    private Connection conexao = null;
    private Login cpf;
    private CpfDao dao = new CpfDao();
    private String a;
    private String b;
    private String c;
    private String d;
    private String e;
    private int f;
    private String g;
    private String h;

    public CadastroClienteDao() {

    }

    public boolean inserir(CadastroCliente cliente) {

        conex();

        String sql = "Insert into Cliente values('" + cliente.getNome() + "','" + cliente.getCpf() + "',str_to_date(\"" + cliente.getDataNascimento() + "\",\"%d/%m/%Y\"),'" + cliente.getEmail() + "','" + cliente.getEndereco() + "'," + cliente.getDdd() + "," + cliente.getTelefone() + "," + cliente.getCelular() + ",'" + dao.retornar() + "');";
        String sql2 = "Insert into FormularioCliente values('" + cliente.getNome() + "','','',str_to_date(\"01/01/2019\",\"%d/%m/%Y\"),'" + cliente.getCpf() + "','" + dao.retornar() + "');";
        PreparedStatement st2 = null;
        PreparedStatement st = null;

        try {
            st = conexao.prepareStatement(sql);
            st2 = conexao.prepareStatement(sql2);
            st.executeUpdate();
            st2.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.err.println("Erro: " + ex);
            return false;
        } finally {
            ConexaoSQL.fecharConexao(conexao, st);
        }

    }

    public boolean excluir(CadastroCliente cliente) {

        conex();

        String sql = "delete from Cliente where cpf = " + cliente.getCpf() + ";";

        PreparedStatement st = null;

        try {
            st = conexao.prepareStatement(sql);
            st.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.err.println("Erro: " + ex);
            return false;
        } finally {
            ConexaoSQL.fecharConexao(conexao, st);
        }
    }

    public boolean atualizar(CadastroCliente cliente) {

        conex();

        String sql = "Update Cliente set email = '" + cliente.getEmail() + "', endereco = '" + cliente.getEndereco() + "', ddd = " + cliente.getDdd() + ", telefone = '" + cliente.getTelefone() + "', celular = '" + cliente.getCelular() + "' where cpf = '" + cliente.getCpf() + "';";

        PreparedStatement st = null;

        try {
            st = conexao.prepareStatement(sql);
            st.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.err.println("Erro: " + ex);
            return false;
        } finally {
            ConexaoSQL.fecharConexao(conexao, st);
        }
    }

    public String nome(String cpf){
    String nome = null;
    conex();
    String sql = "select nome from Cliente where cpf = '"+cpf+"' and cpfusuario = '"+dao.retornar()+"';";
    PreparedStatement st = null;
    ResultSet rs = null;
    try{
        st= conexao.prepareStatement(sql);
        rs = st.executeQuery();
        while(rs.next()){
            nome = rs.getString("nome");
        }
    }catch(SQLException ex){
        System.err.println("ERRO: "+ex);
    }finally{
        ConexaoSQL.fecharConexao(conexao, st, rs);
    }
    return nome;
    }
    
    public void conex() {
        conexao = ConexaoSQL.getConexao();
    }

    public boolean cliente(String cpf) {
        conex();
        String sql = "select nome,cpf,date_format(dataNascimento,\"%d/%m/%Y\"),email,endereco,ddd,telefone,celular from Cliente where cpf = '" + cpf + "' and cpfusuario = '" + dao.retornar() + "';";
        PreparedStatement st = null;
        ResultSet rs = null;

        try {
            st = conexao.prepareStatement(sql);
            rs = st.executeQuery();
            while (rs.next()) {
                a = rs.getString("nome");
                b = rs.getString("cpf");
                c = rs.getString("date_format(dataNascimento,\"%d/%m/%Y\")");
                d = rs.getString("email");
                e = rs.getString("endereco");
                f = rs.getInt("ddd");
                g = rs.getString("telefone");
                h = rs.getString("celular");           
            }
            return true;
        } catch (SQLException ex) {
            System.err.println("ERRO: " + ex);
            return false;
        } finally {
            ConexaoSQL.fecharConexao(conexao, st, rs);
        }
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    public String getD() {
        return d;
    }

    public void setD(String d) {
        this.d = d;
    }

    public String getE() {
        return e;
    }

    public void setE(String e) {
        this.e = e;
    }

    public int getF() {
        return f;
    }

    public void setF(int f) {
        this.f = f;
    }

    public String getG() {
        return g;
    }

    public void setG(String g) {
        this.g = g;
    }

    public String getH() {
        return h;
    }

    public void setH(String h) {
        this.h = h;
    }
    
}
