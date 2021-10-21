package br.com.roberto.designpattern.javabook.creational.factorymethod;

public abstract class Creator {
    public abstract Produto factoryMethod();
    public void createAndShow(){
        Produto produto = this.factoryMethod();
        System.out.println(produto);
    }
}
