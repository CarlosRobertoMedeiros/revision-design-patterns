package br.com.roberto.designpattern.javabook.behavioral.strategy.exemplo3.cliente;

import br.com.roberto.designpattern.javabook.behavioral.strategy.exemplo3.documentogeravel.DocumentoGeravel;
import br.com.roberto.designpattern.javabook.behavioral.strategy.exemplo3.pagavel.Pagavel;
import br.com.roberto.designpattern.javabook.behavioral.strategy.exemplo3.provisionavel.Provisionavel;

public abstract class Pagamento {

    private Double valorPago;
    private ContaPagador contaPagador;

    protected Pagavel pagavel;
    protected Provisionavel provisionavel;
    protected DocumentoGeravel documentoGeravel;

    public void efetuarPagamento(){
        pagavel.efetuarPagamento();
    }

    public void provisionarValores(){
        provisionavel.provisionarValores();
    }

    public void gerarDocumento(){
        documentoGeravel.gerarDocumento();
    }

    public Double getValorPago() {
        return valorPago;
    }

    public void setValorPago(Double valorPago) {
        this.valorPago = valorPago;
    }

    public ContaPagador getContaPagador() {
        return contaPagador;
    }

    public void setContaPagador(ContaPagador contaPagador) {
        this.contaPagador = contaPagador;
    }
}
