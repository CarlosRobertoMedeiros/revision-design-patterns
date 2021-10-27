package br.com.roberto.designpattern.code3r.creational.factorymethoddatabase.afterpattern.factory;

import br.com.roberto.designpattern.code3r.creational.factorymethoddatabase.afterpattern.model.DataBase;
import br.com.roberto.designpattern.code3r.creational.factorymethoddatabase.afterpattern.model.OracleDataBase;

public class OracleDataBaseFactory implements DataBaseFactory{

    @Override
    public DataBase getDatabase() {
        return new OracleDataBase();
    }
}
