package br.com.roberto.designpattern.code3r.creational.builderfastfood.builder;

public class RefeicaoGordurosaBuilder extends RefeicaoFastFoodBuilder{

    @Override
    public void buildBebidas() {
        refeicao.setBebida("MilkShake");
    }

    @Override
    public void buildRefeicaoPrincipal() {
        refeicao.setRefeicaoPrincipal("Sanduíche BigMac");
    }

    @Override
    public void buildAcompanhamento() {
        refeicao.setAcompanhamento("Cebola");

    }

    @Override
    public void buildSobremesa() {
        refeicao.setSobreMesa("Sorvete Grande");
    }
}
