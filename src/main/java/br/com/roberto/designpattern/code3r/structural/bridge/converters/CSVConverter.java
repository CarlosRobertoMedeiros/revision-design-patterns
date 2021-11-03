package br.com.roberto.designpattern.code3r.structural.bridge.converters;

import br.com.roberto.designpattern.code3r.structural.bridge.colaboradores.Colaborador;

public class CSVConverter implements Converter{
    @Override
    public String getColaboradorFormatado(Colaborador colaborador) {
        return String.format("%s,%d,%.2f",
                colaborador.getNome(),colaborador.getIdade(),colaborador.getSalario());
    }
}
