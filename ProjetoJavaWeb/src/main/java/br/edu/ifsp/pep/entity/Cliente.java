package br.edu.ifsp.pep.entity;

import br.edu.ifsp.pep.enuns.NivelAcesso;
import java.util.List;


public class Cliente extends Pessoa{
    
    private List<Endereco> enderecos;

    public Cliente(List<Endereco> enderecos, int codigo, String nome, String telefone, String cpf, NivelAcesso nivelAcesso, String login, String senha) {
        super(codigo, nome, telefone, cpf, nivelAcesso, login, senha);
        this.enderecos = enderecos;
    }

    public Cliente() {
    }
    
    
    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }
    
    
}

