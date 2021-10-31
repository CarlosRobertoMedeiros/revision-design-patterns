package br.com.roberto.designpattern.code3r.creational.builderspolletofluent.model.builder;

import br.com.roberto.designpattern.code3r.creational.builderspolletofluent.model.Massa;
import br.com.roberto.designpattern.code3r.creational.builderspolletofluent.model.Tamanho;

import java.util.Arrays;
import java.util.List;

public class MassaBuilder {

    //Obrigatório
    protected Tamanho tamanho;

    //Opcional
    protected List<String> ingredientes;
    protected List<String> molhos;
    protected boolean queijo;
    protected boolean pimenta;

    public MassaBuilder(Tamanho tamanho) {
        this.tamanho = tamanho;
    }

    public MassaBuilder comIngredientes(String ... ingredientes){
        this.ingredientes = Arrays.asList(ingredientes);
        return this;
    }

    public MassaBuilder comMolhos(String ... molhos){
        this.molhos = Arrays.asList(molhos);
        return this;
    }

    public MassaBuilder comQueijo(){
        this.queijo = true;
        return this;
    }

    public MassaBuilder comPimenta(){
        this.pimenta = true;
        return this;
    }

    public Massa constroi(){
        return new Massa(ingredientes, molhos, tamanho, queijo, pimenta);
    }
}
