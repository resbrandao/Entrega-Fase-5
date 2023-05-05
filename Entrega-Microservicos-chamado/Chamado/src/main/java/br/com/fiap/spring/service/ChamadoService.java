package br.com.fiap.spring.service;

import br.com.fiap.spring.dto.*;

import java.util.List;

public interface ChamadoService {

    List<ChamadoDTO> getChamados ();

    List<ChamadoDTO> getChamadoPorId(int Id);
    ChamadoDTO incluirChamado(ChamadoDTO ChamadoDTO);
}
