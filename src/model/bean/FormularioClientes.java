
package model.bean;


public class FormularioClientes {
    
    private String nomeCliente;
    private String descricao;        
    private String situacao;
    private String dataUltimaCompra;
    private String cpf;

    public FormularioClientes() {
    }

    public FormularioClientes(String nomeCliente, String descricao, String situacao, String dataUltimaCompra, String cpf) {
        this.nomeCliente = nomeCliente;
        this.descricao = descricao;
        this.situacao = situacao;
        this.dataUltimaCompra = dataUltimaCompra;
        this.cpf = cpf;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getDataUltimaCompra() {
        return dataUltimaCompra;
    }

    public void setDataUltimaCompra(String dataUltimaCompra) {
        this.dataUltimaCompra = dataUltimaCompra;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return  getNomeCliente() + getDescricao() + getSituacao() + getDataUltimaCompra();
    }   
    
}
