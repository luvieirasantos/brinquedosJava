package br.com.fiap.brinquedos.controller;

import br.com.fiap.brinquedos.model.Brinquedo;
import br.com.fiap.brinquedos.repository.BrinquedoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/brinquedos")
public class BrinquedoController {

    @Autowired
    private BrinquedoRepository repository;

    // CREATE
    @PostMapping
    public Brinquedo cadastrar(@RequestBody Brinquedo brinquedo) {
        return repository.save(brinquedo);
    }

    // READ - todos
    @GetMapping
    public List<Brinquedo> listar() {
        return repository.findAll();
    }

    // READ - por ID
    @GetMapping("/{id}")
    public ResponseEntity<Brinquedo> buscarPorId(@PathVariable Long id) {
        return repository.findById(id)
                .map(brinquedo -> ResponseEntity.ok(brinquedo))
                .orElse(ResponseEntity.notFound().build());
    }

    // UPDATE
    @PutMapping("/{id}")
    public ResponseEntity<Brinquedo> atualizar(@PathVariable Long id, @RequestBody Brinquedo atualizado) {
        return repository.findById(id)
                .map(brinquedo -> {
                    brinquedo.setNome(atualizado.getNome());
                    brinquedo.setTipo(atualizado.getTipo());
                    brinquedo.setClassificacao(atualizado.getClassificacao());
                    brinquedo.setTamanho(atualizado.getTamanho());
                    brinquedo.setPreco(atualizado.getPreco());
                    Brinquedo salvo = repository.save(brinquedo);
                    return ResponseEntity.ok(salvo);
                })
                .orElse(ResponseEntity.notFound().build());
    }

    // DELETE
    @DeleteMapping("/{id}")
    public ResponseEntity<Object> excluir(@PathVariable Long id) {
        return repository.findById(id)
                .map(brinquedo -> {
                    repository.deleteById(id);
                    return ResponseEntity.noContent().build();
                })
                .orElse(ResponseEntity.notFound().build());
    }
}
