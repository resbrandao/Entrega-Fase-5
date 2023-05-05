package br.com.compra.protegida.dto;

public class CartaoDTO {

    private Long idCartao;
    private String numeroCartao;
    private String bandeiraCartao;
    private String nomeCliente;
    private char[] codigoSeguraca=new char[3];
    private String dataValidade;
    private ClienteDTO idCliente;
    public CartaoDTO(Long idCartao, String numeroCartao, String bandeiraCartao, String nomeCliente, char[] codigoSeguraca, String dataValidade, ClienteDTO idCliente) {
       this.idCartao = idCartao;
        this.numeroCartao = numeroCartao;
        this.bandeiraCartao = bandeiraCartao;
        this.nomeCliente = nomeCliente;
        this.codigoSeguraca = codigoSeguraca;
        this.dataValidade = dataValidade;
        this.idCliente = idCliente;
    }

    public CartaoDTO() {
        this.idCartao = idCartao;
    }

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
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    public ClienteDTO getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(ClienteDTO idCliente) {
        this.idCliente = idCliente;
    }





}
