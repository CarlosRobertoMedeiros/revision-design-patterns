package br.com.roberto.designpattern.javabook.behavioral.strategy.exemplo3.pagavel;

public class PgtoDinheiro implements Pagavel{

    @Override
    public void efetuarPagamento() {
        System.out.println("Efetuar Pagamento em Dinheiro");
    }
}
