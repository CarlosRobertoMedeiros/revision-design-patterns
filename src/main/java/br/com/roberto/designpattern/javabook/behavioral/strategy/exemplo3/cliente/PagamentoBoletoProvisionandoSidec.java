package br.com.roberto.designpattern.javabook.behavioral.strategy.exemplo3.cliente;

import br.com.roberto.designpattern.javabook.behavioral.strategy.exemplo3.pagavel.PgtoBoleto;
import br.com.roberto.designpattern.javabook.behavioral.strategy.exemplo3.provisionavel.ProvisionamentoSidec;

public class PagamentoBoletoProvisionandoSidec extends Pagamento {

    public PagamentoBoletoProvisionandoSidec() {
        pagavel = new PgtoBoleto();
        provisionavel = new ProvisionamentoSidec();
    }
}
