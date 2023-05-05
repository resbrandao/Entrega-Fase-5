package br.com.pagamentos.pagamentos.entity;

import br.com.pagamentos.pagamentos.dto.CartaoDTO;
import br.com.pagamentos.pagamentos.dto.ClienteDTO;
import javax.persistence.Entity;

import javax.persistence.*;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

@Entity
@Table(name = "tbl_pagamento")
public class PagamentoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idPagamento;
    @Column
    private String tipoPagamento;
    @Column
    private String statusPagamento;
    @Column
    private Double totalTransacao;
    @Column
    private ZonedDateTime dataProcessamento;
    @Column
    private String tipoMoeda;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cliente_pagamento_id_cliente", nullable = true,
            referencedColumnName = "idCliente")
    private ClienteEntity clientePagamento;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cartao_id_cartao", nullable = true,
            referencedColumnName = "idCartao")
    private CartaoEntity cartao;
    @Column
    private String mensagemProcessamento;

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

    public Double getTotalTransacao() {
        return totalTransacao;
    }

    public void setTotalTransacao(Double totalTransacao) {
        this.totalTransacao = totalTransacao;
    }

    public String  getDataProcessamento() {
        return DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss").format(dataProcessamento);
    }

    public void setDataProcessamento(ZonedDateTime dataProcessamento) {
        this.dataProcessamento = dataProcessamento;
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

    public CartaoEntity getCartao() {
        return cartao;
    }

    public void setCartao() {
        this.cartao = cartao;
    }
    public ClienteEntity getClientePagamento() {
        return clientePagamento;
    }

    public void setClientePagamento(ClienteEntity clientePagamento) {
        this.clientePagamento = clientePagamento;
    }

}
