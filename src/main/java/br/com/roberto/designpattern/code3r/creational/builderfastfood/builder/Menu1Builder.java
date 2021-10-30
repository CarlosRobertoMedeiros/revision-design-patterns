package br.com.roberto.designpattern.code3r.creational.builderfastfood.builder;

public class Menu1Builder extends RefeicaoFastFoodBuilder{

    @Override
    public void buildBebidas() {
        refeicao.setBebida("Coca Cola");
    }

    @Override
    public void buildRefeicaoPrincipal() {
        refeicao.setRefeicaoPrincipal("CheesBurger");
    }

    @Override
    public void buildAcompanhamento() {
        refeicao.setAcompanhamento("Batata Frita");
    }

    @Override
    public void buildSobremesa() {
        refeicao.setSobreMesa("Torta de Maça");
    }

    @Override
    public void buildBrinquedo() {
        refeicao.setPresente("Boneco do Filme do Momento");
    }
}
