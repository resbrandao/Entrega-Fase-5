package br.com.fiap.spring.dto;

public class ChamadoDTO {
    private int idChamado;

    private int idCompra;

    private CompraDTO compraDTO;
    private String descricao;
    private String dataChamado;

    public int getIdChamado() {
        return idChamado;
    }

    public void setIdChamado(int idChamado) {
        this.idChamado = idChamado;
    }

    public String getDataChamado() {
        return dataChamado;
    }

    public void setDataChamado(String dataChamado) {
        this.dataChamado = dataChamado;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


    public CompraDTO getCompraDTO() {
        return compraDTO;
    }

    public void setCompraDTO(CompraDTO compraDTO) {
        this.compraDTO = compraDTO;
    }
    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }
}
