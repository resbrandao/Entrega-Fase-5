package br.com.compra.protegida.dto;


public class DadosProcessamentoDTO {


    private Long idDadosProcessamento;
    private Double totalTransacao;
    private String tipoMoeda;


    public DadosProcessamentoDTO() {
    }

    public DadosProcessamentoDTO(Long idDadosProcessamento, Double totalTransacao, String tipoMoeda) {
        this.idDadosProcessamento = idDadosProcessamento;
        this.totalTransacao = totalTransacao;
        this.tipoMoeda = tipoMoeda;
    }

    public Double getTotalTransacao() {
        return totalTransacao;
    }

    public void setTotalTransacao(Double totalTransacao) {
        this.totalTransacao = totalTransacao;
    }

    public String getTipoMoeda() {
        return tipoMoeda;
    }

    public void setTipoMoeda(String tipoMoeda) {
        this.tipoMoeda = tipoMoeda;
    }
    public Long getIdDadosProcessamento() {
        return idDadosProcessamento;
    }

    public void setIdDadosProcessamento(Long idDadosProcessamento) {
        this.idDadosProcessamento = idDadosProcessamento;
    }







}
