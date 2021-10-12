package br.com.roberto.designpattern.javabook.behavioral.strategy.exemplo3.cliente;

import br.com.roberto.designpattern.javabook.behavioral.strategy.exemplo3.pagavel.PgtoCreditoConta;
import br.com.roberto.designpattern.javabook.behavioral.strategy.exemplo3.provisionavel.ProvisionamentoSidec;

public class PagamentoCreditoContaProvisionadoSidec extends Pagamento {

    public PagamentoCreditoContaProvisionadoSidec() {
        pagavel = new PgtoCreditoConta();
        provisionavel = new ProvisionamentoSidec();
    }
}
