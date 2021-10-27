package br.com.roberto.designpattern.code3r.creational.factorymethoddatabase.afterpattern.model;

public interface DataBase {
    void query(String sql);
    void update(String sql);
}
