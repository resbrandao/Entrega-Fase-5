package br.com.pagamentos.pagamentos.service;

import br.com.pagamentos.pagamentos.dto.CartaoDTO;
import br.com.pagamentos.pagamentos.dto.ClienteDTO;
import br.com.pagamentos.pagamentos.dto.PagamentoDTO;
import br.com.pagamentos.pagamentos.entity.CartaoEntity;
import br.com.pagamentos.pagamentos.entity.ClienteEntity;
import br.com.pagamentos.pagamentos.entity.PagamentoEntity;
import br.com.pagamentos.pagamentos.repository.PagamentoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PagamentoServiceImpl implements PagamentoService {
    private PagamentoRepository pagamentoRepository;
    //private Long idPagamento;

    public PagamentoServiceImpl(PagamentoRepository pagamentoRepository){
        this.pagamentoRepository = pagamentoRepository;
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
    public List<PagamentoDTO> getPagamento() {


        PagamentoEntity pagamentoEntity = new PagamentoEntity();

        return pagamentoRepository.listar()
                .stream()
                .map(entity -> {
                    PagamentoDTO dto = new PagamentoDTO();
                    dto.setIdPagamento(entity.getIdPagamento());
                    dto.setTipoPagamento(entity.getTipoPagamento());
                    dto.setTipoMoeda(entity.getTipoMoeda());
                    dto.setClienteDTO(retornaDadosCliente(entity.getClientePagamento()));
                    if(entity.getTipoPagamento().toString().equals("Cartao"))
                        dto.setCartaoDTO(retornaDadosCartao(entity.getCartao()));
                    dto.setStatusPagamento(entity.getStatusPagamento());
                    dto.setTotalTransacao(entity.getTotalTransacao());
                    dto.setDataProcessamento(entity.getDataProcessamento());
                    dto.setMensagemProcessamento(entity.getMensagemProcessamento());

                    return dto;
                }).collect(Collectors.toList());
    }

    @Override
    public List<PagamentoDTO> getPagamentoPorId(Long Id) {

        return pagamentoRepository.findAllById(Id)
                .stream()
                .map(entity -> {
                    PagamentoDTO dto = new PagamentoDTO();
                    dto.setIdPagamento(entity.getIdPagamento());
                    dto.setTipoPagamento(entity.getTipoPagamento());
                    dto.setTipoMoeda(entity.getTipoMoeda());
                    dto.setClienteDTO(retornaDadosCliente(entity.getClientePagamento()));
                    if(entity.getTipoPagamento().toString().equals("Cartao"))
                        dto.setCartaoDTO(retornaDadosCartao(entity.getCartao()));
                    dto.setStatusPagamento(entity.getStatusPagamento());
                    dto.setTotalTransacao(entity.getTotalTransacao());
                    dto.setDataProcessamento(entity.getDataProcessamento());
                    dto.setMensagemProcessamento(entity.getMensagemProcessamento());

                    return dto;
                }).collect(Collectors.toList());
    }
    @Override
    public List<PagamentoDTO> getPagamentoPorIdCliente(Long Id) {

        return pagamentoRepository.consultaPagamentos(Id)
                .stream()
                .map(entity -> {
                    PagamentoDTO dto = new PagamentoDTO();
                    dto.setIdPagamento(entity.getIdPagamento());
                    dto.setTipoPagamento(entity.getTipoPagamento());
                    dto.setTipoMoeda(entity.getTipoMoeda());
                    dto.setClienteDTO(retornaDadosCliente(entity.getClientePagamento()));
                    if(entity.getTipoPagamento().toString().equals("Cartao"))
                        dto.setCartaoDTO(retornaDadosCartao(entity.getCartao()));
                    dto.setStatusPagamento(entity.getStatusPagamento());
                    dto.setTotalTransacao(entity.getTotalTransacao());
                    dto.setDataProcessamento(entity.getDataProcessamento());
                    dto.setMensagemProcessamento(entity.getMensagemProcessamento());

                    return dto;
                }).collect(Collectors.toList());
    }


}
