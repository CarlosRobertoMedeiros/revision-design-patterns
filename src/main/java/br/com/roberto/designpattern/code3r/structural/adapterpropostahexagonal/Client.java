package br.com.roberto.designpattern.code3r.structural.adapterpropostahexagonal;

import br.com.roberto.designpattern.code3r.structural.adapterpropostahexagonal.application.UsuarioRest;

import java.util.HashMap;
import java.util.Map;

public class Client {
    public static void main(String[] args) {

        UsuarioRest usuarioRest = new UsuarioRest();
        Map<String,String> body = new HashMap<>();
        body.put("email","carlos1@gmail.com");
        body.put("nome","carlos roberto");
        body.put("password","passwd");
        Integer statusCode = usuarioRest.post(body);
        System.out.println(statusCode);

        statusCode = usuarioRest.get();
        System.out.println(statusCode);

        body.put("email","carlos2@gmail.com");
        body.put("nome","carlos roberto 2");
        body.put("password","passwd");
        statusCode = usuarioRest.post(body);
        System.out.println(statusCode);

        statusCode = usuarioRest.get();
        System.out.println(statusCode);



    }
}
