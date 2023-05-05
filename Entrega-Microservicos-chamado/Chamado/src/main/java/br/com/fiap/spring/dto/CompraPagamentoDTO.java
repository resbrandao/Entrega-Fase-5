package br.com.fiap.spring.dto;

public class CompraPagamentoDTO {

    private int idCompraPagamento;
    private int idCompra;
    private int idPagamento;

    public int getIdCompraPagamento() {
        return idCompraPagamento;
    }

    public void setIdCompraPagamento(int idCompraPagamento) {
        this.idCompraPagamento = idCompraPagamento;
    }

    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public int getIdPagamento() {
        return idPagamento;
    }

    public void setIdPagamento(int idPagamento) {
        this.idPagamento = idPagamento;
    }
}
