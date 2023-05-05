package br.com.fiap.spring.entity;

import javax.persistence.*;

@Entity
@Table(name = "tbl_compra_entrega")
public class CompraEntregaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_compra_entrega")
    private Integer idCompraEntrega;

    @Column(name = "id_compra")
    private Integer idCompra;
    @Column(name = "id_entrega")
    private Integer idEntrega;

    public Integer getIdCompraEntrega() {
        return idCompraEntrega;
    }

    public void setIdCompraEntrega(Integer idCompraEntrega) {
        this.idCompraEntrega = idCompraEntrega;
    }

    public Integer getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(Integer idCompra) {
        this.idCompra = idCompra;
    }

    public Integer getIdEntrega() {
        return idEntrega;
    }

    public void setIdEntrega(Integer idEntrega) {
        this.idEntrega = idEntrega;
    }
}
