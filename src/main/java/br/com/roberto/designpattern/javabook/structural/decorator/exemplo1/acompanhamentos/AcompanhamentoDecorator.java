package br.com.roberto.designpattern.javabook.structural.decorator.exemplo1.acompanhamentos;

import br.com.roberto.designpattern.javabook.structural.decorator.exemplo1.bebidas.Bebida;

public abstract class AcompanhamentoDecorator extends Bebida {
    protected Bebida bebida;

    public AcompanhamentoDecorator(Bebida bebida) {
        this.bebida = bebida;
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao();
    }

    @Override
    public double getValor() {
        return bebida.getValor();
    }
}
