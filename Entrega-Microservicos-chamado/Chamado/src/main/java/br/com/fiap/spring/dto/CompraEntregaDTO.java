package br.com.fiap.spring.dto;

public class CompraEntregaDTO {

    private int idCompraEntrega;
    private int idCompra;
    private int idEntrega;

    public int getIdCompraEntrega() {
        return idCompraEntrega;
    }

    public void setIdCompraEntrega(int idCompraEntrega) {
        this.idCompraEntrega = idCompraEntrega;
    }

    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public int getIdEntrega() {
        return idEntrega;
    }

    public void setIdEntrega(int idEntrega) {
        this.idEntrega = idEntrega;
    }
}
