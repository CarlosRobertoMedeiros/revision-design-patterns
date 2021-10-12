package br.com.roberto.designpattern.javabook.structural.decorator.exemplo1.acompanhamentos;

import br.com.roberto.designpattern.javabook.structural.decorator.exemplo1.bebidas.Bebida;

public class LeiteDeSoja extends AcompanhamentoDecorator {

    public LeiteDeSoja(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao()+ " Acompanhado por Leite de Soja";
    }

    @Override
    public double getValor() {
        return 0.40+ bebida.getValor();

    }
}
