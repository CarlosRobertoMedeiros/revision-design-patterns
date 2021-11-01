package br.com.roberto.designpattern.code3r.creational.prototypedeepshallow.model;

public class Endereco implements Cloneable{
    public String rua;
    public Integer numero;

    public Endereco(String rua, Integer numero) {
        super();
        this.rua = rua;
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "rua='" + rua + '\'' +
                ", numero=" + numero +
                '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
