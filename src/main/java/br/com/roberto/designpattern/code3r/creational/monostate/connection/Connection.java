package br.com.roberto.designpattern.code3r.creational.monostate.connection;

public class Connection {
    private boolean inUse;
    private String query;

    public Connection(){
        this.inUse = false;
    }

    public Object query(String sql){
        System.out.println("Rodando "+sql+" na Conexão "+ this);
        return null;
    }


    public boolean isInUse() {
        return inUse;
    }

    public void setInUse(boolean status) {
        this.inUse = status;
    }


}
