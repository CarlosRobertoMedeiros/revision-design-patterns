package br.com.roberto.designpattern.code3r.creational.builderspolleto.builder;

import br.com.roberto.designpattern.code3r.creational.builderspolleto.model.Tamanho;

import java.util.List;

public interface RefeicaoBuilder {
    void setTamanho(Tamanho tamanho);
    void setMolhos(List<String> molhos);
    void setIngredientes(List<String> ingredientes);
    void setQueijo(boolean queijo);
    void setPimenta(boolean pimenta);
}
