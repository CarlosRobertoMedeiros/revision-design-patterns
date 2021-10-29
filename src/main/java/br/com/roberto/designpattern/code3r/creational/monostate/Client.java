package br.com.roberto.designpattern.code3r.creational.monostate;


import br.com.roberto.designpattern.code3r.creational.monostate.connection.Connection;
import br.com.roberto.designpattern.code3r.creational.monostate.connection.ConnectionPool;

public class Client {

    public static void main(String[] args) {
        executaConsulta1();
        executaConsulta2();
        executaConsulta3();
    }

    public static void executaConsulta1(){
        ConnectionPool pool = new ConnectionPool();
        Connection conn = pool.getConnection();
        if (conn!=null){
            conn.query("SELECT * FROM A1");
        }
    }

    public static void executaConsulta2(){
        ConnectionPool pool = new ConnectionPool();
        Connection conn = pool.getConnection();
        if (conn!=null){
            conn.query("SELECT * FROM A2");
        }
    }

    public static void executaConsulta3(){
        ConnectionPool pool = new ConnectionPool();
        Connection conn = pool.getConnection();
        if (conn!=null){
            conn.query("SELECT * FROM A3");
        }
    }

}
