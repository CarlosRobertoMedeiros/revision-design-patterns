package br.com.roberto.designpattern.javabook.structural.decorator.exemplo1.acompanhamentos;

import br.com.roberto.designpattern.javabook.structural.decorator.exemplo1.bebidas.Bebida;

public class Creme extends AcompanhamentoDecorator {

    public Creme(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao()+ " Acompanhado por Creme";
    }

    @Override
    public double getValor() {
        return 0.30+bebida.getValor();

    }
}
