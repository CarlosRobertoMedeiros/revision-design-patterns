package br.com.roberto.designpattern.code3r.creational.builderfastfood.builder;

public class ApenasBatataFritaBuilder extends RefeicaoFastFoodBuilder{

    @Override
    public void buildAcompanhamento() {
        refeicao.setAcompanhamento("Batata Frita Grande");
    }

}
