package br.com.roberto.designpattern.javabook.behavioral.strategy.exemplo3.cliente;

public class ContaPagador {
    private Integer agencia;
    private Integer conta;

    public ContaPagador(Integer agencia, Integer conta) {
        this.agencia = agencia;
        this.conta = conta;
    }

    public Integer getAgencia() {
        return agencia;
    }

    public Integer getConta() {
        return conta;
    }
}
