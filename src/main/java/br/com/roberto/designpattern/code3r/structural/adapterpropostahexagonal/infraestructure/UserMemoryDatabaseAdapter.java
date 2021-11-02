package br.com.roberto.designpattern.code3r.structural.adapterpropostahexagonal.infraestructure;

import br.com.roberto.designpattern.code3r.structural.adapterpropostahexagonal.core.model.Usuario;
import br.com.roberto.designpattern.code3r.structural.adapterpropostahexagonal.core.ports.UsuarioRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserMemoryDatabaseAdapter implements UsuarioRepository {

    private Map<String, Usuario> usuariosEmMemoria = new HashMap<>();

    @Override
    public void salvar(Usuario usuario) {
        usuariosEmMemoria.put(usuario.getEmail(),usuario);
    }

    @Override
    public List<Usuario> getTodos() {
        return new ArrayList<Usuario>(usuariosEmMemoria.values());
    }
}
