package br.com.fiap.spring.entity;

import javax.persistence.*;

@Entity
@Table(name = "tbl_entrega")
public class EntregaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_entrega")
    private Integer idEntrega;
    @Column(name = "data_entrega")
    private String dataEntrega;
    @Column(name = "endereco_entrega")
    private String enderecoEntrega;

    public Integer getIdEntrega() {
        return idEntrega;
    }

    public String getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(String dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public String getEnderecoEntrega() { return enderecoEntrega; }

    public void setEnderecoEntrega(String enderecoEntrega) {
        this.enderecoEntrega = enderecoEntrega;
    }
}
