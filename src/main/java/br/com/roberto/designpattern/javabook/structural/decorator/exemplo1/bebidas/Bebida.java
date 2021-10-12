package br.com.roberto.designpattern.javabook.structural.decorator.exemplo1.bebidas;

public abstract class Bebida {
    private String descricao ="Bebida Desconhecida";

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public abstract double getValor();
}
