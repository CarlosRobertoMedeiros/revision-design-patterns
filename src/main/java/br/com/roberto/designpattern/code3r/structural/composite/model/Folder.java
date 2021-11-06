package br.com.roberto.designpattern.code3r.structural.composite.model;

import java.util.List;

public class Folder implements FileSytemItem{
    private String nome;
    private List<FileSytemItem> filhos; //Identifica-se o padrão composite aqui

    public Folder(String nome, List<FileSytemItem> filhos) {
        this.nome = nome;
        this.filhos = filhos;
    }

    @Override
    public void mostrar(String estrutura) {
        System.out.println(estrutura + nome);
        for(FileSytemItem filho:filhos){
            filho.mostrar(estrutura+ "| ");
        }
    }
}
