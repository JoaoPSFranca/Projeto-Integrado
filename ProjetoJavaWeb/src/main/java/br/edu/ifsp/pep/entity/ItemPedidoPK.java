package br.edu.ifsp.pep.entity;

import jakarta.persistence.Column;
import java.io.Serializable;

public class ItemPedidoPK implements Serializable{
    
    @Column(name = "produto_id", nullable = false)
    private int produto;
    
    @Column(name = "pedido_id", nullable = false)
    private int pedido;

    public ItemPedidoPK() {
    }

    public ItemPedidoPK(int produto, int pedido) {
        this.produto = produto;
        this.pedido = pedido;
    }

    public int getProduto() {
        return produto;
    }

    public void setProduto(int produto) {
        this.produto = produto;
    }

    public int getPedido() {
        return pedido;
    }

    public void setPedido(int pedido) {
        this.pedido = pedido;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.produto;
        hash = 29 * hash + this.pedido;
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
        final ItemPedidoPK other = (ItemPedidoPK) obj;
        if (this.produto != other.produto) {
            return false;
        }
        return this.pedido == other.pedido;
    }
    
    
    
}
