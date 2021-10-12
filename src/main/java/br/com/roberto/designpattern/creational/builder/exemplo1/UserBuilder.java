package br.com.roberto.designpattern.creational.builder.exemplo1;

import java.time.LocalDate;

public class UserBuilder {

    private final String nome;
    private final String ultimoNome;
    private int idade;
    private String telefone;
    private String endereco;
    private LocalDate data;

    public UserBuilder(String nome, String ultimoNome) {
        this.nome = nome;
        this.ultimoNome = ultimoNome;
    }

    public UserBuilder setIdade(int idade) {
        this.idade = idade;
        return this;
    }

    public UserBuilder setTelefone(String telefone) {
        this.telefone = telefone;
        return this;
    }

    public UserBuilder setEndereco(String endereco) {
        this.endereco = endereco;
        return this;
    }

    public UserBuilder setData(LocalDate data) {
        this.data = data;
        return this;
    }

    public User construir() {
        User user = new User(this.nome, this.ultimoNome, this.idade,this.telefone, this.endereco, this.data);
        return user;
    }


}
