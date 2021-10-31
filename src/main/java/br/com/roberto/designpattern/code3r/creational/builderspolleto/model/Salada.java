package br.com.roberto.designpattern.code3r.creational.builderspolleto.model;

import java.util.List;

public class Salada extends Refeicao{

    public Salada(List<String> coberturas, List<String> molhos, Tamanho tamanho, boolean queijo, boolean pimenta) {
        super(coberturas, molhos, tamanho, queijo, pimenta);
    }

    @Override
    public String toString() {
        return "Salada{" +
                "coberturas=" + ingredientes +
                ", molhos=" + molhos +
                ", tamanho=" + tamanho +
                ", queijo=" + queijo +
                ", pimenta=" + pimenta +
                '}';
    }
}
