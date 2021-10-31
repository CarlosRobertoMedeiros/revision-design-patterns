package br.com.roberto.designpattern.code3r.creational.builderspolletoprogrammingfunctional;


import br.com.roberto.designpattern.code3r.creational.builderspolletoprogrammingfunctional.model.Massa;
import br.com.roberto.designpattern.code3r.creational.builderspolletoprogrammingfunctional.model.Tamanho;

public class Client {

    public static void main(String[] args) {
        Massa massa = new Massa.Builder(Tamanho.GRANDE).constroi();
        System.out.println(massa);

        Massa massa2 = new Massa.Builder(Tamanho.PEQUENO)
                .comIngredientes("Bacon", "Brócolis")
                .comMolhos("Tomate")
                .comQueijo()
                .constroi();
        System.out.println(massa2);

        Massa massa3 = new Massa.Builder(Tamanho.PADRAO)
                .comIngredientes("Alho")
                .comMolhos("Fungi","Queijo")
                .comQueijo()
                .comPimenta()
                .constroi();
        System.out.println(massa3);

    }
}
