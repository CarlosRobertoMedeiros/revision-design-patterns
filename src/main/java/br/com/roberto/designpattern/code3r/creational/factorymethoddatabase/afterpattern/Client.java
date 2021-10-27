package br.com.roberto.designpattern.code3r.creational.factorymethoddatabase.afterpattern;

import br.com.roberto.designpattern.code3r.creational.factorymethoddatabase.afterpattern.factory.OracleDataBaseFactory;
import br.com.roberto.designpattern.code3r.creational.factorymethoddatabase.afterpattern.factory.PostGresDataBaseFactory;
import br.com.roberto.designpattern.code3r.creational.factorymethoddatabase.afterpattern.model.DataBase;

public class Client {

    public static void main(String[] args) {
        DataBase dbOracle = new OracleDataBaseFactory().getDatabase();
        DataBase dbPostGres = new PostGresDataBaseFactory().getDatabase();

        dbOracle.query("select * From usuarios");
        dbOracle.update("insert into usuarios values('Carlos', 10)");

        dbPostGres.query("select * From usuarios");
        dbPostGres.update("insert into usuarios values('Carlos', 10)");
    }
}
