package br.com.pagamentos.pagamentos.dto;

import br.com.pagamentos.pagamentos.entity.CartaoEntity;

import java.time.ZonedDateTime;
import java.util.Set;

public class PagamentoDTO {
    private Long idPagamento;
    private String tipoPagamento;
    private String statusPagamento;
    private Double totalTransacao;
    private String dataProcessamento;
    private String tipoMoeda;

    private ClienteDTO clienteDTO;
    private String mensagemProcessamento;



    public void setCartaoDTO(CartaoDTO cartaoDTO) {
        this.cartaoDTO = cartaoDTO;
    }

    private CartaoDTO cartaoDTO;

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


    public String getMensagemProcessamento() {
        return mensagemProcessamento;
    }

    public void setMensagemProcessamento(String mensagemProcessamento) {
        this.mensagemProcessamento = mensagemProcessamento;
    }

    public String getDataProcessamento() {
        return dataProcessamento;
    }

    public void setDataProcessamento(String dataProcessamento) {
        this.dataProcessamento = dataProcessamento;
    }
    public Long getIdPagamento() {
        return idPagamento;
    }

    public void setIdPagamento(Long idPagamento) {
        this.idPagamento = idPagamento;
    }

    public String getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public String getStatusPagamento() {
        return statusPagamento;
    }

    public void setStatusPagamento(String statusPagamento) {
        this.statusPagamento = statusPagamento;
    }

    public ClienteDTO getClienteDTO() {
        return clienteDTO;
    }

    public void setClienteDTO(ClienteDTO clienteDTO) {
        this.clienteDTO = (ClienteDTO) clienteDTO;
    }

    public void setCartaoDTO() {
        this.cartaoDTO = cartaoDTO;
    }

    public CartaoDTO getCartaoDTO() {
        return cartaoDTO;
    }

}
