package br.com.roberto.designpattern.javabook.structural.decorator.exemplo1.acompanhamentos;

import br.com.roberto.designpattern.javabook.structural.decorator.exemplo1.bebidas.Bebida;

public class CafeComLeite extends AcompanhamentoDecorator {

    public CafeComLeite(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + " Acompanhado por Café com Leite";
    }

    @Override
    public double getValor() {
        return 0.25 + super.getValor();
    }
}
