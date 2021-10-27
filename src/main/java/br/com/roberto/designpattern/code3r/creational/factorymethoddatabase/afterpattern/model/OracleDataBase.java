package br.com.roberto.designpattern.code3r.creational.factorymethoddatabase.afterpattern.model;

public class OracleDataBase implements DataBase{

    @Override
    public void query(String sql) {
        System.out.println("Query "+sql+ " no Oracle DataBase ");

    }

    @Override
    public void update(String sql) {
        System.out.println("Update query "+sql+ " no Oracle DataBase ");
    }
}
