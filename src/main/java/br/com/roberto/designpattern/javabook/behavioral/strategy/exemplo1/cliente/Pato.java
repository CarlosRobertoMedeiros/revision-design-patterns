package br.com.roberto.designpattern.javabook.behavioral.strategy.exemplo1.cliente;

import br.com.roberto.designpattern.javabook.behavioral.strategy.exemplo1.grasnavel.Grasnavel;
import br.com.roberto.designpattern.javabook.behavioral.strategy.exemplo1.voavel.Voavel;

public abstract class Pato {

    protected Grasnavel grasnavel;
    protected Voavel voavel;

    public abstract void mostrarse();

    public void performVoar(){
        voavel.voar();
    }

    public void performGrasnar(){
        grasnavel.grasnar();
    }

    public void nadar(){
        System.out.println("Todos os patos flutuam, exceto o chamariz !");
    }

    public void setGrasnavel(Grasnavel grasnavel) {
        this.grasnavel = grasnavel;
    }

    public void setVoavel(Voavel voavel) {
        this.voavel = voavel;
    }
}
