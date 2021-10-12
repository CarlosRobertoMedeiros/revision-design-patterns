package br.com.roberto.designpattern.javabook.behavioral.strategy.exemplo3.cliente;

import br.com.roberto.designpattern.javabook.behavioral.strategy.exemplo3.pagavel.PgtoDinheiro;
import br.com.roberto.designpattern.javabook.behavioral.strategy.exemplo3.provisionavel.ProvisionamentoNsgd;

public class PagamentoDinheiroProvisionadoNsgd extends Pagamento {

    public PagamentoDinheiroProvisionadoNsgd() {
        pagavel = new PgtoDinheiro();
        provisionavel = new ProvisionamentoNsgd();
    }
}
