package br.com.roberto.designpattern.code3r.structural.bridgedao.dao;

import br.com.roberto.designpattern.code3r.structural.bridgedao.model.Usuario;

public class UsuarioDBPostgresDao implements UsuarioDao{
    @Override
    public void salvar(Usuario usuario) {
        System.out.println("Salvando o usuário em um Banco de Dados PostgresDB !");
    }
}
