package br.com.roberto.designpattern.javabook.creational.factory2.produtos.interfaces;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    protected String nome;
    protected String massa;
    protected String molho;
    protected List<String> coberturas = new ArrayList<>();

    public void prepara(){
        System.out.println("Preparando "+nome);
        System.out.println("Jogando a massa ...");
        System.out.println("Adicionando molho ...");
        System.out.println("Adicionando coberturas ...");
        coberturas.forEach(cobertura -> System.out.println(cobertura));

    }
    public void cozinha(){
        System.out.println("Cozinha por 25 minutos");
    };
    public void corta(){
        System.out.println("Corta a pizza fatiando na diagonal ");
    };
    public void encaixota() {
        System.out.println("Coloca a pizza em uma caixa Oficial da Pizzaria ");
    }

    public String getNome() {
        return nome;
    }


}

