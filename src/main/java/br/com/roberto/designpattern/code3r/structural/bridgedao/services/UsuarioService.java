package br.com.roberto.designpattern.code3r.structural.bridgedao.services;

import br.com.roberto.designpattern.code3r.structural.bridgedao.dao.UsuarioDao;
import br.com.roberto.designpattern.code3r.structural.bridgedao.model.Usuario;

public abstract class UsuarioService {
    protected UsuarioDao usuarioDao;

    public UsuarioService(UsuarioDao usuarioDao) {
        this.usuarioDao = usuarioDao;
    }

    public abstract void salvar(Usuario usuario);
}
