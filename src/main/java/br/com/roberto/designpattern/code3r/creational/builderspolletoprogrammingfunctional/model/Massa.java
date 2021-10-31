package br.com.roberto.designpattern.code3r.creational.builderspolletoprogrammingfunctional.model;


import java.util.Arrays;
import java.util.List;

public class Massa {
    private final List<String> ingredientes;
    private final List<String> molhos;
    private final Tamanho tamanho;
    private final boolean queijo;
    private final boolean pimenta;

    public Massa(List<String> ingredientes, List<String> molhos, Tamanho tamanho, boolean queijo, boolean pimenta) {
        this.ingredientes = ingredientes;
        this.molhos = molhos;
        this.tamanho = tamanho;
        this.queijo = queijo;
        this.pimenta = pimenta;
    }

    public List<String> getIngredientes() {
        return ingredientes;
    }

    public List<String> getMolhos() {
        return molhos;
    }

    public Tamanho getTamanho() {
        return tamanho;
    }

    public boolean isQueijo() {
        return queijo;
    }

    public boolean isPimenta() {
        return pimenta;
    }

    @Override
    public String toString() {
        return "Massa{" +
                "ingredientes=" + ingredientes +
                ", molhos=" + molhos +
                ", tamanho=" + tamanho +
                ", queijo=" + queijo +
                ", pimenta=" + pimenta +
                '}';
    }

    public static class Builder{

        //Obrigatorio
        protected Tamanho tamanho;

        //Opcionais
        protected List<String> ingredientes;
        protected List<String> molhos;
        protected boolean queijo;
        protected boolean pimenta;

        public Builder(Tamanho tamanho) {
            this.tamanho = tamanho;
        }

        public Builder comIngredientes(String ... ingredientes){
            this.ingredientes = Arrays.asList(ingredientes);
            return this;
        }

        public Builder comMolhos(String ... molhos){
            this.molhos = Arrays.asList(molhos);
            return this;
        }

        public Builder comQueijo(){
            this.queijo = true;
            return this;
        }

        public Builder comPimenta(){
            this.pimenta = true;
            return this;
        }

        public Massa constroi(){
            return new Massa(ingredientes,molhos,tamanho,queijo,pimenta);
        }

    }
}
