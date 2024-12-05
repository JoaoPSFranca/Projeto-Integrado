package br.edu.ifsp.pep.entity;

import java.util.Date;

public class Movimento {
    
    private int codigo;
    
    private String descricao;
    
    private Date data;
    
    private double valor;

    public Movimento() {
    }

    public Movimento(int codigo, String descricao, Date data, double valor) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.data = data;
        this.valor = valor;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    
    
}
