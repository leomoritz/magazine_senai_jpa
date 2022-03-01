package data;

import data.interfaces.EntityManagerConfig;
import models.Produto;
import data.utils.JPAUtil;

import javax.persistence.EntityManager;
import java.util.List;

public class ProdutoEntityManager implements EntityManagerConfig<Produto> {

    private EntityManager entityManager;

    public ProdutoEntityManager() {
        createEntityManager();
    }

    @Override
    public void createEntityManager() {
        this.entityManager = JPAUtil.getEntityManager();
    }

    @Override
    public Produto findById(Long id) {
        return this.entityManager.find(Produto.class, id);
    }

    @Override
    public List<Produto> findAll() {
        String jpql = "SELECT p FROM Produto p";
        return entityManager.createQuery(jpql, Produto.class).getResultList();
    }

    @Override
    public void persist(Produto produto) {
        this.entityManager.getTransaction().begin();
        this.entityManager.persist(produto);
        this.entityManager.getTransaction().commit();
        this.entityManager.close();
    }

    @Override
    public void merge(Produto produto) {
        this.entityManager.getTransaction().begin();
        this.entityManager.merge(produto);
        this.entityManager.getTransaction().commit();
        this.entityManager.close();
    }

    @Override
    public void remove(Long id) {
        this.entityManager.getTransaction().begin();
        Produto produto = this.findById(id);
        this.entityManager.remove(produto);
        this.entityManager.getTransaction().commit();
        this.entityManager.close();
    }
}
