package br.com.fiap.brinquedos.controller;

import br.com.fiap.brinquedos.model.Brinquedo;
import br.com.fiap.brinquedos.repository.BrinquedoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/brinquedos") // Endpoint base: localhost:8080/brinquedos
public class BrinquedoController {

    @Autowired
    private BrinquedoRepository repository;

    // Endpoint para cadastrar um brinquedo (CREATE)
    @PostMapping
    public Brinquedo cadastrar(@RequestBody Brinquedo brinquedo) {
        return repository.salvar(brinquedo);
    }

    // Endpoint para listar todos os brinquedos (READ)
    @GetMapping
    public List<Brinquedo> listar() {
        return repository.listarTodos();
    }
}
