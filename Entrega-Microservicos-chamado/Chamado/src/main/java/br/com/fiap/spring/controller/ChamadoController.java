package br.com.fiap.spring.controller;

import br.com.fiap.spring.dto.ChamadoDTO;
import br.com.fiap.spring.dto.CreateUpdateChamadoDTO;
import br.com.fiap.spring.service.ChamadoService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("chamados")
public class ChamadoController {

    private ChamadoService chamadoService;

    public ChamadoController(ChamadoService chamadoService){
        this.chamadoService = chamadoService;
    }

    @GetMapping
    public List getChamados(){
        return (List<ChamadoDTO>) chamadoService.getChamados();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ChamadoDTO incluirChamado (@RequestBody ChamadoDTO chamadoDTO){
        return chamadoService.incluirChamado(chamadoDTO);
    }

}

