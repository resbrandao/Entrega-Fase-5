package br.com.fiap.spring.entity;

import javax.persistence.*;

@Entity
@Table(name = "tbl_entrega")
public class EntregaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idEntrega;

    @Column
    private String enderecoEntrega;

    @Column
    private Double frete;

    @Column
    private String dataEntrega;

    public Integer getIdEntrega() {
        return idEntrega;
    }

    public String getEnderecoEntrega() {
        return enderecoEntrega;
    }

    public void setEnderecoEntrega(String enderecoEntrega) {
        this.enderecoEntrega = enderecoEntrega;
    }

    public Double getFrete() {
        return frete;
    }

    public void setFrete(Double frete) {
        this.frete = frete;
    }

    public String getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(String dataEntrega) {
        this.dataEntrega = dataEntrega;
    }
}
