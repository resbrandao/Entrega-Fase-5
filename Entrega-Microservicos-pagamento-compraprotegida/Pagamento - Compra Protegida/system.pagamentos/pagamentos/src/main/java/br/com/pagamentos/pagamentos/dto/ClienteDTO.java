package br.com.pagamentos.pagamentos.dto;

import br.com.pagamentos.pagamentos.entity.PagamentoEntity;
import javax.persistence.*;

import java.time.ZonedDateTime;
import java.util.Collection;


public class ClienteDTO {


    private String nomeCliente;
    private String email;
    private String telefone;
    private String endereço;

   public ClienteDTO(String nomeCliente, String email, String telefone, String endereço, Long idCliente) {
        this.nomeCliente = nomeCliente;
        this.email = email;
        this.telefone = telefone;
        this.endereço = endereço;
        this.idCliente = idCliente;
    }

    private Long idCliente;

    public ClienteDTO() {
        this.nomeCliente = nomeCliente;
    }

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
