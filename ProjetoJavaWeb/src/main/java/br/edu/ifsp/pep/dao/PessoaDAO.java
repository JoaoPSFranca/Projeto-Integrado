package br.edu.ifsp.pep.dao;

import br.edu.ifsp.pep.entity.Pessoa;
import br.edu.ifsp.pep.enuns.NivelAcesso;
import jakarta.ejb.Stateless;
import jakarta.persistence.NoResultException;
import jakarta.persistence.TypedQuery;
import java.util.List;

@Stateless
public class PessoaDAO extends AbstractDAO<Pessoa> {
    private NivelAcesso nivelAcesso;
    
    public Pessoa autenticar(String login, String senha){
        TypedQuery<Pessoa> query = em.createNamedQuery("Pessoa.autenticar", Pessoa.class);
        query.setParameter("login", login);
        query.setParameter("senha", senha);
        
        try {
            System.out.println("AUTENTICADO!!!");
            return query.getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }
    
    public List<Pessoa> buscarTodas(){
        return em.createNamedQuery("Pessoa.buscarTodas", Pessoa.class)
                .getResultList();  
    }
    
}
