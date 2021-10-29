package br.com.roberto.designpattern.code3r.creational.abstractfactory.factory;

import br.com.roberto.designpattern.code3r.creational.abstractfactory.factory.abstractfactory.RegrasPorPaisAbstractFactory;
import br.com.roberto.designpattern.code3r.creational.abstractfactory.model.iphone.IPhone;

public abstract class IPhoneFactory {
    protected RegrasPorPaisAbstractFactory regras;

    public IPhoneFactory(RegrasPorPaisAbstractFactory regras) {
        this.regras = regras;
    }

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
