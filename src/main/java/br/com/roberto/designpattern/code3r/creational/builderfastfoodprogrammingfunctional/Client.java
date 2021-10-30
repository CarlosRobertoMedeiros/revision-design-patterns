package br.com.roberto.designpattern.code3r.creational.builderfastfoodprogrammingfunctional;

import br.com.roberto.designpattern.code3r.creational.builderfastfoodprogrammingfunctional.model.RefeicaoFastFood;

public class Client {

    public static void main(String[] args) {
        RefeicaoFastFood burguerCombo = new RefeicaoFastFood.Builder("Batata")
                .paraRefeicaoPrincipal("Hamburguer")
                .paraBebida("Coca")
                .getRefeicao();

        System.out.println(burguerCombo);

        RefeicaoFastFood apenasBatataFrita = new RefeicaoFastFood.Builder("Batata")
                .getRefeicao();

        System.out.println(apenasBatataFrita);

        RefeicaoFastFood comboGorduroso = new RefeicaoFastFood.Builder("Batata")
                .paraRefeicaoPrincipal("Hamburguer")
                .paraBebida("Coca")
                .paraSobremesa("MilkShake")
                .paraPresente("Brinquedinho")
                .getRefeicao();

        System.out.println(comboGorduroso);

    }

}
