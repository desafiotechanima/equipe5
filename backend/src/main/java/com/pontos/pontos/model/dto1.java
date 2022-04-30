package com.pontos.pontos.model;

public class dto1 {

    private String IdCategory;
    private String DescricaoAtividade;
    private String PontosAtividade;

    public dto1() {
    }

    public dto1(String idCategory, String descricaoAtividade, String pontosAtividade) {
        IdCategory = idCategory;
        DescricaoAtividade = descricaoAtividade;
        PontosAtividade = pontosAtividade;
    }

    public String getIdCategory() {
        return IdCategory;
    }

    public void setIdCategory(String idCategory) {
        IdCategory = idCategory;
    }



    public String getDescricaoAtividade() {
        return DescricaoAtividade;
    }

    public void setDescricaoAtividade(String descricaoAtividade) {
        DescricaoAtividade = descricaoAtividade;
    }

    public String getPontosAtividade() {
        return PontosAtividade;
    }

    public void setPontosAtividade(String pontosAtividade) {
        PontosAtividade = pontosAtividade;
    }
}
