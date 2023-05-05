package br.com.fiap.spring.entity;

import javax.persistence.*;

@Entity
@Table(name = "tbl_carrinho")
public class CarrinhoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idCarrinho;

    @ManyToOne
    @JoinColumn (name = "id_produto")
    private ProdutoEntity Produto;

    @Column
    private Integer quantidade;

    public Integer getIdCarrinho() {
        return idCarrinho;
    }

    public ProdutoEntity getProduto() {
        return Produto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
}
