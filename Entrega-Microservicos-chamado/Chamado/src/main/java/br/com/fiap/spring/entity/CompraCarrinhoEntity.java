package br.com.fiap.spring.entity;


import javax.persistence.*;

@Entity
@Table(name = "tbl_compraCarrinho")
public class CompraCarrinhoEntity {

    @Id
    @Column(name = "id_compra_carrinho")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idCompraCarrinho;

    @ManyToOne
    @JoinColumn (name = "id_compra")
    private CompraEntity Compra;

    @ManyToOne
    @JoinColumn (name = "id_carrinho")
    private CarrinhoEntity Carrinho;

    public Integer getIdCompraCarrinho() {
        return idCompraCarrinho;
    }

    public CompraEntity getCompra() {
        return Compra;
    }

    public void setCompra(CompraEntity compra) {
        Compra = compra;
    }

    public CarrinhoEntity getCarrinho() {
        return Carrinho;
    }

    public void setCarrinho(CarrinhoEntity carrinho) {
        Carrinho = carrinho;
    }
}
