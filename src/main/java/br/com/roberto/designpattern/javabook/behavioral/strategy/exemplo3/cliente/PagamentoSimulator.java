package br.com.roberto.designpattern.javabook.behavioral.strategy.exemplo3.cliente;

public class PagamentoSimulator {

    public static void main(String[] args) {

        //CriarPagamento
        //EfetuarPagamento
        //EstornarPagamento

        //Pagamento Em Dinheiro Provisionamento SIDEC
        Pagamento pagamentoDinheiroProvisionadoSidec = new PagamentoDinheiroProvisionadoSidec();
        pagamentoDinheiroProvisionadoSidec.setContaPagador(new ContaPagador(123,111111));
        pagamentoDinheiroProvisionadoSidec.setValorPago(4500.88);
        pagamentoDinheiroProvisionadoSidec.efetuarPagamento();
        pagamentoDinheiroProvisionadoSidec.provisionarValores();

        //Pagamento Em Dinheiro Provisionamento NSGD
        Pagamento pagamentoDinheiroProvisionadoNSGD = new PagamentoDinheiroProvisionadoNsgd();
        pagamentoDinheiroProvisionadoNSGD.setContaPagador(new ContaPagador(123,111111));
        pagamentoDinheiroProvisionadoNSGD.setValorPago(4500.88);
        pagamentoDinheiroProvisionadoNSGD.efetuarPagamento();
        pagamentoDinheiroProvisionadoNSGD.provisionarValores();

        //Pagamento Em Credito na Conta
        Pagamento pagamentoCreditoContaProvisionadoSidec = new PagamentoCreditoContaProvisionadoSidec();
        pagamentoCreditoContaProvisionadoSidec.setContaPagador(new ContaPagador(123,111111));
        pagamentoCreditoContaProvisionadoSidec.setValorPago(4500.88);
        pagamentoCreditoContaProvisionadoSidec.efetuarPagamento();
        pagamentoCreditoContaProvisionadoSidec.provisionarValores();

        //Pagamento Em Credito na Conta
        Pagamento pagamentoCreditoContaProvisionadoNsgd = new PagamentoCreditoContaProvisionadoNsgd();
        pagamentoCreditoContaProvisionadoNsgd.setContaPagador(new ContaPagador(123,111111));
        pagamentoCreditoContaProvisionadoNsgd.setValorPago(4500.88);
        pagamentoCreditoContaProvisionadoNsgd.efetuarPagamento();
        pagamentoCreditoContaProvisionadoNsgd.provisionarValores();

        //Pagamento Em Boleto Provisionado no Sidec
        Pagamento pagamentoBoletoProvisionadoSidec = new PagamentoBoletoProvisionandoSidec();
        pagamentoBoletoProvisionadoSidec.setContaPagador(new ContaPagador(123,111111));
        pagamentoBoletoProvisionadoSidec.setValorPago(4500.88);
        pagamentoBoletoProvisionadoSidec.efetuarPagamento();
        pagamentoBoletoProvisionadoSidec.provisionarValores();





    }
}
