package br.com.roberto.designpattern.javabook.behavioral.strategy.exemplo1.cliente;

import br.com.roberto.designpattern.javabook.behavioral.strategy.exemplo1.grasnavel.Grasnar;
import br.com.roberto.designpattern.javabook.behavioral.strategy.exemplo1.voavel.NaoVoar;

public class PatoModelo extends Pato{

    public PatoModelo() {
        voavel = new NaoVoar();
        grasnavel = new Grasnar();
    }

    @Override
    public void mostrarse() {
        System.out.println("Eu sou um pato modelo !");
    }
}
