package br.com.roberto.designpattern.code3r.creational.singleton.connection;

import java.util.ArrayList;
import java.util.List;

/**
 * Um problema do Singleton é que não é possível gerar polimorfismo
 * através do getConnection por intermédio de interface
 * Além do que essa implementação default não é thread safe
 * Uma alternativa é o monostate(Uncle Bob)
 * @param args
 */
public class ConnectionPool {
    private static final ConnectionPool singleton = new ConnectionPool();
    private int POOL_SIZE = 2;
    private List<Connection> connectionsPool;

    private ConnectionPool() {
        System.out.println("Criando um pool de Conexões");
        connectionsPool = new ArrayList<Connection>();
        for (int i = 0; i<POOL_SIZE; i++){
            connectionsPool.add(new Connection());
        }
    }

    public static ConnectionPool getInstance(){
        return singleton;
    }

    public Connection getConnection(){
        Connection conexaoDisponivel = null;
        for(Connection connection: connectionsPool){
            if (!connection.isInUse()){
                conexaoDisponivel = connection;
                break;
            }
        }
        if (conexaoDisponivel ==null){
            System.out.println("Sem Conexões Disponíveis ");
            return  null;
        }
        conexaoDisponivel.setInUse(true);
        return conexaoDisponivel;
    }

    public void liberarConexao(Connection conn){
        conn.setInUse(false);
    }

}
