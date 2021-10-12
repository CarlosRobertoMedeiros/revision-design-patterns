package br.com.roberto.designpattern.javabook.behavioral.strategy.exemplo3.pagavel;

public class PgtoBoleto implements Pagavel{

    @Override
    public void efetuarPagamento() {
        System.out.println("Efetuar Pagamento Boleto");
    }
}
