package br.com.roberto.designpattern.code3r.creational.builderfastfood.builder;

public class Menu2Builder extends RefeicaoFastFoodBuilder{

    @Override
    public void buildBebidas() {
        refeicao.setBebida("Água");
    }

    @Override
    public void buildRefeicaoPrincipal() {
        refeicao.setRefeicaoPrincipal("Hamburguer Vegetariano");
    }

    @Override
    public void buildAcompanhamento() {
        refeicao.setAcompanhamento("Salada");
    }

    @Override
    public void buildSobremesa() {
        refeicao.setSobreMesa("Maça");
    }

    @Override
    public void buildBrinquedo() {
        refeicao.setPresente("Carimbo Vegetariano");
    }
}
