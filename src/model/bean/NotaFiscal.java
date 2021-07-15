
package model.bean;

import java.util.Calendar;

public class NotaFiscal {
 
   private String numeroDeSerie;
   private String nomeCliente;
   private String cpfCliente;
   private String dataPagamento;
   private double valorPago;
   private String descricao;
   private int parcelamento;

    public NotaFiscal() {
    }

    public NotaFiscal(String numeroDeSerie, String nomeCliente, String cpfCliente, String dataPagamento, double valorPago, String descricao, int parcelamento) {
        this.numeroDeSerie = numeroDeSerie;
        this.nomeCliente = nomeCliente;
        this.cpfCliente = cpfCliente;
        this.dataPagamento = dataPagamento;
        this.valorPago = valorPago;
        this.descricao = descricao;
        this.parcelamento = parcelamento;
    }

    public NotaFiscal(String numeroDeSerie, String nomeCliente, String cpfCliente, double valorPago, String descricao, int parcelamento) {
        this.numeroDeSerie = numeroDeSerie;
        this.nomeCliente = nomeCliente;
        this.cpfCliente = cpfCliente;
        this.valorPago = valorPago;
        this.descricao = descricao;
        this.parcelamento = parcelamento;
    }

    public NotaFiscal(String numeroDeSerie) {
        this.numeroDeSerie = numeroDeSerie;
    }

    public String getNumeroDeSerie() {
        return numeroDeSerie;
    }

    public void setNumeroDeSerie(String numeroDeSerie) {
        this.numeroDeSerie = numeroDeSerie;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public String getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(String dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public double getValorPago() {
        return valorPago;
    }

    public void setValorPago(double valorPago) {
        this.valorPago = valorPago;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getParcelamento() {
        return parcelamento;
    }

    public void setParcelamento(int parcelamento) {
        this.parcelamento = parcelamento;
    }

    @Override
    public String toString() {
        return getNumeroDeSerie() + getNomeCliente() + getDescricao() + getDataPagamento();
    }
    
    
}

