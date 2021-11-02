package br.com.roberto.designpattern.code3r.structural.adapter.device;

import br.com.roberto.designpattern.code3r.structural.adapter.interfaces.Hdmi;

public class Computador {
    private Hdmi porta; //Agregação

    public void conectarPorta(Hdmi tela){
        System.out.println("Conectando a porta HDMI....");
        this.porta = tela;
    }

    public void enviarImagemESom(String imagem, String som){
        if (porta == null){
            System.out.println("Conecte um Cabo HDMI Inicialmente");
        }else{
            porta.setImagem(imagem);
            porta.setSom(som);
        }
    }
}
