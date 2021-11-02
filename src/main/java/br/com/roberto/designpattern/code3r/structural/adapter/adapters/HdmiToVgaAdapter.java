package br.com.roberto.designpattern.code3r.structural.adapter.adapters;

import br.com.roberto.designpattern.code3r.structural.adapter.interfaces.Hdmi;
import br.com.roberto.designpattern.code3r.structural.adapter.interfaces.Vga;

/**
*  Utilizando para Objetos Adapter
* */
public class HdmiToVgaAdapter implements Hdmi {
    private Vga vga; //Agregação

    public HdmiToVgaAdapter(Vga vga) {
        System.out.println("Conectando o adaptador VGA/HDMI..");
        this.vga = vga;
    }

    @Override
    public void setImagem(String imagem) {
        System.out.println("Convertendo a image de HDMI para VGA");
        vga.setImagem(imagem);
    }

    @Override
    public void setSom(String som) {
        System.out.println("Me desculpe, não trabalhamos com Som");
    }
}
