package br.edu.ifsp.pep.controller;

import br.edu.ifsp.pep.dao.PessoaDAO;
import br.edu.ifsp.pep.entity.Pessoa;
import br.edu.ifsp.pep.enuns.NivelAcesso;
import br.edu.ifsp.pep.util.Mensagem;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import java.io.Serializable;
import java.util.List;


@Named
@SessionScoped
public class PessoaController implements Serializable{
    
    @Inject
    private PessoaDAO pessoaDAO;
    
    @Inject
    private LoginController lg;
    
    private Pessoa pessoa = new Pessoa();
    private Pessoa pessoaSelecionada;
    private List<Pessoa> pessoas;

    public PessoaController() {
    }
    
    public String adicionar() {
        System.out.println("Método adicionar");

        pessoaDAO.inserir(pessoa);
        
        pessoas = null;

        this.pessoa = new Pessoa();
        
        Mensagem.sucesso("Pessoa cadastrada.");
        
        return null;
    }
    
    public String cadastroCliente(){
        
        this.pessoa.setNivelAcesso(NivelAcesso.Cliente);
        pessoaDAO.inserir(pessoa);
        
        lg.setPessoa(pessoa);
        
        return lg.autenticar();
    }

    public PessoaDAO getPessoaDAO() {
        return pessoaDAO;
    }

    public void setPessoaDAO(PessoaDAO pessoaDAO) {
        this.pessoaDAO = pessoaDAO;
    }

    public LoginController getLg() {
        return lg;
    }

    public void setLg(LoginController lg) {
        this.lg = lg;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Pessoa getPessoaSelecionada() {
        return pessoaSelecionada;
    }

    public void setPessoaSelecionada(Pessoa pessoaSelecionada) {
        this.pessoaSelecionada = pessoaSelecionada;
    }

    public List<Pessoa> getPessoas() {
        return pessoas;
    }

    public void setPessoas(List<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }
}
