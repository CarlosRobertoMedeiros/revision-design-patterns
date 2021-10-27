package br.com.roberto.designpattern.code3r.creational.simpleFactory.afterpattern.factory;

import br.com.roberto.designpattern.code3r.creational.simpleFactory.afterpattern.model.*;

public class IPhoneSimpleFactory {

    public static IPhone efetivaPedidoCompra(String geracao, String nivel){
        IPhone dispositivo = null;

        if (geracao.equals("X")) {
            if (nivel.equals("stamdard")) {
                dispositivo = new IPhoneX();
            } else if (nivel.equals("highEnd")) {
                dispositivo = new IPhoneXSMax();
            }
        }else if(geracao.equals("11")) {
            if (nivel.equals("stamdard")) {
                dispositivo = new IPhone11();
            } else if (nivel.equals("highEnd")) {
                dispositivo = new IPhone11Pro();
            }
        }

        if (dispositivo!=null) {
            dispositivo.getHardware();
            dispositivo.realizaMontagem();
            dispositivo.validaCertificado();
            dispositivo.realizaEmpacotamento();
        }

        return dispositivo;
    }

}
