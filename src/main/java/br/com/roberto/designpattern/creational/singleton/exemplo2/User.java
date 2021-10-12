package br.com.roberto.designpattern.creational.singleton.exemplo2;

public class User {
    private String nome = null;
    private Long age = null;

    public User(String nome, Long age) {
        this.nome = nome;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "nome='" + nome + '\'' +
                ", age=" + age +
                '}';
    }
}
