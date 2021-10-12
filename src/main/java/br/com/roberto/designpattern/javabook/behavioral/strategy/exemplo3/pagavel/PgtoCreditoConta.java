package br.com.roberto.designpattern.javabook.behavioral.strategy.exemplo3.pagavel;

public class PgtoCreditoConta implements Pagavel{

    @Override
    public void efetuarPagamento() {
        System.out.println("Efetuar Pagamento Crédito em Conta");
    }
}
