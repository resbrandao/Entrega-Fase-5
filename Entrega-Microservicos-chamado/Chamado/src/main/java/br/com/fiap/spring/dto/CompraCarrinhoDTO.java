package br.com.fiap.spring.dto;

public class CompraCarrinhoDTO {

    private int idCompraCarrinho;
    private int idCompra;
    private int idCarrinho;

    public int getIdCompraCarrinho() {
        return idCompraCarrinho;
    }

    public void setIdCompraCarrinho(int idCompraCarrinho) {
        this.idCompraCarrinho = idCompraCarrinho;
    }

    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public int getIdCarrinho() {
        return idCarrinho;
    }

    public void setIdCarrinho(int idCarrinho) {
        this.idCarrinho = idCarrinho;
    }
}
