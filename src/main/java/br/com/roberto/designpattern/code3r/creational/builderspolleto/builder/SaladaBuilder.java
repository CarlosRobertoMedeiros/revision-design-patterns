package br.com.roberto.designpattern.code3r.creational.builderspolleto.builder;

import br.com.roberto.designpattern.code3r.creational.builderspolleto.model.Salada;
import br.com.roberto.designpattern.code3r.creational.builderspolleto.model.Tamanho;

import java.util.List;

public class SaladaBuilder implements RefeicaoBuilder{

    protected List<String> ingredientes;
    protected List<String> molhos;
    protected Tamanho tamanho;
    protected boolean queijo;
    protected boolean pimenta;

    @Override
    public void setTamanho(Tamanho tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public void setMolhos(List<String> molhos) {
        this.molhos = molhos;
    }

    @Override
    public void setIngredientes(List<String> ingredientes) {
        this.ingredientes = ingredientes;
    }

    @Override
    public void setQueijo(boolean queijo) {
        this.queijo = queijo;
    }

    @Override
    public void setPimenta(boolean pimenta) {
        this.pimenta = pimenta;
    }

    public Salada getResultado(){
        return new Salada(ingredientes,molhos,tamanho,queijo,pimenta);
    }
}
