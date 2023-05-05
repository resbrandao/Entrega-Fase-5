package br.com.compra.protegida.dto;

public class CompraProtegidaDTO {
    private Long idCompraProtegida;
    private String tipoCompraProtegida;
    private String statusProcessamento;
    private String dataProcessamento;
    private ClienteDTO clienteDTO;
    private CartaoDTO cartaoDTO;
    private DadosProcessamentoDTO dadosProcessamentoDTO;
    private String mensagemProcessamento;


    public CompraProtegidaDTO() {
    }

    public CompraProtegidaDTO(Long idCompraProtegida, String tipoCompraProtegida, String statusProcessamento, String dataProcessamento, ClienteDTO clienteDTO, CartaoDTO cartaoDTO, DadosProcessamentoDTO dadosProcessamentoDTO, String mensagemProcessamento) {
        this.idCompraProtegida = idCompraProtegida;
        this.tipoCompraProtegida = tipoCompraProtegida;
        this.statusProcessamento = statusProcessamento;
        this.dataProcessamento = dataProcessamento;
        this.clienteDTO = clienteDTO;
        this.cartaoDTO = cartaoDTO;
        this.dadosProcessamentoDTO = dadosProcessamentoDTO;
        this.mensagemProcessamento = mensagemProcessamento;
    }

    public Long getIdCompraProtegida() {
        return idCompraProtegida;
    }

    public void setIdCompraProtegida(Long idCompraProtegida) {
        this.idCompraProtegida = idCompraProtegida;
    }

    public String getTipoCompraProtegida() {
        return tipoCompraProtegida;
    }

    public void setTipoCompraProtegida(String tipoCompraProtegida) {
        this.tipoCompraProtegida = tipoCompraProtegida;
    }

    public String getStatusProcessamento() {
        return statusProcessamento;
    }

    public void setStatusProcessamento(String statusProcessamento) {
        this.statusProcessamento = statusProcessamento;
    }
    public void setCartaoDTO(CartaoDTO cartaoDTO) {
        this.cartaoDTO = cartaoDTO;
    }

    public String getMensagemProcessamento() {
        return mensagemProcessamento;
    }

    public void setMensagemProcessamento(String mensagemProcessamento) {
        this.mensagemProcessamento = mensagemProcessamento;
    }

    public String getDataProcessamento() {
        return dataProcessamento;
    }

    public void setDataProcessamento(String dataProcessamento) {
        this.dataProcessamento = dataProcessamento;
    }

    public ClienteDTO getClienteDTO() {
        return clienteDTO;
    }

    public void setClienteDTO(ClienteDTO clienteDTO) {
        this.clienteDTO = (ClienteDTO) clienteDTO;
    }

    public void setCartaoDTO() {
        this.cartaoDTO = cartaoDTO;
    }

    public CartaoDTO getCartaoDTO() {
        return cartaoDTO;
    }

    public DadosProcessamentoDTO getDadosProcessamentoDTO() {
        return dadosProcessamentoDTO;
    }

    public void setDadosProcessamentoDTO(DadosProcessamentoDTO dadosProcessamentoDTO) {
        this.dadosProcessamentoDTO = dadosProcessamentoDTO;
    }

}
