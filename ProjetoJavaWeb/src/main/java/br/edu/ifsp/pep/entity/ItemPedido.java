package br.edu.ifsp.pep.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "item_pedido")
@IdClass(ItemPedidoPK.class)
public class ItemPedido implements Serializable{

    @Column(name = "quantidade", nullable = false)
    private int quantidade;
    
    @Column(name = "preco", nullable = false)
    private double preco;
    
    @Id
    @ManyToOne(optional = false)
    @JoinColumn(name = "produto_id", referencedColumnName = "codigo", nullable = false)
    private Produto produto;

    @Id
    @ManyToOne(optional = false)
    @JoinColumn(name = "pedido_id", referencedColumnName = "codigo", nullable = false)
    private Pedido pedido;

    public ItemPedido() {
    }

    public ItemPedido(int quantidade, double preco, Produto produto, Pedido pedido) {
        this.quantidade = quantidade;
        this.preco = preco;
        this.produto = produto;
        this.pedido = pedido;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.produto);
        hash = 89 * hash + Objects.hashCode(this.pedido);
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
        final ItemPedido other = (ItemPedido) obj;
        if (!Objects.equals(this.produto, other.produto)) {
            return false;
        }
        return Objects.equals(this.pedido, other.pedido);
    }

    

}
