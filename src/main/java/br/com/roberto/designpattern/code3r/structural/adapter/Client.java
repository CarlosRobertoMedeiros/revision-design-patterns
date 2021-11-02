package br.com.roberto.designpattern.code3r.structural.adapter;

import br.com.roberto.designpattern.code3r.structural.adapter.adapters.HdmiToMonitorAntigoAdapter;
import br.com.roberto.designpattern.code3r.structural.adapter.adapters.HdmiToVgaAdapter;
import br.com.roberto.designpattern.code3r.structural.adapter.device.Computador;
import br.com.roberto.designpattern.code3r.structural.adapter.device.MonitorAntigo;
import br.com.roberto.designpattern.code3r.structural.adapter.device.TV;
import br.com.roberto.designpattern.code3r.structural.adapter.interfaces.Hdmi;

public class Client {
    public static void main(String[] args) {
        Computador computador = new Computador();
        TV tv = new TV();
        computador.conectarPorta(tv);
        computador.enviarImagemESom("Imagem Bonita", "Rain sound");

        System.out.println("---------- Monitor -------------");
        Computador computador2 = new Computador();
        MonitorAntigo monitorAntigo = new MonitorAntigo();
        computador2.conectarPorta(new HdmiToVgaAdapter(monitorAntigo));//Object Adapter Usando + vezes
        computador2.enviarImagemESom("Imagem Bonita", "Rain sound");

        System.out.println("------ Monitor Class Adapter ----------");
        Computador computador3 = new Computador();
        HdmiToMonitorAntigoAdapter monitorAdaptee = new HdmiToMonitorAntigoAdapter();// Class Adapter
        computador3.conectarPorta(monitorAdaptee);
        computador3.enviarImagemESom("Imagem Bonita", "Rain sound");


    }
}
