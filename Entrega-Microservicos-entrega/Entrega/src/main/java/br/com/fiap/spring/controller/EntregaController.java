package br.com.fiap.spring.controller;

import br.com.fiap.spring.dto.CompraEntregaDTO;
import br.com.fiap.spring.dto.EntregaDTO;
import br.com.fiap.spring.service.EntregaService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("entregas")
public class EntregaController {

    private EntregaService entregaService;

    public EntregaController(EntregaService entregaService){
        this.entregaService = entregaService;
    }

    @GetMapping
    public List getEntregas(){
        return (List<EntregaDTO>) entregaService.getEntregas();
    }

    @GetMapping("{id}")
    public EntregaDTO getEntregaPorId(@PathVariable(name = "id") Integer id) {
        return (EntregaDTO) entregaService.getEntregaPorId(id);
    }

}

