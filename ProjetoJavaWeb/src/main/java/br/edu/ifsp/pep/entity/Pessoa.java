package br.edu.ifsp.pep.entity;

import br.edu.ifsp.pep.enuns.NivelAcesso;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

public abstract class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo")
    private int codigo;
    
    private String nome;
    
    private String telefone;
    
    private String cpf;
    
    private NivelAcesso nivelAcesso;
    
    private String login;
    
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
    
    
}