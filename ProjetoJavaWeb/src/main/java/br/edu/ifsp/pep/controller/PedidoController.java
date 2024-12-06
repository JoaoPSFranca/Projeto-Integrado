package br.edu.ifsp.pep.controller;

import br.edu.ifsp.pep.dao.PedidoDAO;
import br.edu.ifsp.pep.entity.ItemPedido;
import br.edu.ifsp.pep.entity.Pedido;
import br.edu.ifsp.pep.entity.Produto;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Named
@ViewScoped
public class PedidoController implements Serializable {
    @Inject
    private PedidoDAO pedidoDAO;
    
    private Pedido pedido = new Pedido();
    private List<Pedido> pedidos;

    public PedidoController() {
    }
    
    public List<Pedido> getPedidos() {
        this.pedidos = pedidoDAO.buscarTodos();
        return this.pedidos;
    }
    
    public void sumItemPedido(Produto p){
        int flag = 0;
        
        if(pedido.getListaPedido() != null){
           for (ItemPedido ip : pedido.getListaPedido()) {
                if (ip.getProduto().getCodigo() == p.getCodigo()){
                    flag = pedido.getListaPedido().indexOf(ip);
                }
            }
        } else {
            pedido.setListaPedido(new ArrayList<>());
        }
        
        ItemPedido item;
        
        if (flag == 0){
            item = new ItemPedido(1, p.getValor(),  p, pedido);
            pedido.getListaPedido().add(item);
        } else {
            item = pedido.getListaPedido().get(flag);
            item.setQuantidade(item.getQuantidade() + 1);
            item.setPreco(item.getQuantidade() * item.getProduto().getValor());
            pedido.getListaPedido().set(flag, item);
        }
    }

    public void decreaseItemPedido(Produto p){
        int flag = 0;
        
        if(pedido.getListaPedido() != null){
           for (ItemPedido ip : pedido.getListaPedido()) {
                if (ip.getProduto().getCodigo() == p.getCodigo()){
                    flag = pedido.getListaPedido().indexOf(ip);
                }
           }
        } else {
            pedido.setListaPedido(new ArrayList<>());
        }
        
        ItemPedido item;
        
        if (flag != 0){
            item = pedido.getListaPedido().get(flag);
            
            if (item.getQuantidade() != 0){
                item.setQuantidade(item.getQuantidade() - 1);
                item.setPreco(item.getQuantidade() * item.getProduto().getValor());
                pedido.getListaPedido().set(flag, item);
            }
        }
    }

    public int getQuantidadeItemPedido(Produto p){
        int flag = 0;
        
        if(pedido.getListaPedido() != null){
           for (ItemPedido ip : pedido.getListaPedido()) {
                if (ip.getProduto().getCodigo() == p.getCodigo()){
                    flag = pedido.getListaPedido().indexOf(ip);
                }
            }
        } else {
            pedido.setListaPedido(new ArrayList<>());
        }
        
        ItemPedido item;
        
        if (flag != 0){
            item = pedido.getListaPedido().get(flag);
            return item.getQuantidade();
        } else
            return 0;
    }

    public double getValorTotal(){
        double sum = 0.00;
        
        if (pedido.getListaPedido() != null) 
            for (ItemPedido  ip: pedido.getListaPedido()) 
                sum += ip.getPreco();
        
        return sum;
    }
    
    public int getQuantidadeTotal(){
        int sum = 0;
        
        if (pedido.getListaPedido() != null) 
            for (ItemPedido  ip: pedido.getListaPedido()) 
                sum += ip.getQuantidade();
        
        return sum;
    }

    
}
