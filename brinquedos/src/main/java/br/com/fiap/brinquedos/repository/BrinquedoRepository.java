package br.com.fiap.brinquedos.repository;

import br.com.fiap.brinquedos.model.Brinquedo;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BrinquedoRepository {

    // EntityManager é a interface que permite manipular o banco de dados
    @PersistenceContext
    private EntityManager entityManager;

    // Lista intermediária para armazenar brinquedos antes de persistir
    private List<Brinquedo> brinquedos = new ArrayList<>();

    // Método para salvar o brinquedo na lista e depois no banco
    @Transactional
    public Brinquedo salvar(Brinquedo brinquedo) {
        brinquedos.add(brinquedo); // adiciona à lista local (simulação)
        entityManager.persist(brinquedo); // salva no banco Oracle
        return brinquedo;
    }

    // Método para listar todos os brinquedos (direto do banco)
    public List<Brinquedo> listarTodos() {
        return entityManager
                .createQuery("SELECT b FROM Brinquedo b", Brinquedo.class)
                .getResultList();
    }
}
