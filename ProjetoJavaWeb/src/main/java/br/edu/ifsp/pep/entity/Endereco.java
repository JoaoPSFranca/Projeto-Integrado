package br.edu.ifsp.pep.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "endereco")
public class Endereco implements Serializable {
    
    @Id
    @Column(name = "cep", length = 20)
    private String cep;
    
    @Column(name = "logradouro",  nullable = false)
    private String logradouro;
    
    @Column(name = "numero",  nullable = false)
    private int numero;
    
    @ManyToOne(optional = false)
    @JoinColumn(name = "cliente_codigo", nullable = false)
    private Cliente cliente;

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
