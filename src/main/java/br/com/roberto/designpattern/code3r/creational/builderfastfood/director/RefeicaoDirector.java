package br.com.roberto.designpattern.code3r.creational.builderfastfood.director;

import br.com.roberto.designpattern.code3r.creational.builderfastfood.builder.RefeicaoFastFoodBuilder;
import br.com.roberto.designpattern.code3r.creational.builderfastfood.model.RefeicaoFastFood;

public class RefeicaoDirector {

    private RefeicaoFastFoodBuilder builder;

    public RefeicaoDirector(RefeicaoFastFoodBuilder builder) {
        this.builder = builder;
    }

    public void construirCombo(){
        builder.buildRefeicaoPrincipal();
        builder.buildBebidas();
        builder.buildAcompanhamento();
        builder.buildSobremesa();
        builder.buildBrinquedo();
    }

    public RefeicaoFastFood getCombo(){
        return builder.getRefeicao();
    }

}
