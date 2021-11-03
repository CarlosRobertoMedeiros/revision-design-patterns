package br.com.roberto.designpattern.code3r.structural.bridgedao.services;

import br.com.roberto.designpattern.code3r.structural.bridgedao.dao.UsuarioDao;
import br.com.roberto.designpattern.code3r.structural.bridgedao.model.Usuario;

public class UsuarioRest extends UsuarioService{

    public UsuarioRest(UsuarioDao usuarioDao) {
        super(usuarioDao);
    }

    @Override
    public void salvar(Usuario usuario) {
        System.out.println("Iniciando Salvamento de dados através de protocolo Rest");
        usuarioDao.salvar(usuario);
    }
}
