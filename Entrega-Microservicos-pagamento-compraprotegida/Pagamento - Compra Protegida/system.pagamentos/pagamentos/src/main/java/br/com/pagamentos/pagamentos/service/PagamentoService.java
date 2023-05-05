package br.com.pagamentos.pagamentos.service;

import br.com.pagamentos.pagamentos.dto.*;
import java.util.List;

public interface PagamentoService {

   List<PagamentoDTO> getPagamento();
    List<PagamentoDTO> getPagamentoPorIdCliente(Long Id);
    List<PagamentoDTO> getPagamentoPorId(Long Id);

}
