package br.com.pagamentos.pagamentos.entity;

import javax.persistence.*;

import java.util.Collection;

@Entity
@Table(name = "tbl_cliente")
public class ClienteEntity {

    @Column
    private String nomeCliente;
    @Column
    private String email;
    @Column
    private String telefone;
    @Column
    private String endereço;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idCliente;
    @OneToMany(mappedBy = "clientePagamento", cascade = CascadeType.ALL, orphanRemoval = true)
    private Collection<PagamentoEntity> pagamentos;
    @OneToMany(mappedBy = "idCliente", cascade = CascadeType.ALL, orphanRemoval = true)
    private Collection<CartaoEntity> cartoes;

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }












}
