package br.com.roberto.designpattern.creational.singleton.exemplo1;

public class UsuarioSingleton {

    private static UsuarioSingleton usuarioInstancia = null;

    private UsuarioSingleton() {
    }

    public static UsuarioSingleton getInstanceUsuario(){
        if (usuarioInstancia == null){
            //Verifica que a instância não foi criada por outra thread
            usuarioInstancia = new UsuarioSingleton();
        }
        return usuarioInstancia;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
