package br.com.roberto.designpattern.javabook.behavioral.strategy.exemplo1.cliente;

import br.com.roberto.designpattern.javabook.behavioral.strategy.exemplo1.grasnavel.Grasnar;
import br.com.roberto.designpattern.javabook.behavioral.strategy.exemplo1.voavel.VoarComAsas;

public class PatoIrritado extends Pato {

    public PatoIrritado() {
        grasnavel = new Grasnar();
        voavel = new VoarComAsas();
    }

    @Override
    public void mostrarse() {
        System.out.println("Sou o pato Irritado !");
    }
}
