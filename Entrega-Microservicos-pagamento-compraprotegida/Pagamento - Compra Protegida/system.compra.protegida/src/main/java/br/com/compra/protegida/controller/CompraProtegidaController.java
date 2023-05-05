package br.com.compra.protegida.controller;

import br.com.compra.protegida.dto.CompraProtegidaDTO;
import br.com.compra.protegida.service.CompraProtegidaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("compra.protegida")
public class CompraProtegidaController {

    private CompraProtegidaService compraProtegidaService;

    public CompraProtegidaController(CompraProtegidaService CompraProtegidaService){
        this.compraProtegidaService = CompraProtegidaService;
    }

    @GetMapping("{id}")
    public List getCompraProtegidaPorId(@RequestParam(name = "id") Long id) {
        return (List<CompraProtegidaDTO>) compraProtegidaService.getCompraProtegidaPorId(id);
    }
        @GetMapping("{idCliente}")
        public List getCompraProtegidaPorIdCliente(@RequestParam(name = "idCliente") Long id){
            return (List<CompraProtegidaDTO>) compraProtegidaService.getCompraProtegidaPorIdCliente(id);
        }


    @GetMapping
    public List getComprasProtegidas(){
        return (List<CompraProtegidaDTO>) compraProtegidaService.getCompraProtegida();
   }



}

