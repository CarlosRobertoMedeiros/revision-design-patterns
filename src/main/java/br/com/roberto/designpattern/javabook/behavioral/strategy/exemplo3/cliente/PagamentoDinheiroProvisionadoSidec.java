package br.com.roberto.designpattern.javabook.behavioral.strategy.exemplo3.cliente;

import br.com.roberto.designpattern.javabook.behavioral.strategy.exemplo3.pagavel.PgtoDinheiro;
import br.com.roberto.designpattern.javabook.behavioral.strategy.exemplo3.provisionavel.ProvisionamentoSidec;

public class PagamentoDinheiroProvisionadoSidec extends Pagamento{

    public PagamentoDinheiroProvisionadoSidec() {
        pagavel = new PgtoDinheiro();
        provisionavel = new ProvisionamentoSidec();
    }
}
