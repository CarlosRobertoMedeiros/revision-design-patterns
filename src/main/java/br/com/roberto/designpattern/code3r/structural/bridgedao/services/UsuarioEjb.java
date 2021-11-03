package br.com.roberto.designpattern.code3r.structural.bridgedao.services;

import br.com.roberto.designpattern.code3r.structural.bridgedao.dao.UsuarioDao;
import br.com.roberto.designpattern.code3r.structural.bridgedao.model.Usuario;

public class UsuarioEjb extends UsuarioService{

    public UsuarioEjb(UsuarioDao usuarioDao) {
        super(usuarioDao);
    }

    @Override
    public void salvar(Usuario usuario) {
        System.out.println("Iniciando Salvamento de dados através de protocolo EJB");
        usuarioDao.salvar(usuario);
    }
}
