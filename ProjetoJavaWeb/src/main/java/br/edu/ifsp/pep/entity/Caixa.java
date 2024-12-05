package br.edu.ifsp.pep.entity;

import java.util.Date;

public class Caixa {
    
    private int codigo;
    
    private Date dataabertura;
    
    private Date dataFechamento;
    
    private double saldoInicial;
    
    private double saldoFinal;
    
    private double saldoAtual;
    
    private boolean statusCaixa;

    public Caixa() {
    }

    public Caixa(int codigo, Date dataabertura, Date dataFechamento, double saldoInicial, double saldoFinal, double saldoAtual, boolean statusCaixa) {
        this.codigo = codigo;
        this.dataabertura = dataabertura;
        this.dataFechamento = dataFechamento;
        this.saldoInicial = saldoInicial;
        this.saldoFinal = saldoFinal;
        this.saldoAtual = saldoAtual;
        this.statusCaixa = statusCaixa;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Date getDataabertura() {
        return dataabertura;
    }

    public void setDataabertura(Date dataabertura) {
        this.dataabertura = dataabertura;
    }

    public Date getDataFechamento() {
        return dataFechamento;
    }

    public void setDataFechamento(Date dataFechamento) {
        this.dataFechamento = dataFechamento;
    }

    public double getSaldoInicial() {
        return saldoInicial;
    }

    public void setSaldoInicial(double saldoInicial) {
        this.saldoInicial = saldoInicial;
    }

    public double getSaldoFinal() {
        return saldoFinal;
    }

    public void setSaldoFinal(double saldoFinal) {
        this.saldoFinal = saldoFinal;
    }

    public double getSaldoAtual() {
        return saldoAtual;
    }

    public void setSaldoAtual(double saldoAtual) {
        this.saldoAtual = saldoAtual;
    }

    public boolean isStatusCaixa() {
        return statusCaixa;
    }

    public void setStatusCaixa(boolean statusCaixa) {
        this.statusCaixa = statusCaixa;
    }
    
    
    
}
