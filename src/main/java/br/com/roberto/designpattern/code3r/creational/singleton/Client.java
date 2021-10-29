package br.com.roberto.designpattern.code3r.creational.singleton;

import br.com.roberto.designpattern.code3r.creational.singleton.connection.Connection;
import br.com.roberto.designpattern.code3r.creational.singleton.connection.ConnectionPool;

public class Client {


    public static void main(String[] args) {
        executaConsulta1();
        executaConsulta2();
        executaConsulta3();
    }

    public static void executaConsulta1(){
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection conn = pool.getConnection();
        if (conn!=null){
            conn.query("SELECT * FROM A1");
        }
        pool.liberarConexao(conn);
    }

    public static void executaConsulta2(){
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection conn = pool.getConnection();
        if (conn!=null){
            conn.query("SELECT * FROM A2");
        }
    }

    public static void executaConsulta3(){
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection conn = pool.getConnection();
        if (conn!=null){
            conn.query("SELECT * FROM A3");
        }
    }
}
