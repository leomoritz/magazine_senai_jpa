package models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import models.enums.StatusProduto;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "produtos")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String descricao;

    private Double preco;

    @Column(name = "qtd_estoque")

    private Integer qtdEstoque;

    @Column(name = "status_produto")
    @Enumerated(EnumType.STRING)
    private StatusProduto statusProduto;

    @Column(name = "data_cadastro")
    private LocalDate dataCadastro;

    @ManyToOne //Produtos só podem ter uma categoria (uma categoria pode estar em vários produtos)
    private Categoria categoria;

}
