package br.com.fiap.spring.entity;

import javax.persistence.*;

@Entity
@Table(name = "tbl_tipo_compra")
public class TipoCompraEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idTipoCompra;

    @Column
    private String tipo;

    public Integer getIdTipoCompra() {
        return idTipoCompra;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setIdTipoCompra(Integer idTipoCompra) {
        this.idTipoCompra = idTipoCompra;
    }
}
