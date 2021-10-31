package br.com.roberto.designpattern.code3r.creational.builderspolleto;

import br.com.roberto.designpattern.code3r.creational.builderspolleto.builder.MassaBuilder;
import br.com.roberto.designpattern.code3r.creational.builderspolleto.builder.SaladaBuilder;
import br.com.roberto.designpattern.code3r.creational.builderspolleto.model.Massa;
import br.com.roberto.designpattern.code3r.creational.builderspolleto.model.Salada;
import br.com.roberto.designpattern.code3r.creational.builderspolleto.model.Tamanho;

import java.util.Arrays;

public class Client {

    public static void main(String[] args) {

        MassaBuilder massaBuilder = new MassaBuilder();
        massaBuilder.setTamanho(Tamanho.GRANDE);
        Massa massa = massaBuilder.getResultado();
        System.out.println(massa);

        SaladaBuilder saladaBuilder = new SaladaBuilder();
        saladaBuilder.setTamanho(Tamanho.PEQUENO);
        saladaBuilder.setIngredientes(Arrays.asList("Bacon", "Brócolis"));
        saladaBuilder.setMolhos(Arrays.asList("Cesar"));
        saladaBuilder.setQueijo(true);
        Salada salada = saladaBuilder.getResultado();
        System.out.println(salada);

        massaBuilder = new MassaBuilder();
        massaBuilder.setTamanho(Tamanho.GRANDE);
        massaBuilder.setIngredientes(Arrays.asList("Alho"));
        massaBuilder.setMolhos(Arrays.asList("Fungi","Queijo"));
        massaBuilder.setTamanho(Tamanho.PADRAO);
        massaBuilder.setQueijo(true);
        massaBuilder.setPimenta(true);
        Massa massa2 = massaBuilder.getResultado();
        System.out.println(massa2);
    }
}
