package br.com.roberto.designpattern.code3r.structural.adapter.adapters;

import br.com.roberto.designpattern.code3r.structural.adapter.device.MonitorAntigo;
import br.com.roberto.designpattern.code3r.structural.adapter.interfaces.Hdmi;

/**
 *  Utilizando para Classes Adapter
 *  Herança
 * */
public class HdmiToMonitorAntigoAdapter extends MonitorAntigo implements Hdmi {

    public HdmiToMonitorAntigoAdapter() {
        super();
        System.out.println("Encapsulando a Interface do velho monitor VGA com um Adaptador HDMI");
    }

    @Override
    public void setImagem(String imagem) {
        System.out.println("Convertendo a Imagem de HDMI para VGA");
        super.setImagem(imagem);
    }

    @Override
    public void setSom(String som) {
        System.out.println("Desculpe, não é possível implementar o som");
    }
}
