package br.com.roberto.designpattern.javabook.behavioral.strategy.exemplo2.cliente;

import br.com.roberto.designpattern.javabook.behavioral.strategy.exemplo2.armavel.Armavel;

public abstract class Jogador {
    protected Armavel armavel;

    public abstract void lutar();

    public void setArmavel(Armavel armavel) {
        this.armavel = armavel;
    }

    public void associarArma(){
        armavel.useArma();
    }

}
