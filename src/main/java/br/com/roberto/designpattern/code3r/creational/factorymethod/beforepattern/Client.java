package br.com.roberto.designpattern.code3r.creational.factorymethod.beforepattern;

import br.com.roberto.designpattern.code3r.creational.factorymethod.beforepattern.model.*;

public class Client {

    public IPhone efetivaPedidoCompra(String geracao, String nivel){
        IPhone dispositivo = null;

        if (geracao.equals("X")){
            if(nivel.equals("standard")){
                dispositivo = new IPhoneX();
            }else if(nivel.equals("highEnd")){
                dispositivo = new IPhoneXSMax();
            }
        }else if (geracao.equals("11")){
            if(nivel.equals("standard")){
                dispositivo = new IPhone11();
            }else if(nivel.equals("highEnd")){
                dispositivo = new IPhone11Pro();
            }
        }

        dispositivo.getHardware();
        dispositivo.realizaMontagem();
        dispositivo.validaCertificado();
        dispositivo.realizaEmpacotamento();

        return dispositivo;

    }


}
