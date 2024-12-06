package br.edu.ifsp.pep.entity;

import br.edu.ifsp.pep.enuns.NivelAcesso;
import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorType;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "pessoa")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorValue(value = "PESSOA_CLIENTE")
@DiscriminatorColumn(name = "tipo", discriminatorType = DiscriminatorType.STRING)
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
}