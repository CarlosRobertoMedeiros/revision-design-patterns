package br.com.roberto.designpattern.code3r.creational.prototypefunctionalclonebuilder.model;

public class Endereco implements Cloneable{
    private final String rua;
    private final Integer numero;

    public Endereco(String rua, Integer numero) {
        super();
        this.rua = rua;
        this.numero = numero;
    }

    public String getRua() {
        return rua;
    }

    public Integer getNumero() {
        return numero;
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

    public static class Builder {
        private String rua;
        private Integer numero;

        private Builder(String rua, Integer numero) {
            this.rua = rua;
            this.numero = numero;
        }

        public Builder comRua(String rua){
            this.rua = rua;
            return  this;
        }

        public Builder comNumero(Integer numero){
            this.numero = numero;
            return  this;
        }

        public Endereco constroi(){
            return new Endereco(rua,numero);
        }
    }

}
