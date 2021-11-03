package br.com.roberto.designpattern.code3r.structural.bridge.converters;

import br.com.roberto.designpattern.code3r.structural.bridge.colaboradores.Colaborador;

public class JsonConverter implements Converter{
    @Override
    public String getColaboradorFormatado(Colaborador colaborador) {
        StringBuilder sb = new StringBuilder();

        sb.append("{\n")
                .append("\t\"name\": \"").append(colaborador.getNome()).append("\"\n")
                .append("\t\"age\": \"").append(colaborador.getIdade()).append("\"\n")
                .append("\t\"salary\": \"").append(colaborador.getSalario()).append("\"\n")
                .append("}");

        return sb.toString();


    }
}
