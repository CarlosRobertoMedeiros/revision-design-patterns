package br.com.roberto.designpattern.javabook.behavioral.strategy.exemplo1.cliente;

import br.com.roberto.designpattern.javabook.behavioral.strategy.exemplo1.voavel.VoarComoFoguete;

public class PatoSimulator {

    public static void main(String[] args) {

        Pato patoIrritado = new PatoIrritado();
        patoIrritado.performGrasnar();
        patoIrritado.performVoar();
        patoIrritado.mostrarse();

        Pato patoModelo = new PatoModelo();
        patoModelo.performVoar();
        patoModelo.setVoavel(new VoarComoFoguete());
        patoModelo.performVoar();

    }
}