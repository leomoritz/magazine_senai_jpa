package services;

import models.Produto;
import models.data.ProdutoDao;
import services.interfaces.CrudService;

public class ProdutoService implements CrudService<Produto> {

    private final ProdutoDao dao;

    public ProdutoService(ProdutoDao dao) {
        this.dao = dao;
    }

    @Override
    public boolean cadastrar(Produto produto) {
        dao.cadastrarProduto(produto);
        return true;
    }

    @Override
    public boolean atualizar(Long id) {
        return false;
    }

    @Override
    public boolean excluir(Long id) {
        return false;
    }
}
