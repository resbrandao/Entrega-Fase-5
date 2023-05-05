package br.com.fiap.spring.service;

import br.com.fiap.spring.dto.*;

import java.util.List;

public interface CompraEntregaService {

    List<CompraEntregaDTO> getEntrega ();

    CompraEntregaDTO getEntregaPorIdCompra(int Id);
}
