import data.CategoriaEntityManager;
import data.ProdutoEntityManager;
import models.Categoria;
import models.Produto;
import models.data.CategoriaDao;
import models.data.ProdutoDao;
import models.enums.StatusProduto;
import services.ProdutoService;
import utils.UtilConversorData;

import java.time.LocalDate;

public class MainCadastraProduto {

    public static void main(String[] args) {

        Produto produto = new Produto();
        Categoria categoria = new Categoria("Livro");

        produto.setNome("Hibernate na Prática");
        produto.setDescricao("Hibernate com prática");
        produto.setPreco(56.90);
        produto.setQtdEstoque(150);
        produto.setStatusProduto(StatusProduto.PRATELEIRA);
        produto.setDataCadastro(LocalDate.now());
        produto.setCategoria(categoria);

//      CategoriaDao categoriaDao = new CategoriaDao(new CategoriaEntityManager());
//      categoriaDao.cadastrar(categoria);

        ProdutoService produtoService = new ProdutoService(new ProdutoDao(new ProdutoEntityManager()));

    }
}
