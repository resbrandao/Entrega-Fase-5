package br.com.fiap.spring.service;

import br.com.fiap.spring.dto.*;

import java.util.List;

public interface EntregaService {

    List<EntregaDTO> getEntregas ();

    EntregaDTO getEntregaPorId(int Id);
}
