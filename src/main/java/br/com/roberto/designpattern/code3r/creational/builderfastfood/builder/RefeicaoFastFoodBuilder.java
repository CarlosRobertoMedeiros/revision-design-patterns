package br.com.roberto.designpattern.code3r.creational.builderfastfood.builder;

import br.com.roberto.designpattern.code3r.creational.builderfastfood.model.RefeicaoFastFood;

public abstract class RefeicaoFastFoodBuilder {
    protected RefeicaoFastFood refeicao;

    public RefeicaoFastFoodBuilder() {
        refeicao = new RefeicaoFastFood();
    }

    public RefeicaoFastFood getRefeicao() {
        return refeicao;
    }

    public void buildRefeicaoPrincipal(){};
    public void buildBebidas(){};
    public void buildAcompanhamento(){};
    public void buildSobremesa(){};
    public void buildBrinquedo(){};

}

