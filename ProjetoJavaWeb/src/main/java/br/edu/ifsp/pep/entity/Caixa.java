package br.edu.ifsp.pep.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "caixa")
public class Caixa implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo")
    private int codigo;
    
    @Column(name = "data_abertura", nullable = false)
    private Date dataAbertura;
    
    @Column(name = "data_fechamento", nullable = true)
    private Date dataFechamento;
    
    @Column(name = "saldo_inicial", nullable = false)
    private double saldoInicial;
    
    @Column(name = "saldo_final", nullable = true)
    private double saldoFinal;
    
    @Column(name = "saldo_atual", nullable = false)
    private double saldoAtual;
    
    @Column(name = "status_caixa", nullable = false)
    private boolean statusCaixa;

    public Caixa() {
    }

    public Caixa(int codigo, Date dataAbertura, Date dataFechamento, double saldoInicial, double saldoFinal, double saldoAtual, boolean statusCaixa) {
        this.codigo = codigo;
        this.dataAbertura = dataAbertura;
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

    public Date getDataAbertura() {
        return dataAbertura;
    }

    public void setDataabertura(Date dataAbertura) {
        this.dataAbertura = dataAbertura;
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
