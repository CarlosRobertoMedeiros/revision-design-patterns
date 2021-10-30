package br.com.roberto.designpattern.code3r.creational.builderfastfoodfluent;

import br.com.roberto.designpattern.code3r.creational.builderfastfoodfluent.model.RefeicaoFastFood;
import br.com.roberto.designpattern.code3r.creational.builderfastfoodfluent.model.builder.RefeicaoFastFoodBuilder;

public class Client {
    public static void main(String[] args) {

        RefeicaoFastFood burguerCombo = new RefeicaoFastFoodBuilder("Batata")
                .paraRefeicaoPrincipal("Hamburguer")
                .paraBeber("Agua")
                .getRefeicao();
        System.out.println(burguerCombo);

        RefeicaoFastFood apenasBatatasFritas = new RefeicaoFastFoodBuilder("Batata Frita")
                .getRefeicao();
        System.out.println(apenasBatatasFritas);

        RefeicaoFastFood comboGordura = new RefeicaoFastFoodBuilder("Batata Grande")
                .paraRefeicaoPrincipal("Hamburguer Grande")
                .paraBeber("MilkShake")
                .paraSobremesa("Bolinho de Chocolate")
                .paraPresente("2 Quilos")
                .getRefeicao();
        System.out.println(comboGordura);



    }
}
