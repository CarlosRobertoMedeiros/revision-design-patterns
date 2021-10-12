package br.com.roberto.designpattern.javabook.structural.decorator.exemplo1;

import br.com.roberto.designpattern.javabook.structural.decorator.exemplo1.acompanhamentos.CafeComLeite;
import br.com.roberto.designpattern.javabook.structural.decorator.exemplo1.acompanhamentos.Creme;
import br.com.roberto.designpattern.javabook.structural.decorator.exemplo1.acompanhamentos.LeiteDeSoja;
import br.com.roberto.designpattern.javabook.structural.decorator.exemplo1.bebidas.Bebida;
import br.com.roberto.designpattern.javabook.structural.decorator.exemplo1.bebidas.BebidaDaCasa;
import br.com.roberto.designpattern.javabook.structural.decorator.exemplo1.bebidas.BebidaTorrada;

public class StarBucksCofeeSimulator {

    public static void main(String[] args) {
        Bebida bebida = new BebidaDaCasa();
        bebida = new CafeComLeite(bebida);
        bebida = new LeiteDeSoja(bebida);
        System.out.println(bebida.getDescricao()+ " $: "+ bebida.getValor());

        Bebida bebida2 = new BebidaTorrada();
        bebida2 = new CafeComLeite(bebida2);
        bebida2 = new Creme(bebida2);
        System.out.println(bebida2.getDescricao()+ " $: "+ bebida2.getValor());


    }
}
