package com.pontos.pontos.model;

public class RanqueDTO {

    private String IdPessoa;
    private String nome;
    private String IdCategoria;
    private Float pontos;

    public RanqueDTO(){}

    public RanqueDTO(String idPessoa, String nome, String idCategoria, Float pontos) {
        IdPessoa = idPessoa;
        this.nome = nome;
        IdCategoria = idCategoria;
        this.pontos = pontos;
    }

    public String getIdPessoa() {
        return IdPessoa;
    }

    public void setIdPessoa(String idPessoa) {
        IdPessoa = idPessoa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdCategoria() {
        return IdCategoria;
    }

    public void setIdCategoria(String idCategoria) {
        IdCategoria = idCategoria;
    }

    public Float getPontos() {
        return pontos;
    }

    public void setPontos(Float pontos) {
        this.pontos = pontos;
    }
}
