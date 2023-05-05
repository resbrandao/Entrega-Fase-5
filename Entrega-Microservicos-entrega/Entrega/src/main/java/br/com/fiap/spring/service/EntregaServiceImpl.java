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
public class EntregaServiceImpl implements EntregaService {
    private EntregaRepository entregaRepository;

    public EntregaServiceImpl(EntregaRepository entregaRepository){
        this.entregaRepository = entregaRepository;
    }

    public List<EntregaDTO> getEntregas() {
        return entregaRepository.findAll()
                .stream()
                .map(entity -> {
                    EntregaDTO dto = new EntregaDTO();
                    dto.setIdEntrega(entity.getIdEntrega());
                    dto.setDataEntrega(entity.getDataEntrega());
                    dto.setEnderecoEntrega(entity.getEnderecoEntrega());
                    return dto;
                }).collect(Collectors.toList());
    }
    @Override
    public EntregaDTO getEntregaPorId(int Id) {
        EntregaDTO dto = new EntregaDTO();
        dto.setIdEntrega(entregaRepository.consultaEntregaPorId(Id).getIdEntrega());
        dto.setDataEntrega(entregaRepository.consultaEntregaPorId(Id).getDataEntrega());
        dto.setEnderecoEntrega(entregaRepository.consultaEntregaPorId(Id).getEnderecoEntrega());
        return dto;
    }
}