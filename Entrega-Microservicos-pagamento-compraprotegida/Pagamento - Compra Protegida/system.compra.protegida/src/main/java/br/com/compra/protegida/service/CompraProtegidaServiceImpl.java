package br.com.compra.protegida.service;

import br.com.compra.protegida.dto.CartaoDTO;
import br.com.compra.protegida.dto.ClienteDTO;
import br.com.compra.protegida.dto.CompraProtegidaDTO;
import br.com.compra.protegida.dto.DadosProcessamentoDTO;
import br.com.compra.protegida.entity.CartaoEntity;
import br.com.compra.protegida.entity.ClienteEntity;
import br.com.compra.protegida.entity.CompraProtegidaEntity;
import br.com.compra.protegida.entity.DadosProcessamentoEntity;
import br.com.compra.protegida.repository.CompraProtegidaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CompraProtegidaServiceImpl implements CompraProtegidaService {
    private CompraProtegidaRepository CompraProtegidaRepository;

    public CompraProtegidaServiceImpl(CompraProtegidaRepository CompraProtegidaRepository){
        this.CompraProtegidaRepository = CompraProtegidaRepository;
    }

    public DadosProcessamentoDTO retornaDadosProcessamento(DadosProcessamentoEntity dadosProcessamentoEntity){

        DadosProcessamentoDTO dadosProcessamentoDTO = new DadosProcessamentoDTO();
        dadosProcessamentoDTO.setIdDadosProcessamento(dadosProcessamentoEntity.getIdDadosProcessamento());
        dadosProcessamentoDTO.setTotalTransacao(dadosProcessamentoEntity.getTotalTransacao());
        dadosProcessamentoDTO.setTipoMoeda(dadosProcessamentoEntity.getTipoMoeda());

        return dadosProcessamentoDTO;

    }
    public ClienteDTO retornaDadosCliente(ClienteEntity clienteEntity){

        ClienteDTO clienteDTO = new ClienteDTO();
        clienteDTO.setIdCliente(clienteEntity.getIdCliente());
        clienteDTO.setNomeCliente(clienteEntity.getNomeCliente());
        clienteDTO.setEmail(clienteEntity.getEmail());
        clienteDTO.setTelefone(clienteEntity.getTelefone());
        clienteDTO.setEndereço(clienteEntity.getEndereço());
        return clienteDTO;

    }
    public CartaoDTO retornaDadosCartao(CartaoEntity cartaoEntity){

        CartaoDTO cartaoDTO = new CartaoDTO();
        cartaoDTO.setIdCartao(cartaoEntity.getIdCartao());
        cartaoDTO.setNumeroCartao(cartaoEntity.getNumeroCartao());
        cartaoDTO.setBandeiraCartao(cartaoEntity.getBandeiraCartao());
        cartaoDTO.setCodigoSeguraca(cartaoEntity.getCodigoSeguraca());
        cartaoDTO.setIdCliente(retornaDadosCliente(cartaoEntity.getIdCliente()));
        cartaoDTO.setNomeCliente(cartaoEntity.getNomeCliente());
        cartaoDTO.setDataValidade(cartaoEntity.getDataValidade());
        return cartaoDTO;

    }
    @Override
    public List<CompraProtegidaDTO> getCompraProtegida() {


        CompraProtegidaEntity compraProtegidaEntity = new CompraProtegidaEntity();

        return CompraProtegidaRepository.listar()
                .stream()
                .map(entity -> {
                    CompraProtegidaDTO dto = new CompraProtegidaDTO();
                    dto.setIdCompraProtegida(entity.getIdCompraProtegida());
                    dto.setTipoCompraProtegida(entity.getTipoCompraProtegida());
                    dto.setClienteDTO(retornaDadosCliente(entity.getClientePagamento()));
                    if(entity.getTipoCompraProtegida().toString().equals("Cartao"))
                        dto.setCartaoDTO(retornaDadosCartao(entity.getCartao()));
                    dto.setDadosProcessamentoDTO(retornaDadosProcessamento(entity.getCompraProtegidaDadosProcessamento()));
                    dto.setStatusProcessamento(entity.getStatusProcessamento());
                    dto.setDataProcessamento(entity.getDataProcessamento());
                    dto.setMensagemProcessamento(entity.getMensagemProcessamento());

                    return dto;
                }).collect(Collectors.toList());
    }

    @Override
    public List<CompraProtegidaDTO> getCompraProtegidaPorId(Long Id) {

        return CompraProtegidaRepository.findAllById(Id)
                .stream()
                .map(entity -> {
                    CompraProtegidaDTO dto = new CompraProtegidaDTO();
                    dto.setIdCompraProtegida(entity.getIdCompraProtegida());
                    dto.setTipoCompraProtegida(entity.getTipoCompraProtegida());
                    dto.setClienteDTO(retornaDadosCliente(entity.getClientePagamento()));
                    if(entity.getTipoCompraProtegida().toString().equals("Cartao"))
                        dto.setCartaoDTO(retornaDadosCartao(entity.getCartao()));
                    dto.setDadosProcessamentoDTO(retornaDadosProcessamento(entity.getCompraProtegidaDadosProcessamento()));
                    dto.setStatusProcessamento(entity.getStatusProcessamento());
                    dto.setDataProcessamento(entity.getDataProcessamento());
                    dto.setMensagemProcessamento(entity.getMensagemProcessamento());

                    return dto;
                }).collect(Collectors.toList());
    }
    @Override
    public List<CompraProtegidaDTO> getCompraProtegidaPorIdCliente(Long Id) {

        return CompraProtegidaRepository.consultaComprasProtegida(Id)
                .stream()
                .map(entity -> {
                    CompraProtegidaDTO dto = new CompraProtegidaDTO();
                    dto.setIdCompraProtegida(entity.getIdCompraProtegida());
                    dto.setTipoCompraProtegida(entity.getTipoCompraProtegida());
                    dto.setClienteDTO(retornaDadosCliente(entity.getClientePagamento()));
                    if(entity.getTipoCompraProtegida().toString().equals("Cartao"))
                        dto.setCartaoDTO(retornaDadosCartao(entity.getCartao()));
                    dto.setDadosProcessamentoDTO(retornaDadosProcessamento(entity.getCompraProtegidaDadosProcessamento()));
                    dto.setStatusProcessamento(entity.getStatusProcessamento());
                    dto.setDataProcessamento(entity.getDataProcessamento());
                    dto.setMensagemProcessamento(entity.getMensagemProcessamento());

                    return dto;
                }).collect(Collectors.toList());
    }


}
