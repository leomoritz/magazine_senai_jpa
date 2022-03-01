package data.interfaces;

import models.Categoria;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.util.List;

public interface EntityManagerConfig<T> {

    public void createEntityManager();
    public T findById(Long id);
    public List<T> findAll();
    public void persist(T t);
    public void merge(T t);
    public void remove(Long id);

}
