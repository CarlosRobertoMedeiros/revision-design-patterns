package br.com.roberto.designpattern.code3r.creational.builderspolleto.builder;

import br.com.roberto.designpattern.code3r.creational.builderspolleto.model.Massa;

public class MassaBuilder extends DefaultRefeicaoBuilder<Massa>{
    @Override
    public Massa getResultado() {
        return new Massa(ingredientes,molhos,tamanho,queijo,pimenta);
    }
}
