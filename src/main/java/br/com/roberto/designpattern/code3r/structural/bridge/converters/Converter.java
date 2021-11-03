package br.com.roberto.designpattern.code3r.structural.bridge.converters;

import br.com.roberto.designpattern.code3r.structural.bridge.colaboradores.Colaborador;

public interface Converter {
    String getColaboradorFormatado(Colaborador colaborador);

}
