package br.com.roberto.designpattern.code3r.creational.prototypefunctionalclonebuilder;

import br.com.roberto.designpattern.code3r.creational.prototypefunctionalclonebuilder.model.Endereco;
import br.com.roberto.designpattern.code3r.creational.prototypefunctionalclonebuilder.model.Usuario;

/**
 * Cria objetos novos através de objetos anteriores usando prototype
 * além da usabilidade do builder para evoluir alguns atributos
 */
public class Client {
    public static void main(String[] args) {

        Usuario usuario = new Usuario("ToClone", 25, new Endereco("ABC Street", 1000));

        Usuario cloneUser =
                usuario.cloneBuilder()
                        .comNome("Cloned++")
                        .constroi();

        Usuario anotherUser =
                cloneUser.cloneBuilder()
                    .comIdade(100)
                    .comEndereco(new Endereco("A Street", 500))
                    .constroi();

        System.out.println(usuario);
        System.out.println(cloneUser);
        System.out.println(anotherUser);
    }
}
