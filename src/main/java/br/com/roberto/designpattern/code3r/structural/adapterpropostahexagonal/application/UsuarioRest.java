package br.com.roberto.designpattern.code3r.structural.adapterpropostahexagonal.application;

import br.com.roberto.designpattern.code3r.structural.adapterpropostahexagonal.core.model.Usuario;
import br.com.roberto.designpattern.code3r.structural.adapterpropostahexagonal.core.ports.UsuarioRepository;
import br.com.roberto.designpattern.code3r.structural.adapterpropostahexagonal.core.usecases.UsuarioService;
import br.com.roberto.designpattern.code3r.structural.adapterpropostahexagonal.infraestructure.UserMemoryDatabaseAdapter;

import java.util.List;
import java.util.Map;

//Apenas Simulando uma Api Rest
public class UsuarioRest {
    private UsuarioService usuarioFachada;

    public UsuarioRest() {
        //Ligando o Negócio com os Adaptadores
        UsuarioRepository usuarioRepository = new UserMemoryDatabaseAdapter();
        this.usuarioFachada = new UsuarioService(usuarioRepository);
    }

    public Integer post(Map<String, String> values){
        try{
            Usuario usuario = new Usuario(values.get("nome"),values.get("email"),values.get("password"));
            usuarioFachada.salvarUsuario(usuario);
        }catch (Exception e){
            System.out.println(e.getMessage());
            return 400;
        }
        return 201;
    }

    public Integer get(){
        List<Usuario> usuarios = usuarioFachada.getTodos();
        usuarios.stream().forEach(System.out::println);
        return 200;
    }
}
