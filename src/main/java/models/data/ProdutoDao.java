package models.data;

import data.interfaces.EntityManagerConfig;
import models.Produto;

public class ProdutoDao {

    EntityManagerConfig<Produto> entityManager;

    public ProdutoDao(EntityManagerConfig<Produto> entityManager) {
        this.entityManager = entityManager;
    }

    public void cadastrarProduto(Produto produto) {
        this.entityManager.persist(produto);
    }

    public void atualizar(Produto produto) {

    }

}
