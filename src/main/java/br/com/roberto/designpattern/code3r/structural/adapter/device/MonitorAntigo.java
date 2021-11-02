package br.com.roberto.designpattern.code3r.structural.adapter.device;

import br.com.roberto.designpattern.code3r.structural.adapter.interfaces.Vga;

public class MonitorAntigo implements Vga {

    @Override
    public void setImagem(String imagem) {
        System.out.println(">>> Isso é o seu Vídeo "+ imagem);

    }
}
