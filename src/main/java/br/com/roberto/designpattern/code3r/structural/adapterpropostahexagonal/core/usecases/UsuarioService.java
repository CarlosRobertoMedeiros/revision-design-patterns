package br.com.roberto.designpattern.code3r.structural.adapterpropostahexagonal.core.usecases;

import br.com.roberto.designpattern.code3r.structural.adapterpropostahexagonal.core.model.Usuario;
import br.com.roberto.designpattern.code3r.structural.adapterpropostahexagonal.core.ports.UsuarioRepository;

import java.util.List;

public class UsuarioService {
    private UsuarioRepository usuarioRepository; //Injeção de Dependência Vou Receber uma Injeção

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public void salvarUsuario(Usuario usuario){
        boolean isEmailJaUsado = usuarioRepository.getTodos()
                .stream()
                .anyMatch(userDb -> userDb.getEmail().equalsIgnoreCase(usuario.getEmail()));
        if (isEmailJaUsado) throw new RuntimeException("Endereço de Email Já existe !!");
        usuarioRepository.salvar(usuario);
    }

    public List<Usuario> getTodos(){
        return usuarioRepository.getTodos();
    }
}
