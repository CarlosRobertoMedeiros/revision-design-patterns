package br.com.roberto.designpattern.code3r.creational.halfsimplefactory.afterpattern.factory;


import br.com.roberto.designpattern.code3r.creational.halfsimplefactory.afterpattern.model.IPhone;

public abstract class IPhoneFactory {

    public IPhone efetivaPedidoCompra(String nivel){
        IPhone dispositivo = null;

        dispositivo = createIPhone(nivel);

        dispositivo.getHardware();
        dispositivo.realizaMontagem();
        dispositivo.validaCertificado();
        dispositivo.realizaEmpacotamento();

        return dispositivo;
    }

    protected abstract IPhone createIPhone(String nivel);
}
