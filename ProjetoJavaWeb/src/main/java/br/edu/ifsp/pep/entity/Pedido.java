package br.edu.ifsp.pep.entity;

import br.edu.ifsp.pep.enuns.MetodoEntrega;
import br.edu.ifsp.pep.enuns.MetodoPagamento;
import br.edu.ifsp.pep.enuns.StatusPedido;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "pedido")
public class Pedido {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo")
    private int codigo;
    
    private String observacao;
    
    private double valorTotal;
    
    private Date dataPedido;
    
    private List<Produto> listaPedido;
    
    private MetodoPagamento metodoPagamento;
    
    private MetodoEntrega metodoEntrega;
    
    private double valorFrete;
    
    private StatusPedido status;
    
    private Cliente cliente;

    public Pedido() {
    }

    public Pedido(int codigo, String observacao, double valorTotal, Date dataPedido, List<Produto> listaPedido, MetodoPagamento metodoPagamento, MetodoEntrega metodoEntrega, double valorFrete, StatusPedido status, Cliente cliente) {
        this.codigo = codigo;
        this.observacao = observacao;
        this.valorTotal = valorTotal;
        this.dataPedido = dataPedido;
        this.listaPedido = listaPedido;
        this.metodoPagamento = metodoPagamento;
        this.metodoEntrega = metodoEntrega;
        this.valorFrete = valorFrete;
        this.status = status;
        this.cliente = cliente;
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

    public List<Produto> getListaPedido() {
        return listaPedido;
    }

    public void setListaPedido(List<Produto> listaPedido) {
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

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    
    
}
