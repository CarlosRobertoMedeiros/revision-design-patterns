package br.com.roberto.designpattern.code3r.creational.prototypefunctionalclonebuilder.model;

public class Usuario implements Cloneable{
    private final String nome;
    private final Integer idade;
    private final Endereco endereco;

    public Usuario(String nome, Integer idade, Endereco endereco) {
        super();
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public Endereco getEndereco() {
        return endereco;
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
        Endereco enderecoClonado = (Endereco) endereco.clone();
        return new Usuario(nome, idade, enderecoClonado);
    }

    public Builder cloneBuilder(){
        return new Builder(nome,idade,endereco);
    }

    public static class Builder {
        private String nome;
        private Integer idade;
        private Endereco endereco;

        public Builder(String nome, Integer idade, Endereco endereco) {
            this.nome = nome;
            this.idade = idade;
            this.endereco = endereco;
        }

        public Builder comNome(String nome){
            this.nome = nome;
            return  this;
        }

        public Builder comIdade(Integer idade){
            this.idade = idade;
            return  this;
        }

        public Builder comEndereco(Endereco endereco){
            this.endereco = endereco;
            return  this;
        }

        public Usuario constroi(){
            return new Usuario(nome,idade,endereco);
        }
    }
}
