package br.com.fiap.spring.service;

import br.com.fiap.spring.dto.*;
import br.com.fiap.spring.entity.ChamadoEntity;
import br.com.fiap.spring.entity.ClienteEntity;
import br.com.fiap.spring.entity.CompraEntity;
import br.com.fiap.spring.entity.TipoCompraEntity;
import br.com.fiap.spring.repository.ChamadoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ChamadoServiceImpl implements ChamadoService {
    private ChamadoRepository chamadoRepository;

    public ChamadoServiceImpl(ChamadoRepository chamadoRepository){
        this.chamadoRepository = chamadoRepository;
    }

    public CompraDTO retornaDadosCompra(CompraEntity compraEntity) {

        CompraDTO compraDTO = new CompraDTO();
        compraDTO.setIdCompra(compraEntity.getIdCompra());
        compraDTO.setDataCompra(compraEntity.getDataCompra());
        compraDTO.setIdTipoCompra(compraEntity.getTipoCompra().getIdTipoCompra());
        compraDTO.setIdCliente(compraEntity.getCliente().getIdCliente());
        return compraDTO;
    }

    public TipoCompraEntity retornaTipoCompra(int id) {
        TipoCompraEntity tipoCompraRepository = chamadoRepository.findAllByIdTipoCompra (id);
        TipoCompraEntity tipoCompra = new TipoCompraEntity();
        tipoCompra.setIdTipoCompra(tipoCompraRepository.getIdTipoCompra());
        tipoCompra.setTipo(tipoCompraRepository.getTipo());
        return tipoCompra;
    }

    public ClienteEntity retornaDadosCliente(int id) {

        ClienteEntity clienteEntity = new ClienteEntity();
        ClienteEntity cliente= chamadoRepository.findAllByIdCliente (id);

        clienteEntity.setNomeCliente(cliente.getNomeCliente());
        clienteEntity.setCpfCliente(cliente.getCpfCliente());
        clienteEntity.setEmailCliente(cliente.getEmailCliente());
        clienteEntity.setEnderecoCliente(cliente.getEnderecoCliente());

        return clienteEntity;
    }
    public CompraDTO retornaDadosCompraDto(Integer id) {
        CompraEntity compra = chamadoRepository.findAllByIdCompra(id);
        CompraDTO compraDTO = new CompraDTO();

        compraDTO.setIdCompra(id);
        compraDTO.setDataCompra(compra.getDataCompra());
        compraDTO.setIdTipoCompra(compra.getTipoCompra().getIdTipoCompra());
        compraDTO.setIdCliente(compra.getCliente().getIdCliente());

        return compraDTO;
    }

    public CompraEntity retornaDadosCompraEntity(Integer id) {
        CompraEntity compra = chamadoRepository.findAllByIdCompra(id);
        CompraEntity compraEntity = new CompraEntity();

        compraEntity.setIdCompra(id);

        compraEntity.setDataCompra(compra.getDataCompra());
        compraEntity.setTipoCompra(retornaTipoCompra(compra.getTipoCompra().getIdTipoCompra()));
        compraEntity.setCliente(retornaDadosCliente(compra.getCliente().getIdCliente()));

        return compraEntity;
    }
    public List<ChamadoDTO> getChamados() {
        return chamadoRepository.findAll()
                .stream()
                .map(entity -> {
                    ChamadoDTO dto = new ChamadoDTO();
                    dto.setIdChamado(entity.getIdChamado());
                    dto.setCompraDTO(retornaDadosCompra(entity.getCompra()));
                    dto.setDescricao(entity.getDescricao());
                    dto.setDataChamado(entity.getDataChamado());
                    return dto;
                }).collect(Collectors.toList());
    }

    @Override
    public List<ChamadoDTO> getChamadoPorId(int Id) {
        return null;
    }

    @Override
    public ChamadoDTO incluirChamado(ChamadoDTO chamadoDTO) {
        ChamadoEntity entity = new ChamadoEntity();

        entity.setCompra(retornaDadosCompraEntity(chamadoDTO.getIdCompra()));
        entity.setDataChamado(chamadoDTO.getDataChamado());
        entity.setDescricao(chamadoDTO.getDescricao());

        ChamadoEntity savedEntity = chamadoRepository.save(entity);

        ChamadoDTO dto = new ChamadoDTO();
        dto.setIdCompra(savedEntity.getCompra().getIdCompra());
        dto.setIdChamado(savedEntity.getIdChamado());
        dto.setDescricao(savedEntity.getDescricao());
        dto.setCompraDTO(retornaDadosCompraDto(savedEntity.getCompra().getIdCompra()));
        dto.setDataChamado(savedEntity.getDataChamado());

        return dto;
    }
}