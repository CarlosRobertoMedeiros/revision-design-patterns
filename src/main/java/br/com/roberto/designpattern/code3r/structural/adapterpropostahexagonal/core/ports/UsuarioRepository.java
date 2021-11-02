package br.com.roberto.designpattern.code3r.structural.adapterpropostahexagonal.core.ports;

import br.com.roberto.designpattern.code3r.structural.adapterpropostahexagonal.core.model.Usuario;

import java.util.List;

public interface UsuarioRepository {
    void salvar(Usuario usuario);
    List<Usuario> getTodos();
}
