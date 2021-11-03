package br.com.roberto.designpattern.code3r.structural.bridgedao;

import br.com.roberto.designpattern.code3r.structural.bridgedao.dao.UsuarioDBMongoDao;
import br.com.roberto.designpattern.code3r.structural.bridgedao.dao.UsuarioDBMySQLDao;
import br.com.roberto.designpattern.code3r.structural.bridgedao.dao.UsuarioDBOracleDao;
import br.com.roberto.designpattern.code3r.structural.bridgedao.dao.UsuarioDBPostgresDao;
import br.com.roberto.designpattern.code3r.structural.bridgedao.model.Usuario;
import br.com.roberto.designpattern.code3r.structural.bridgedao.services.UsuarioRest;
import br.com.roberto.designpattern.code3r.structural.bridgedao.services.UsuarioService;

public class Client {

    public static void main(String[] args) {
        Usuario usuario = new Usuario("Carlos Roberto","carlos@gmail.com","password");

        UsuarioService usuarioRestOracleService = new UsuarioRest(new UsuarioDBOracleDao());
        usuarioRestOracleService.salvar(usuario);

        UsuarioService usuarioEjbMongoService = new UsuarioRest(new UsuarioDBMongoDao());
        usuarioEjbMongoService.salvar(usuario);

        UsuarioService usuarioSoapPostgres = new UsuarioRest(new UsuarioDBPostgresDao());
        usuarioSoapPostgres.salvar(usuario);

        UsuarioService usuarioRestMySQLService = new UsuarioRest(new UsuarioDBMySQLDao());
        usuarioRestMySQLService.salvar(usuario);
    }
}
