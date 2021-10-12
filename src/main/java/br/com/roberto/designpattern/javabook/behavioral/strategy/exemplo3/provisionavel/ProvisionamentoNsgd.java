package br.com.roberto.designpattern.javabook.behavioral.strategy.exemplo3.provisionavel;

public class ProvisionamentoNsgd implements Provisionavel{

    @Override
    public void provisionarValores() {
        System.out.println("Provisionamento NSGD");
    }
}
