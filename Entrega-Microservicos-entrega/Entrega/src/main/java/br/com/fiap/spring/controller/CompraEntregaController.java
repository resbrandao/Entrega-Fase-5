package br.com.fiap.spring.controller;

import br.com.fiap.spring.dto.CompraEntregaDTO;
import br.com.fiap.spring.dto.EntregaDTO;
import br.com.fiap.spring.service.CompraEntregaService;
import br.com.fiap.spring.service.EntregaService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("compraentrega")
public class CompraEntregaController {

    private CompraEntregaService compraEntregaService;

    public CompraEntregaController(CompraEntregaService compraEntregaService){
        this.compraEntregaService = compraEntregaService;
    }

    @GetMapping("{id}")
    public CompraEntregaDTO getEntregaPorIdCompra(@PathVariable(name = "id") Integer id) {
        return (CompraEntregaDTO) compraEntregaService.getEntregaPorIdCompra(id);
    }

}

