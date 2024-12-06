package br.edu.ifsp.pep.entity;

import br.edu.ifsp.pep.enuns.MetodoEntrega;
import br.edu.ifsp.pep.enuns.MetodoPagamento;
import br.edu.ifsp.pep.enuns.StatusPedido;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "pedido")
public class Pedido implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo")
    private int codigo;
    
    @Column(name = "observacao", nullable = false)
    private String observacao;
    
    @Column(name = "valor_total", nullable = false)
    private double valorTotal;
    
    @Column(name = "data_pedido", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataPedido;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pedido")
    private List<ItemPedido> listaPedido;
    
    @Enumerated(EnumType.STRING)
    @Column(name = "metodo_pagamento", nullable = false)
    private MetodoPagamento metodoPagamento;
    
    @Enumerated(EnumType.STRING)
    @Column(name = "metodo_entrega", nullable = false)
    private MetodoEntrega metodoEntrega;
    
    @Column(name = "valor_frete", nullable = false)
    private double valorFrete;
    
    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false)
    private StatusPedido status;
    
    @JoinColumn(name = "pessoa_codigo",nullable = false)
    private Pessoa pessoa;

    public Pedido() {
    }

    public Pedido(int codigo, String observacao, double valorTotal, Date dataPedido, MetodoPagamento metodoPagamento, MetodoEntrega metodoEntrega, double valorFrete, StatusPedido status, Pessoa pessoa) {
        this.codigo = codigo;
        this.observacao = observacao;
        this.valorTotal = valorTotal;
        this.dataPedido = dataPedido;
        this.metodoPagamento = metodoPagamento;
        this.metodoEntrega = metodoEntrega;
        this.valorFrete = valorFrete;
        this.status = status;
        this.pessoa = pessoa;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Date getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(Date dataPedido) {
        this.dataPedido = dataPedido;
    }

    public List<ItemPedido> getListaPedido() {
        return listaPedido;
    }

    public void setListaPedido(List<ItemPedido> listaPedido) {
        this.listaPedido = listaPedido;
    }

    public MetodoPagamento getMetodoPagamento() {
        return metodoPagamento;
    }

    public void setMetodoPagamento(MetodoPagamento metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }

    public MetodoEntrega getMetodoEntrega() {
        return metodoEntrega;
    }

    public void setMetodoEntrega(MetodoEntrega metodoEntrega) {
        this.metodoEntrega = metodoEntrega;
    }

    public double getValorFrete() {
        return valorFrete;
    }

    public void setValorFrete(double valorFrete) {
        this.valorFrete = valorFrete;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setCliente(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + this.codigo;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pedido other = (Pedido) obj;
        return this.codigo == other.codigo;
    }
    
    
}
