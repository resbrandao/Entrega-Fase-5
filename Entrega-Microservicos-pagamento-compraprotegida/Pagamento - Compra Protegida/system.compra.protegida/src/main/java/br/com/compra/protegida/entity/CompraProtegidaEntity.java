package br.com.compra.protegida.entity;

import javax.persistence.Entity;

import javax.persistence.*;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

@Entity
@Table(name = "tbl_compra_protegida")
public class CompraProtegidaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idCompraProtegida;

    @Column
    private String tipoCompraProtegida;
    @Column
    private String statusProcessamento;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "compra_protegida_dados_processamento", nullable = true,
            referencedColumnName = "idDadosProcessamento")
    private DadosProcessamentoEntity compraProtegidaDadosProcessamento;
    @Column
    private ZonedDateTime dataProcessamento;
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

    public String  getDataProcessamento() {
        return DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss").format(dataProcessamento);
    }

    public void setDataProcessamento(ZonedDateTime dataProcessamento) {
        this.dataProcessamento = dataProcessamento;
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

    public Long getIdCompraProtegida() {
        return idCompraProtegida;
    }

    public void setIdCompraProtegida(Long idCompraProtegida) {
        this.idCompraProtegida = idCompraProtegida;
    }

    public String getTipoCompraProtegida() {
        return tipoCompraProtegida;
    }

    public void setTipoCompraProtegida(String tipoCompraProtegida) {
        this.tipoCompraProtegida = tipoCompraProtegida;
    }

    public String getStatusProcessamento() {
        return statusProcessamento;
    }

    public void setStatusProcessamento(String statusProcessamento) {
        this.statusProcessamento = statusProcessamento;
    }

    public DadosProcessamentoEntity getCompraProtegidaDadosProcessamento() {
        return compraProtegidaDadosProcessamento;
    }

    public void setCompraProtegidaDadosProcessamento(DadosProcessamentoEntity compraProtegidaDadosProcessamento) {
        this.compraProtegidaDadosProcessamento = compraProtegidaDadosProcessamento;
    }

    public void setCartao(CartaoEntity cartao) {
        this.cartao = cartao;
    }

}
