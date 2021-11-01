package br.com.roberto.designpattern.code3r.creational.prototypedeepshallow;

import br.com.roberto.designpattern.code3r.creational.prototypedeepshallow.model.Endereco;
import br.com.roberto.designpattern.code3r.creational.prototypedeepshallow.model.Usuario;

public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        Usuario usuario = new Usuario("Clone", 25, new Endereco("ABC Street", 1000));
        System.out.println(usuario);

        Usuario cloneUsuario = usuario.clone();
        cloneUsuario.nome = "Clone x2";
        cloneUsuario.endereco.rua = "Rua Dubla";

        System.out.println(usuario);
        System.out.println(cloneUsuario);


    }


}
