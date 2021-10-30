package br.com.roberto.designpattern.code3r.creational.builderfastfoodfluent.model.builder;

import br.com.roberto.designpattern.code3r.creational.builderfastfoodfluent.model.RefeicaoFastFood;

public class RefeicaoFastFoodBuilder {

    //Obrigatórios
    private String acompanhamento;

    //Opcionais
    private String bebida;
    private String refeicaoPrincipal;
    private String sobremesa;
    private String presente;

    public RefeicaoFastFoodBuilder(String acompanhamento) {
        this.acompanhamento = acompanhamento;
    }

    public RefeicaoFastFoodBuilder paraBeber(String bebida){
        this.bebida = bebida;
        return this;
    }

    public RefeicaoFastFoodBuilder paraRefeicaoPrincipal(String refeicaoPrincipal){
        this.refeicaoPrincipal = refeicaoPrincipal;
        return this;
    }

    public RefeicaoFastFoodBuilder paraSobremesa(String sobremesa){
        this.sobremesa = sobremesa;
        return this;
    }

    public RefeicaoFastFoodBuilder paraPresente(String presente){
        this.presente = presente;
        return this;
    }

    public RefeicaoFastFood getRefeicao(){
        return new RefeicaoFastFood(bebida,refeicaoPrincipal,acompanhamento,sobremesa,presente);
    }


}
