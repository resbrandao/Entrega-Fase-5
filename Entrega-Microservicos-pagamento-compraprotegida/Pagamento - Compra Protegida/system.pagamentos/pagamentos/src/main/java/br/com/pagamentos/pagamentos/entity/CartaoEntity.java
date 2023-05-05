package br.com.pagamentos.pagamentos.entity;

import javax.persistence.*;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Collection;

@Entity
@Table(name = "tbl_cartao")
public class CartaoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idCartao;
    @Column
    private String numeroCartao;
    @Column
    private String bandeiraCartao;
    @Column
    private String nomeCliente;
    @Column
    private char[] codigoSeguraca=new char[3];
    @Column
    private ZonedDateTime dataValidade;
    @OneToMany(mappedBy = "cartao", cascade = CascadeType.ALL)
    private Collection<PagamentoEntity> pagamentos;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cliente_id_cliente", nullable = true,
            referencedColumnName = "idCliente")
    private ClienteEntity idCliente;

    public Long getIdCartao() {
        return idCartao;
    }

    public void setIdCartao(Long idCartao) {
        this.idCartao = idCartao;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public String getBandeiraCartao() {
        return bandeiraCartao;
    }

    public void setBandeiraCartao(String bandeiraCartao) {
        this.bandeiraCartao = bandeiraCartao;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public char[] getCodigoSeguraca() {
        return codigoSeguraca;
    }

    public void setCodigoSeguraca(char[] codigoSeguraca) {
        this.codigoSeguraca = codigoSeguraca;
    }

    public String getDataValidade() {
        return DateTimeFormatter.ofPattern("MM/yyyy").format(dataValidade);
    }

    public void setDataValidade(ZonedDateTime dataValidade) {
        this.dataValidade = dataValidade;
    }

    public Collection<PagamentoEntity> getPagamentos() {
        return pagamentos;
    }

    public void setPagamentos(Collection<PagamentoEntity> pagamentos) {
        this.pagamentos = pagamentos;
    }

    public ClienteEntity getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(ClienteEntity idCliente) {
        this.idCliente = idCliente;
    }

}
