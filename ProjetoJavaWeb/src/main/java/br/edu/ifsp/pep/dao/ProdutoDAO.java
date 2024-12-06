package br.edu.ifsp.pep.dao;

import br.edu.ifsp.pep.entity.Produto;
import jakarta.ejb.Stateless;
import java.util.List;

@Stateless
public class ProdutoDAO extends AbstractDAO {
    public List<Produto> buscarTodos(){
        return em.createNamedQuery("Produto.buscarTodos", Produto.class).getResultList();
    }
}
