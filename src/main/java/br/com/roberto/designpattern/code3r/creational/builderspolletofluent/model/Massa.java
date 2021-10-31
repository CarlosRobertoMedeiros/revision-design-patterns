package br.com.roberto.designpattern.code3r.creational.builderspolletofluent.model;

import java.util.List;

public class Massa {

    protected List<String> ingredientes;
    protected List<String> molhos;
    protected Tamanho tamanho;
    protected boolean queijo;
    protected boolean pimenta;

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
}
