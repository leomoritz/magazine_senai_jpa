package data;

import data.interfaces.EntityManagerConfig;
import models.Categoria;
import data.utils.JPAUtil;
import models.Produto;

import javax.persistence.EntityManager;
import java.util.List;

public class CategoriaEntityManager implements EntityManagerConfig<Categoria> {

    private EntityManager entityManager;

    public CategoriaEntityManager() {
        createEntityManager();
    }

    @Override
    public void createEntityManager() {
        this.entityManager = JPAUtil.getEntityManager();
    }

    @Override
    public Categoria findById(Long id) {
        return this.entityManager.find(Categoria.class, id);
    }

    @Override
    public List<Categoria> findAll() {
        String jpql = "SELECT c FROM Categoria c";
        return entityManager.createQuery(jpql, Categoria.class).getResultList();
    }

    @Override
    public void persist(Categoria categoria) {
        this.entityManager.getTransaction().begin();
        this.entityManager.persist(categoria);
        this.entityManager.getTransaction().commit();
        this.entityManager.close();
    }

    @Override
    public void merge(Categoria categoria) {
        this.entityManager.getTransaction().begin();
        this.entityManager.merge(categoria);
        this.entityManager.getTransaction().commit();
        this.entityManager.close();
    }

    @Override
    public void remove(Long id){
        this.entityManager.getTransaction().begin();
        Categoria categoria = this.findById(id);
        this.entityManager.remove(categoria);
        this.entityManager.getTransaction().commit();
        this.entityManager.close();
    }

}
