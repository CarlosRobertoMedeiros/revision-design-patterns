package br.com.roberto.designpattern.javabook.creational.factorymethod2;

public class Bicicleta implements Veiculo{

    private String nome;
    public Bicicleta(String nome) { }

    @Override
    public void pickUp(String nomeCliente) {
        System.out.println(this.nome + " esta buscando o " +nomeCliente);

    }

    @Override
    public void parar() {
        System.out.println(this.nome + " parou ");

    }
}
