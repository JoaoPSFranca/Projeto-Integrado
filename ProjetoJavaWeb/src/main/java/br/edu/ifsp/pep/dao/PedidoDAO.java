package br.edu.ifsp.pep.dao;

import br.edu.ifsp.pep.entity.Pedido;
import jakarta.ejb.Stateless;
import java.util.List;

@Stateless
public class PedidoDAO extends AbstractDAO<Pedido> {
    public List<Pedido> buscarTodos(){
        return em.createNamedQuery("Pedido.buscarTodos", Pedido.class).getResultList();
    }
}
