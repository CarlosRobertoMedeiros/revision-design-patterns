package br.com.roberto.designpattern.code3r.structural.adapter.device;

import br.com.roberto.designpattern.code3r.structural.adapter.interfaces.Hdmi;

public class TV implements Hdmi {

    @Override
    public void setImagem(String imagem) {
        System.out.println(">>> Isso é o seu vídeo: "+imagem);
    }

    @Override
    public void setSom(String som) {
        System.out.println(">>> Isso é o seu som: "+som);
    }
}
