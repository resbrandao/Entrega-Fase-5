package br.com.fiap.spring.service;

import br.com.fiap.spring.dto.CompraEntregaDTO;
import br.com.fiap.spring.dto.EntregaDTO;
import br.com.fiap.spring.entity.CompraEntregaEntity;
import br.com.fiap.spring.repository.CompraEntregaRepository;
import br.com.fiap.spring.repository.EntregaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CompraEntregaServiceImpl implements CompraEntregaService {
    private CompraEntregaRepository compraEntregaRepository;

    public CompraEntregaServiceImpl(CompraEntregaRepository compraEntregaRepository){
        this.compraEntregaRepository = compraEntregaRepository;
    }

    public List<CompraEntregaDTO> getEntrega() {
        return compraEntregaRepository.findAll()
                .stream()
                .map(entity -> {
                    CompraEntregaDTO dto = new CompraEntregaDTO();
                    dto.setIdEntrega(entity.getIdCompraEntrega());
                    dto.setIdCompra(entity.getIdCompra());
                    dto.setIdEntrega(entity.getIdEntrega());
                    return dto;
                }).collect(Collectors.toList());
    }

    @Override
    public CompraEntregaDTO getEntregaPorIdCompra(int Id) {
        CompraEntregaDTO dto = new CompraEntregaDTO();
        dto.setIdEntrega(compraEntregaRepository.consultaEntregaPorCompra(Id).getIdEntrega());
        dto.setIdCompra(compraEntregaRepository.consultaEntregaPorCompra(Id).getIdCompra());
        dto.setIdCompraEntrega(compraEntregaRepository.consultaEntregaPorCompra(Id).getIdCompraEntrega());
        return dto;
    }
}