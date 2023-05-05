package br.com.compra.protegida.service;

import br.com.compra.protegida.dto.CompraProtegidaDTO;
import br.com.compra.protegida.dto.*;
import java.util.List;

public interface CompraProtegidaService {

   List<CompraProtegidaDTO> getCompraProtegida();

    List<CompraProtegidaDTO> getCompraProtegidaPorIdCliente(Long Id);
    List<CompraProtegidaDTO> getCompraProtegidaPorId(Long Id);

}
