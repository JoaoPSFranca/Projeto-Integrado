package br.edu.ifsp.pep.entity;

import br.edu.ifsp.pep.enuns.NivelAcesso;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Null;
import java.io.Serializable;
import java.util.List;


@Entity
@Table(name = "pessoa")

@NamedQueries({
        @NamedQuery(name = "Pessoa.autenticar", query = "SELECT p FROM Pessoa p WHERE p.login = :login AND p.senha = :senha"),
        @NamedQuery(name = "Pessoa.buscarTodas", query = "FROM Pessoa p")
})
public class Pessoa implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo")
    private int codigo;
    
    @Column(name = "nome", length = 150, nullable = false)
    private String nome;
    
    @Column(name = "telefone", length = 20, nullable = false)
    private String telefone;
    
    @Column(name = "cpf", length = 20, nullable = false)
    private String cpf;
    
    @Column(name = "nivel_acesso", nullable = false)
    @Enumerated(EnumType.STRING)
    private NivelAcesso nivelAcesso;
    
    @Column(name = "login", length = 50, nullable = false)
    private String login;
    
    @Column(name = "senha", length = 50, nullable = false)
    private String senha;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pessoa")
    @Null
    private List<Endereco> enderecos;

    public Pessoa(int codigo, String nome, String telefone, String cpf, NivelAcesso nivelAcesso, String login, String senha) {
        this.codigo = codigo;
        this.nome = nome;
        this.telefone = telefone;
        this.cpf = cpf;
        this.nivelAcesso = nivelAcesso;
        this.login = login;
        this.senha = senha;
    }

    public Pessoa() {
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public NivelAcesso getNivelAcesso() {
        return nivelAcesso;
    }

    public void setNivelAcesso(NivelAcesso nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }
    
}