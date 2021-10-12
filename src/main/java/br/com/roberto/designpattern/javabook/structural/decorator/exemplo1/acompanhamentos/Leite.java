package br.com.roberto.designpattern.javabook.structural.decorator.exemplo1.acompanhamentos;

import br.com.roberto.designpattern.javabook.structural.decorator.exemplo1.bebidas.Bebida;

public class Leite extends AcompanhamentoDecorator {

    public Leite(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao()+ " Acompanhado por Leite";
    }

    @Override
    public double getValor() {
        return 0.35 + bebida.getValor();

    }
}
