package services;

import models.Categoria;
import models.data.CategoriaDao;
import services.interfaces.CrudService;

public class CategoriaService implements CrudService<Categoria> {

    private final CategoriaDao dao;

    public CategoriaService(CategoriaDao dao) {
        this.dao = dao;
    }

    @Override
    public boolean cadastrar(Categoria categoria) {
        dao.cadastrar(categoria);
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
