package br.com.fiap.spring.entity;

import javax.persistence.*;

@Entity
@Table(name = "tbl_compra_entrega")
public class CompraEntregaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idCompraEntrega;

    @ManyToOne
    @JoinColumn (name = "id_compra")
    private CompraEntity Compra;

    @ManyToOne
    @JoinColumn (name = "id_entrega")
    private EntregaEntity Entrega;

    public Integer getIdCompraEntrega() {
        return idCompraEntrega;
    }

    public CompraEntity getCompra() {
        return Compra;
    }

    public EntregaEntity getEntrega() {
        return Entrega;
    }
}
