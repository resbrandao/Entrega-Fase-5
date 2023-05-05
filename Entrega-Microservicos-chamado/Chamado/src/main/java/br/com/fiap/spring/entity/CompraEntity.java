package br.com.fiap.spring.entity;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "tbl_compra")
public class CompraEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idCompra;

    @ManyToOne
    @JoinColumn (name = "id_cliente")
    private ClienteEntity Cliente;
    @ManyToOne(cascade=CascadeType.PERSIST)
    @JoinColumn(name = "id_tipo_compra", nullable = true,
            referencedColumnName = "idTipoCompra")
    private TipoCompraEntity tipoCompra;

    @OneToMany(mappedBy = "compra", cascade = CascadeType.ALL)
    private Collection<ChamadoEntity> chamados;
    @Column
    private String dataCompra;

    public Integer getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(Integer idCompra) {
        this.idCompra = idCompra;
    }

    public ClienteEntity getCliente() {
        return Cliente;
    }

    public String getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(String dataCompra) {
        this.dataCompra = dataCompra;
    }

    public void setCliente(ClienteEntity cliente) {
        Cliente = cliente;
    }

    public Collection<ChamadoEntity> getChamados() {
        return chamados;
    }

    public void setChamados(Collection<ChamadoEntity> chamados) {
        this.chamados = chamados;
    }

    public TipoCompraEntity getTipoCompra() {
        return tipoCompra;
    }

    public void setTipoCompra(TipoCompraEntity tipoCompra) {
        this.tipoCompra = tipoCompra;
    }
}
