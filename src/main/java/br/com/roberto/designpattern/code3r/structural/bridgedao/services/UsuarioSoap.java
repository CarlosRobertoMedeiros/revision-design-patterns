package br.com.roberto.designpattern.code3r.structural.bridgedao.services;

import br.com.roberto.designpattern.code3r.structural.bridgedao.dao.UsuarioDao;
import br.com.roberto.designpattern.code3r.structural.bridgedao.model.Usuario;

public class UsuarioSoap extends UsuarioService{

    public UsuarioSoap(UsuarioDao usuarioDao) {
        super(usuarioDao);
    }

    @Override
    public void salvar(Usuario usuario) {
        System.out.println("Iniciando Salvamento de dados através de protocolo Soap");
        usuarioDao.salvar(usuario);
    }
}
