package models.data;

import data.interfaces.EntityManagerConfig;
import models.Categoria;

public class CategoriaDao {

    private final EntityManagerConfig<Categoria> entityManager;

    public CategoriaDao(EntityManagerConfig<Categoria> categoriaDao) {
        this.entityManager = categoriaDao;
    }

    public void cadastrar(Categoria categoria){
        this.entityManager.persist(categoria);
    }

}
