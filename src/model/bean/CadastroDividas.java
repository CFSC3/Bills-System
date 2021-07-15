
package model.bean;

import java.util.Date;

public class CadastroDividas {

    private String nome;
    private String cpf;
    private double valor;
    private String formaDePagamento;
    private int parcelamento;
    private String dataCompra;
    private String dataVencimento;
    private String descricao;
    private String situacao;

    public CadastroDividas() {
    }

    public CadastroDividas(String nome, String cpf, double valor, String formaDePagamento, int parcelamento, String dataCompra, String dataVencimento, String descricao, String situacao) {
        this.nome = nome;
        this.cpf = cpf;
        this.valor = valor;
        this.formaDePagamento = formaDePagamento;
        this.parcelamento = parcelamento;
        this.dataCompra = dataCompra;
        this.dataVencimento = dataVencimento;
        this.descricao = descricao;
        this.situacao = situacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getFormaDePagamento() {
        return formaDePagamento;
    }

    public void setFormaDePagamento(String formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }

    public int getParcelamento() {
        return parcelamento;
    }

    public void setParcelamento(int parcelamento) {
        this.parcelamento = parcelamento;
    }

    public String getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(String dataCompra) {
        this.dataCompra = dataCompra;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
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

    
    @Override
    public String toString() {
        return  getNome() + getDescricao() + "" + getParcelamento()+ "" + getValor() + getDataVencimento() + getSituacao();
    }
  
}
