package br.edu.ifsp.pep.entity;

import br.edu.ifsp.pep.enuns.NivelAcesso;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import java.util.List;

@Entity
@Table(name = "cliente")
@PrimaryKeyJoinColumn(name = "pessoa_codigo")
public class Cliente extends Pessoa {
    @OneToMany(mappedBy = "cliente")
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

