package br.com.fiap.brinquedos.model;

import jakarta.persistence.*;

@Entity
@Table(name = "TDS_TB_Brinquedos")
public class Brinquedo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id; // Identificador único do brinquedo

    @Column(name = "nome", nullable = false)
    private String nome; // Nome do brinquedo

    @Column(name = "tipo", nullable = false)
    private String tipo; // Tipo do brinquedo (ex: educativo, eletrônico, etc.)

    @Column(name = "classificacao", nullable = false)
    private String classificacao; // Classificação etária (ex: "3+", "8+")

    @Column(name = "tamanho", nullable = false)
    private String tamanho; // Tamanho do brinquedo (ex: pequeno, médio, grande)

    @Column(name = "preco", nullable = false)
    private double preco; // Preço do brinquedo

    // Construtor padrão (obrigatório para JPA)
    public Brinquedo() {
    }

    // Construtor completo
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
