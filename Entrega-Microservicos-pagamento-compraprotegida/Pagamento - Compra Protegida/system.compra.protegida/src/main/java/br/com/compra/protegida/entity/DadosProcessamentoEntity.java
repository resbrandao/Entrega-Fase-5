package br.com.compra.protegida.entity;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "tbl_dados_processamento")
public class DadosProcessamentoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idDadosProcessamento;
    @Column
    private Double totalTransacao;
    @Column
    private String tipoMoeda;

    @OneToOne(mappedBy = "compraProtegidaDadosProcessamento", cascade = CascadeType.ALL, orphanRemoval = true)
    private CompraProtegidaEntity compraProtegida;

    public Long getIdDadosProcessamento() {
        return idDadosProcessamento;
    }

    public void setIdDadosProcessamento(Long idDadosProcessamento) {
        this.idDadosProcessamento = idDadosProcessamento;
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

    public CompraProtegidaEntity getCompraProtegida() {
        return compraProtegida;
    }

    public void setCompraProtegida(CompraProtegidaEntity compraProtegida) {
        this.compraProtegida = compraProtegida;
    }















}
