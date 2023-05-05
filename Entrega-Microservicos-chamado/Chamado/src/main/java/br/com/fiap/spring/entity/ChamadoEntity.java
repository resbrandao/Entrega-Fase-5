package br.com.fiap.spring.entity;

import javax.persistence.*;

@Entity
@Table(name = "tbl_chamado")
public class ChamadoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_chamado")
    private Integer idChamado;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "chamado_compra", nullable = true,
            referencedColumnName = "idCompra")
    private CompraEntity compra;

    @Column (name = "descricao")
    private String descricao;

    @Column (name = "data_chamado")
    private String dataChamado;

    public Integer getIdChamado() {
        return idChamado;
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

    public CompraEntity getCompra() {
        return compra;
    }

    public void setCompra(CompraEntity compra) {
        this.compra = compra;
    }


    public void setIdChamado(Integer idChamado) {
        this.idChamado = idChamado;
    }
}
