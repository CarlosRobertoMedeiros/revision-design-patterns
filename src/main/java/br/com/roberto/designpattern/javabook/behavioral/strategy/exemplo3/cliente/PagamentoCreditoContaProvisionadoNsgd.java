package br.com.roberto.designpattern.javabook.behavioral.strategy.exemplo3.cliente;

import br.com.roberto.designpattern.javabook.behavioral.strategy.exemplo3.pagavel.PgtoCreditoConta;
import br.com.roberto.designpattern.javabook.behavioral.strategy.exemplo3.provisionavel.ProvisionamentoNsgd;

public class PagamentoCreditoContaProvisionadoNsgd extends Pagamento {

    public PagamentoCreditoContaProvisionadoNsgd() {
        pagavel = new PgtoCreditoConta();
        provisionavel = new ProvisionamentoNsgd();
    }
}
