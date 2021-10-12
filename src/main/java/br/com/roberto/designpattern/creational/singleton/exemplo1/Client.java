package br.com.roberto.designpattern.creational.singleton.exemplo1;

public class Client {

    public static void main(String[] args) {
        //Chamando o Primeiro Usuário Singleton
        UsuarioSingleton usuarioSingleton = UsuarioSingleton.getInstanceUsuario();
         System.out.println(usuarioSingleton);

        //Chamando o Segundo Usuário Singleton
        UsuarioSingleton usuarioSingleton2 = UsuarioSingleton.getInstanceUsuario();
        System.out.println(usuarioSingleton2);

        //Testando a mesma instância
        System.out.println(usuarioSingleton==usuarioSingleton2? "Usuários Iguais" : "Usuários Diferentes");
    }

}
