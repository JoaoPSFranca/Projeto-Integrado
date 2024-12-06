package br.edu.ifsp.pep.addadmin;

import br.edu.ifsp.pep.entity.Pessoa;
import br.edu.ifsp.pep.enuns.NivelAcesso;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/**
 *
 * @author Vongui
 */
public class main {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("meuPU");
        EntityManager em = emf.createEntityManager();

        try {
            em.getTransaction().begin();

            Pessoa admin = new Pessoa();
            admin.setCpf("1234");
            admin.setLogin("admin");
            admin.setSenha("admin");
            admin.setNome("Teste");
            admin.setTelefone("432423423");
            admin.setNivelAcesso(NivelAcesso.Administrador);

            em.persist(admin);

            em.getTransaction().commit();

            System.out.println("Admin persistido com sucesso!");

        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            e.printStackTrace();
        } finally {
            em.close();
            emf.close();
        }
    }

}
