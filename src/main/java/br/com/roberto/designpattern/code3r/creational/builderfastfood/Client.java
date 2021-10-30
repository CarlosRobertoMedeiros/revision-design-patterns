package br.com.roberto.designpattern.code3r.creational.builderfastfood;

import br.com.roberto.designpattern.code3r.creational.builderfastfood.builder.*;
import br.com.roberto.designpattern.code3r.creational.builderfastfood.director.RefeicaoDirector;

/**
 * Olhar A implementação usando Interface Default do java 8
* */
public class Client {

    public static void gerarPedido(String nome, RefeicaoFastFoodBuilder builder){
        System.out.println("Gerando Pedido para o  "+nome);
        RefeicaoDirector director = new RefeicaoDirector(builder);
        director.construirCombo();
        System.out.println(director.getCombo());

        System.out.println("-----------------------------");
    }

    public static void main(String[] args) {
        gerarPedido("Hamburguer", new Menu1Builder());
        gerarPedido("Hamburguer Vegano", new Menu2Builder());
        gerarPedido("Apenas Batatas Fritas", new ApenasBatataFritaBuilder());
        gerarPedido("Refeição Gordurosa", new RefeicaoGordurosaBuilder());
    }
}
