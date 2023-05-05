package br.com.fiap.spring.dto;

import br.com.fiap.spring.entity.CompraEntity;

public class CompraDTO {

    private int idCompra;
    private int idCliente;
    private int idTipoCompra;
    private String dataCompra;

    public CompraDTO() {

    }
    public CompraDTO(int id) {
        this.idCompra = id;
    }

    public CompraDTO(CompraEntity compraEntity) {
        this.idCompra = compraEntity.getIdCompra();

    }
    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdTipoCompra() {
        return idTipoCompra;
    }

    public void setIdTipoCompra(int idTipoCompra) {
        this.idTipoCompra = idTipoCompra;
    }

    public String getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(String dataCompra) {
        this.dataCompra = dataCompra;
    }
}
