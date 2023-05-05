package br.com.fiap.spring.entity;

import javax.persistence.*;

@Entity
@Table(name = "tbl_compra_pagamento")
public class CompraPagamentoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idCompraPagamento;

    @ManyToOne
    @JoinColumn (name = "id_compra")
    private CompraEntity Compra;

    @ManyToOne
    @JoinColumn (name = "id_pagamento")
    private PagamentoEntity Pagamento;

    public Integer getIdCompraPagamento() {
        return idCompraPagamento;
    }

    public CompraEntity getCompra() {
        return Compra;
    }

    public PagamentoEntity getPagamento() {
        return Pagamento;
    }
}
