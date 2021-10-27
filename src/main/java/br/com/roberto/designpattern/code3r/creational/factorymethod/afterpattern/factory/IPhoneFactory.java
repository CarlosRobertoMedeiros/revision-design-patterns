package br.com.roberto.designpattern.code3r.creational.factorymethod.afterpattern.factory;


import br.com.roberto.designpattern.code3r.creational.factorymethod.afterpattern.model.IPhone;

public abstract class IPhoneFactory {

    public IPhone efetivaPedidoCompra(){
        IPhone dispositivo = null;

        dispositivo = createIPhone();

        dispositivo.getHardware();
        dispositivo.realizaMontagem();
        dispositivo.validaCertificado();
        dispositivo.realizaEmpacotamento();

        return dispositivo;
    }

    protected abstract IPhone createIPhone();

}
