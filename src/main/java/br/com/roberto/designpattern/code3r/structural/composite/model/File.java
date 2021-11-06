package br.com.roberto.designpattern.code3r.structural.composite.model;

public class File implements FileSytemItem{

    private String nome;

    public File(String nome) {
        this.nome = nome;
    }

    @Override
    public void mostrar(String estrutura) {
        System.out.println(estrutura + nome);
    }
}
