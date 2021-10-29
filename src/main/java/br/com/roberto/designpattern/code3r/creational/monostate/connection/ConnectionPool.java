package br.com.roberto.designpattern.code3r.creational.monostate.connection;

import java.util.ArrayList;
import java.util.List;

public class ConnectionPool {
    private static final ConnectionPool singleton = new ConnectionPool();
    private static int POOL_SIZE = 2;
    private static List<Connection> connectionsPool;

    static{
        System.out.println("Criando um pool de Conexões");
        connectionsPool = new ArrayList<Connection>();
        for (int i = 0; i<POOL_SIZE; i++){
            connectionsPool.add(new Connection());
        }
    }

    public ConnectionPool() {
        System.out.println("Nova Instância de um pool de Conexões");
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
