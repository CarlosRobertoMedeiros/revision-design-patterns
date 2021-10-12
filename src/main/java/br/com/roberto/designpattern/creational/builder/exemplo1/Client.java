package br.com.roberto.designpattern.creational.builder.exemplo1;

import java.time.LocalDate;

public class Client {

    public static void main(String[] args) {

        //StringBuilder = Class Exemplo para Construção

        //Construindo Um Objeto de Maneira Fluente
        // Exemplo Simples, porém serve para Criação de Objetos Complexos
        User user = new UserBuilder("Carlos","Roberto")
                .setEndereco("QSN 451 XXSSA")
                .setIdade(30)
                .setTelefone("2155874555")
                .setData(LocalDate.now())
                .construir();

        System.out.println(user);

        User user2 = new UserBuilder("Luciene","Alves")
                .setEndereco("QSN 451 XXSSA")
                .setIdade(20)
                .setTelefone("61987456877")
                .setData(LocalDate.of(2021,10,05))
                .construir();

        System.out.println(user2);
    }
}
