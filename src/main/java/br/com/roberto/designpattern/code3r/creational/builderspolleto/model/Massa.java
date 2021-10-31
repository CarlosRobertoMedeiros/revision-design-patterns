package br.com.roberto.designpattern.code3r.creational.builderspolleto.model;

import java.util.List;

public class Massa extends Refeicao{

    public Massa(List<String> ingredientes, List<String> molhos, Tamanho tamanho, boolean queijo, boolean pimenta) {
        super(ingredientes, molhos, tamanho, queijo, pimenta);
    }

    @Override
    public String toString() {
        return "Massa{" +
                " ingredientes=" + ingredientes +
                ", molhos=" + molhos +
                ", tamanho=" + tamanho +
                ", queijo=" + queijo +
                ", pimenta=" + pimenta +
                '}';
    }
}
