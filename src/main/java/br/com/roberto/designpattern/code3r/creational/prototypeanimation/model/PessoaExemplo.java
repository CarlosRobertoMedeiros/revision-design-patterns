package br.com.roberto.designpattern.code3r.creational.prototypeanimation.model;

import java.util.HashMap;
import java.util.Map;

public class PessoaExemplo {
    private Map<String, Pessoa> samples;

    public PessoaExemplo() {
        samples = new HashMap<>();
        loadSamples();
    }

    public Pessoa get(String type) {
        return samples.get(type);
    }

    private void loadSamples() {
        samples.put("magrinho", new Pessoa(
                "                   ",
                "        o          ",
                "       /|\\          ",
                "_______/_\\___________"
        ));
        samples.put("gordinho", new Pessoa(
                "                   ",
                "       (^ ^)          ",
                "       <)  )\\         ",
                "_______/__\\___________"
        ));
    }
}
