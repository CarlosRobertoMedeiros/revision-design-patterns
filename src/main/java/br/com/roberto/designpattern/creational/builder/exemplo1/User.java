package br.com.roberto.designpattern.creational.builder.exemplo1;

import java.time.LocalDate;

public class User {
    private final String nome;
    private final String ultimoNome;
    private final int idade;
    private final String telefone;
    private final String endereco;
    private final LocalDate data;

    public User(String nome, String ultimoNome, int idade, String telefone, String endereco, LocalDate data) {
        this.nome = nome;
        this.ultimoNome = ultimoNome;
        this.idade = idade;
        this.telefone = telefone;
        this.endereco = endereco;
        this.data = data;
    }

    public String getNome() {
        return nome;
    }

    public String getUltimoNome() {
        return ultimoNome;
    }

    public int getIdade() {
        return idade;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public LocalDate getData() {
        return data;
    }

    @Override
    public String toString() {
        return "User{" +
                "nome='" + nome + '\'' +
                ", ultimoNome='" + ultimoNome + '\'' +
                ", idade=" + idade +
                ", telefone='" + telefone + '\'' +
                ", endereco='" + endereco + '\'' +
                ", data=" + data +
                '}';
    }
}
