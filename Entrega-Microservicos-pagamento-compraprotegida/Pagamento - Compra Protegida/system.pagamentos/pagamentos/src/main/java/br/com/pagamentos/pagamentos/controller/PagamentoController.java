package br.com.pagamentos.pagamentos.controller;

import br.com.pagamentos.pagamentos.dto.PagamentoDTO;
import br.com.pagamentos.pagamentos.service.PagamentoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("pagamentos")
public class PagamentoController {

    private PagamentoService pagamentoService;

    public PagamentoController(PagamentoService pagamentoService){
        this.pagamentoService = pagamentoService;
    }

    @GetMapping("{id}")
    public List getPagamentoPorId(@RequestParam(name = "id") Long id) {
        return (List<PagamentoDTO>) pagamentoService.getPagamentoPorId(id);
    }
        @GetMapping("{idCliente}")
        public List getPagamentoPorIdCliente(@RequestParam(name = "idCliente") Long id){
            return (List<PagamentoDTO>) pagamentoService.getPagamentoPorIdCliente(id);
        }


    @GetMapping
    public List getPagamentos(){
        return (List<PagamentoDTO>) pagamentoService.getPagamento();
   }



}

