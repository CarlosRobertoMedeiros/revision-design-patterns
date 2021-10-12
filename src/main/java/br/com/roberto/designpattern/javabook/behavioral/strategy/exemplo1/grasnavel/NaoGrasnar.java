package br.com.roberto.designpattern.javabook.behavioral.strategy.exemplo1.grasnavel;

public class NaoGrasnar implements Grasnavel{

    @Override
    public void grasnar() {
        System.out.println(" <<SILENCIO>>> ");
    }
}
