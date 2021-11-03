package br.com.roberto.designpattern.code3r.structural.bridge;

import br.com.roberto.designpattern.code3r.structural.bridge.colaboradores.CaraDaTi;
import br.com.roberto.designpattern.code3r.structural.bridge.colaboradores.GerenteDeProjeto;
import br.com.roberto.designpattern.code3r.structural.bridge.converters.CSVConverter;
import br.com.roberto.designpattern.code3r.structural.bridge.converters.JsonConverter;

public class Client {
    public static void main(String[] args) {
        CSVConverter csvConverter = new CSVConverter();
        JsonConverter jsonConverter = new JsonConverter();

        CaraDaTi it = new CaraDaTi("Carlos Roberto", 32, 4000d);
        GerenteDeProjeto gp = new GerenteDeProjeto("Antonio Nunes",40, 6000d);

        System.out.println(csvConverter.getColaboradorFormatado(it));
        System.out.println(jsonConverter.getColaboradorFormatado(it));

        System.out.println(csvConverter.getColaboradorFormatado(gp));
        System.out.println(jsonConverter.getColaboradorFormatado(gp));
    }
}
