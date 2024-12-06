package br.edu.ifsp.pep.controller;

import br.edu.ifsp.pep.dao.ProdutoDAO;
import br.edu.ifsp.pep.entity.Produto;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import java.io.Serializable;
import java.util.List;

@Named
@ViewScoped
public class ProdutoController implements Serializable {
    @Inject
    private ProdutoDAO produtoDAO;
    
    private Produto produto = new Produto();
    private List<Produto> produtos;
    
    public List<Produto> getProdutos(){
        this.produtos = produtoDAO.buscarTodos();
        return produtos;
    }
}
