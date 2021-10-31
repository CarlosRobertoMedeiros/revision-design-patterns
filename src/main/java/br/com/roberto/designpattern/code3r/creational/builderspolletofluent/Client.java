package br.com.roberto.designpattern.code3r.creational.builderspolletofluent;

import br.com.roberto.designpattern.code3r.creational.builderspolletofluent.model.Massa;
import br.com.roberto.designpattern.code3r.creational.builderspolletofluent.model.Tamanho;
import br.com.roberto.designpattern.code3r.creational.builderspolletofluent.model.builder.MassaBuilder;

public class Client {

    public static void main(String[] args) {

        Massa massa = new MassaBuilder(Tamanho.GRANDE).constroi();
        System.out.println(massa);

        Massa massa2 = new MassaBuilder(Tamanho.PEQUENO)
                .comIngredientes("Bacon", "Brocolis")
                .comMolhos("Tomate")
                .comQueijo()
                .constroi();
        System.out.println(massa2);

        Massa massa3 = new MassaBuilder(Tamanho.PADRAO)
                .comIngredientes("Alho")
                .comMolhos("Fungi", "Queijo")
                .comQueijo()
                .comPimenta()
                .constroi();
        System.out.println(massa3);

    }
}
