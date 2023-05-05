package br.com.fiap.spring.entity;

import javax.persistence.*;

@Entity
@Table(name = "tbl_pagamento")
public class PagamentoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idPagamento;

    @Column
    private String tipoPagamento;

    @Column
    private Double valor;

    @Column
    private String dataPagamento;

    public Integer getIdPagamento() {
        return idPagamento;
    }

    public String getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(String dataPagamento) {
        this.dataPagamento = dataPagamento;
    }
}
