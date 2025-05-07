package br.com.fiap.brinquedos.model;

import jakarta.persistence.*;

@Entity
@Table(name = "TB_BRINQUEDO")
public class Brinquedo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // usa o auto incremento do Oracle
    private Long id;

    @Column(nullable = false, length = 100)
    private String nome;

    @Column(nullable = false, length = 50)
    private String tipo;

    @Column(nullable = false, length = 10)
    private String classificacao;

    @Column(nullable = false, length = 20)
    private String tamanho;

    @Column(nullable = false)
    private double preco;

    // Construtor padrão (obrigatório para JPA)
    public Brinquedo() {}

    // Construtor completo (opcional, útil em testes)
    public Brinquedo(String nome, String tipo, String classificacao, String tamanho, double preco) {
        this.nome = nome;
        this.tipo = tipo;
        this.classificacao = classificacao;
        this.tamanho = tamanho;
        this.preco = preco;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
