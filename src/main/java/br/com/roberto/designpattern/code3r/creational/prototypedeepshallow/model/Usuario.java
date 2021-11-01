package br.com.roberto.designpattern.code3r.creational.prototypedeepshallow.model;

public class Usuario implements Cloneable {
    public String nome;
    public Integer idade;
    public Endereco endereco;

    public Usuario(String nome, Integer idade, Endereco endereco) {
        super();
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", endereco=" + endereco +
                '}';
    }

    @Override
    public Usuario clone() throws CloneNotSupportedException {
        //Shallow Copy
        //return (Usuario) super.clone();

        //Deep Copy Solution
        Usuario cloneUsuario = (Usuario) super.clone();
        cloneUsuario.endereco = (Endereco) endereco.clone();

        return cloneUsuario;

    }
}
