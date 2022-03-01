package services.interfaces;

public interface CrudService<T> {

    public boolean cadastrar(T t);
    public boolean atualizar(Long id);
    public boolean excluir(Long id);
}
