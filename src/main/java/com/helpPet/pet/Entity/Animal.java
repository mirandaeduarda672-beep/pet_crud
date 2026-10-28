package com.helpPet.pet.Entity;

import com.helpPet.pet.Entity.enums.Especie;
import com.helpPet.pet.Entity.enums.Sexo;
import com.helpPet.pet.Entity.enums.Vacinacao;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "tb_animal")
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;

    @Enumerated(EnumType.STRING)
    private Especie especie;

    private String raca;

    @Enumerated(EnumType.STRING)
    private Sexo sexo;

    private LocalDate dataNascimento;

    private Double peso;

    private String cor;

    private boolean castrado;

    @Enumerated(EnumType.STRING)
    private Vacinacao vacinacao;

    @Column(columnDefinition = "TEXT")
    private String observacoes;

    public Animal() {
    }

    public Animal( String nome, Especie especie, String raca, Sexo sexo,
                  LocalDate dataNascimento, Double peso, String cor,
                  boolean castrado, Vacinacao vacinacao, String observacoes) {
        this.nome = nome;
        this.especie = especie;
        this.raca = raca;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
        this.peso = peso;
        this.cor = cor;
        this.castrado = castrado;
        this.vacinacao = vacinacao;
        this.observacoes = observacoes;
    }

    public Animal(Long id, String nome, Especie especie, String raca,
                  Sexo sexo, LocalDate dataNascimento, Double peso,
                  String cor, boolean castrado, Vacinacao vacinacao, String observacoes) {
        this.id = id;
        this.nome = nome;
        this.especie = especie;
        this.raca = raca;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
        this.peso = peso;
        this.cor = cor;
        this.castrado = castrado;
        this.vacinacao = vacinacao;
        this.observacoes = observacoes;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public Especie getEspecie() { return especie; }
    public void setEspecie(Especie especie) { this.especie = especie; }

    public String getRaca() { return raca; }
    public void setRaca(String raca) { this.raca = raca; }

    public Sexo getSexo() { return sexo; }
    public void setSexo(Sexo sexo) { this.sexo = sexo; }

    public LocalDate getDataNascimento() { return dataNascimento; }
    public void setDataNascimento(LocalDate dataNascimento) { this.dataNascimento = dataNascimento; }

    public Double getPeso() { return peso; }
    public void setPeso(Double peso) { this.peso = peso; }

    public String getCor() { return cor; }
    public void setCor(String cor) { this.cor = cor; }

    public boolean isCastrado() {
        return castrado;
    }

    public void setCastrado(boolean castrado) {
        this.castrado = castrado;
    }

    public Vacinacao getVacinacao() { return vacinacao; }
    public void setVacinacao(Vacinacao vacinacao) { this.vacinacao = vacinacao; }

    public String getObservacoes() { return observacoes; }
    public void setObservacoes(String observacoes) { this.observacoes = observacoes; }
}


